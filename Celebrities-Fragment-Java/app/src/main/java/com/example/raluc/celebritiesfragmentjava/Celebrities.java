package com.example.raluc.celebritiesfragmentjava;

public class Celebrities {

    private String name, description, age, job;
    private int resourceId;
    private long id;

    public static final Celebrities[] celebList = {
            new Celebrities("Michelle Pfeiffer",
                    "Michelle Pfeiffer was born in Santa Ana, California, to Donna Jean (Taverna) and Richard Pfeiffer," +
                            " a heating and air-conditioning contractor. She has an older brother and two younger sisters - Dedee Pfeiffer" +
                            " and Lori Pfeiffer, who both dabbled in acting and modeling but decided against making it their life's work. ",
                    "56", "Actress", R.drawable.michelle, 1),

            new Celebrities("Tom Cruise",
                    "In 1976, if you had told fourteen year-old Franciscan seminary student Thomas Cruise Mapother IV that one day" +
                            " in the not too distant future he would be Tom Cruise, one of the top 100 movie stars of all time, " +
                            "he would have probably grinned and told you that his ambition was to join the priesthood.  ",
                    "52", "Actor", R.drawable.tom, 2),

            new Celebrities("Lionel Messi",
                    "In 1976, if you had told fourteen year-old Franciscan seminary student Thomas Cruise Mapother IV that one day" +
                            " in the not too distant future he would be Tom Cruise, one of the top 100 movie stars of all time, " +
                            "he would have probably grinned and told you that his ambition was to join the priesthood.  ",
                    "31", "Actor", R.drawable.messi, 3),

            new Celebrities("Queen Elisabeth",
                    "The Queen has ruled for longer than any other Monarch in British history, becoming a much loved and respected " +
                            "figure across the globe. Her extraordinary reign has seen her travel more widely than any other monarch, " +
                            "undertaking many historic overseas visits. Known for her sense of duty and her devotion to a life of service, " +
                            "she has been an important figurehead for the UK and the Commonwealth during times of enormous social change.  ",
                    "1000", "well .. Queen", R.drawable.queen, 4)
    };


    public Celebrities(String name, String description, String age, String job, int resourceId, long id) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.job = job;
        this.resourceId = resourceId;
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

