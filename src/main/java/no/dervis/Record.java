package no.dervis;

public class Record {

    public sealed interface Type permits Animal, Person  { }

    public enum AnimalType { Mammal, Bird, Fish }

    public static record Animal(String name, int age, AnimalType type) implements Type {}
    public static record Person(String name, int age) implements Type {}

    // doesnt compile since it's not allowed in the sealed hierarchy
    // public static record Car(String name, int age) implements Type {}

    public Type getType(Type t) {
        return switch (t.getClass().getSimpleName()) {
            case "Animal" -> t;
            case "Person" -> t;
            default -> null;
        };
    }

}
