package no.dervis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static no.dervis.Record.Animal;
import static no.dervis.Record.AnimalType.*;

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
}