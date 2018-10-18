package com.ralu.week3daily2;

import java.util.ArrayList;
import java.util.List;

public class Celebrity {
    private String name, description, age, job;
    private int resourceId;

    public static List<Celebrity> celebrityList = new ArrayList<Celebrity>();


    public void initData(){
        celebrityList.add(new Celebrity("Michelle Pfeiffer", "desctiption", "56", "Actress", R.drawable.michellepf));
        celebrityList.add(new Celebrity("Tom Cruise", "desctiption", "56", "Actor", R.drawable.tom));
        celebrityList.add(new Celebrity("Lionel Messi", "desctiption", "31", "Football player", R.drawable.messi));
        celebrityList.add(new Celebrity("Freddy Mercury", "desctiption", "56", "Singer", R.drawable.freddy));
        celebrityList.add(new Celebrity("Queen Elisabeth", "desctiption", "1000", "The Queen", R.drawable.queen));
    }




    public Celebrity(String name, String description, String age, String job, int resourceId) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.job = job;
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
