package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

public class Park extends Place {

    public Park(final String name, final Address address){
        super(name, address);
    }

    @Override
    public String toString() {
        return String.format("Park %s", super.toString());
    }
}
