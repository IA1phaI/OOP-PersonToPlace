package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

import java.io.File;

public class Park extends Place {

    private File sights;

    public Park(final String name, final Address address, final File sights){
        super(name, address);
        this.sights = sights;
    }

    public File sendSights() {
        return sights;
    }

    @Override
    public String toString() {
        return String.format("Park %s", super.toString());
    }
}
