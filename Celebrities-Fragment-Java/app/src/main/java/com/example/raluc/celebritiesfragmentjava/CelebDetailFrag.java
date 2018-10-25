package com.example.raluc.celebritiesfragmentjava;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class CelebDetailFrag extends Fragment {
    private long id;


    private OnFragmentInteractionListener mListener;

    public CelebDetailFrag() {
        // Required empty public constructor
    }


    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        Celebrities celeb = Celebrities.celebList[(int) id];

        ImageView imageView = view.findViewById(R.id.celebImage);
        TextView celebName = (TextView) view.findViewById(R.id.tvName);
        TextView celebDescription = (TextView) view.findViewById(R.id.tvDescription);
        TextView celebAge = (TextView) view.findViewById(R.id.tvAge);
        TextView celebJob = (TextView) view.findViewById(R.id.tvJob);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_celeb_detail, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }





    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
