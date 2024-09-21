package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

import java.io.File;

public class Cafe extends Place {

    private final File menu;

    public Cafe(String name, Address address, final File menu) {
        super(name, address);
        this.menu = menu;
    }

    public File sendMenu(){
        return menu;
    }

    @Override
    public String toString() {
        return String.format("Cafe %s", super.toString());
    }
}
