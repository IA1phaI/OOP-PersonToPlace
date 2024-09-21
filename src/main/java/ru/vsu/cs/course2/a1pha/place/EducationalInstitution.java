package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;

import java.io.File;
import java.util.List;

public class EducationalInstitution extends Place {

    private final List<File> facultyOffers;

    public EducationalInstitution(final String name, final Address address, final List<File> facultyOffers) {
        super(name, address);
        this.facultyOffers = facultyOffers;
    }

    public List<File> sendTrainingOffer(){
        return facultyOffers;
    }

    @Override
    public String toString() {
        return String.format("Educational Institution %s", super.toString());
    }
}
