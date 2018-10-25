package com.ralu.celebapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "MyDatabase";
    private static final String TAG = "MyDBTag";

    public static final String TABLE_NAME = "Celebrities";
    public static final String CELEB_ID = "ID";
    public static final String CELEB_NAME = "Name";
    public static final String CELEB_DESCRIPTION = "Description";
    public static final String CELEB_AGE = "Age";
    public static final String CELEB_JOB = "Job";
    public static final String CELEB_RES_ID = "Resource id";



    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                CELEB_ID + " INTEGER PRIMARY KEY," +
                CELEB_NAME + "TEXT," +
                CELEB_DESCRIPTION + " TEXT," +
                CELEB_AGE + " TEXT," +
                CELEB_JOB + " TEXT," +
                CELEB_RES_ID + "BIGINT" + ")";
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void saveNewCeleb(Celebrity celebrity) {

        SQLiteDatabase database = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(CELEB_ID, celebrity.getId());
        contentValues.put(CELEB_NAME, celebrity.getName());
        contentValues.put(CELEB_DESCRIPTION, celebrity.getDescription());
        contentValues.put(CELEB_AGE, celebrity.getAge());
        contentValues.put(CELEB_JOB, celebrity.getJob());
        contentValues.put(CELEB_RES_ID, celebrity.getResourceId());
        database.insert(TABLE_NAME, null, contentValues);

        Log.d(TAG, "Save new celebrity: ");
    }


    public List<Celebrity> getCelebList() {

        SQLiteDatabase database = this.getWritableDatabase();
        String query = "Select * from " + TABLE_NAME;

        Cursor cursor = database.rawQuery(query, null);
        List<Celebrity> celebList = new ArrayList<>();

        if (cursor.moveToFirst()) {
            do {
                Celebrity celebrity = new Celebrity(cursor.getInt(0), cursor.getString(1),
                        cursor.getString(2), cursor.getString(3),
                        cursor.getString(4), cursor.getInt(5));
                Log.d(TAG, celebrity.getName());
                celebList.add(celebrity);
            } while (cursor.moveToNext());
        }

        return celebList;
    }
}
