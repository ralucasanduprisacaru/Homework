package com.ralu.celebapp;

import java.util.ArrayList;
import java.util.List;

public class Celebrity {
    private String name, description, age, job;
    private int resourceId;
    private long id;



    public static List<Celebrity> celebrityList = new ArrayList<>();

    // populate list


    public static void initList(){

        celebrityList.add(new Celebrity(01, "Michelle Pfeiffer", "desctiption", "56", "Actress", R.drawable.michellepf));
        celebrityList.add(new Celebrity(02, "Tom Cruise", "desctiption", "56", "Actor", R.drawable.tom));
        celebrityList.add(new Celebrity(03, "Lionel Messi", "desctiption", "31", "Football player", R.drawable.messi));
        celebrityList.add(new Celebrity(04, "Freddy Mercury", "desctiption", "56", "Singer", R.drawable.freddy));
        celebrityList.add(new Celebrity(05, "Queen Elisabeth", "desctiption", "1000", "The Queen", R.drawable.queen));
    }


    public Celebrity(int id, String name, String description, String age, String job, long resourceId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.age = age;
        this.job = job;
       this.resourceId
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

    public long getResourceId() {
        return resourceId;
    }

    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
