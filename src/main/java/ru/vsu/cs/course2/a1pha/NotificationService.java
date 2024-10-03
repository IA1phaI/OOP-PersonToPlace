package ru.vsu.cs.course2.a1pha;

import java.io.File;
import java.util.Collection;
import java.util.List;

public class NotificationService {

  public static <T extends Collection<Person>> void send(File file, T persons) {}
}
