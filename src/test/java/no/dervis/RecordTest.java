package no.dervis;

import no.dervis.Record.Animal;
import org.junit.jupiter.api.Test;

import static no.dervis.Record.AnimalType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        var elephant = new Animal("Sparrow", 1, Bird);

        assertEquals(elephant.name(), "Sparrow");
        assertEquals(elephant.age(), 1);
        assertEquals(elephant.type(), Bird);
    }
}