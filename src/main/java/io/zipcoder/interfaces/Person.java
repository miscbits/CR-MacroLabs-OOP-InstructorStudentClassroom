package io.zipcoder.interfaces;

public class Person {
    public final long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }


}
