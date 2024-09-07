package ru.vsu.cs.course2.a1pha;

public class Place {
    private static long lastID = 0;
    private long id;
    private String name;

    public Place(String name) {
        this.id = lastID++;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Place \"%s\" (place_id=%d)", name, id);
    }
}
