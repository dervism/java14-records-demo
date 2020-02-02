package no.dervis;

public class Record {

    public static enum AnimalType { Mammal, Bird, Fish }

    public static record Animal(String name, int age, AnimalType type) {}

}
