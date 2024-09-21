package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

public class Place {
    private static long lastID = 0;

    private final long id;
    private final String name;
    private final Address address;

    public Place(final String name, final Address address) {
        this.id = lastID++;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" (place_id=%d, address=\"%s\")", name, id, address);
    }
}
