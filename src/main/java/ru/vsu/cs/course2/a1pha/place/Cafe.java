package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

public class Cafe extends Place {
    public Cafe(String name, Address address) {
        super(name, address);
    }

    public void sendMenu(){}

    @Override
    public String toString() {
        return String.format("Cafe %s", super.toString());
    }
}
