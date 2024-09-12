package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

public class EducationalInstitution extends Place {
    public EducationalInstitution(String name, Address address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return String.format("Educational Institution %s", super.toString());
    }
}
