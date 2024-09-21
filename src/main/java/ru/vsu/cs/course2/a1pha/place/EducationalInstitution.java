package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

import java.io.File;
import java.util.List;

public class EducationalInstitution extends Place {

    private final File facultyOffers;

    public EducationalInstitution(final String name, final Address address, final File facultyOffers) {
        super(name, address);
        this.facultyOffers = facultyOffers;
    }

    public void sendTrainingOffer(List<Person> persons){
        NotificationService.sendNotification(facultyOffers, persons);
        System.out.printf("Training offers sent to users in %s\n", this);
    }

    @Override
    public String toString() {
        return String.format("Educational Institution %s", super.toString());
    }
}
