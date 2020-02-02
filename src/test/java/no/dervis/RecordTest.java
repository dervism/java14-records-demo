package no.dervis;

import org.junit.jupiter.api.Test;

import static no.dervis.Record.AnimalType.Fish;
import static no.dervis.Record.AnimalType.Mammal;

class RecordTest {

    @Test
    void equalRecords() {
        var elephant = new Animal("Elephant", 10, Mammal);
        var anotherElephant = new Animal("Elephant", 10, Mammal);

        assertEquals(elephant, anotherElephant);
    }

    @Test
    void notEqualRecords() {
        var elephant = new Animal("Elephant", 10, Mammal);
        var fish = new Animal("Salmon", 10, Fish);

        assertNotEquals(elephant, fish);
    }

    @Test
    void propertiesEquals() {
        var elephant = new Animal("Elephant", 10, Mammal);

        assertEquals(elephant.name(), "Elephant");
        assertEquals(elephant.age(), 10);
        assertEquals(elephant.type(), Mammal);
    }
}