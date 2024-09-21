package ru.vsu.cs.course2.a1pha.place;

import ru.vsu.cs.course2.a1pha.Address;
import ru.vsu.cs.course2.a1pha.NotificationService;
import ru.vsu.cs.course2.a1pha.Person;

import java.io.File;
import java.util.List;

public class Park extends Place {

    private File sights;

    public Park(final String name, final Address address, final File sights){
        super(name, address);
        this.sights = sights;
    }

    public void sendSights(List<Person> persons) {
        NotificationService.sendNotification(sights, persons);
        System.out.printf("Sights to visit are sent to all persons in %s\n", this);
    }

    @Override
    public String toString() {
        return String.format("Park %s", super.toString());
    }
}
