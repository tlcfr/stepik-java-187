package ru.tlcfr.stepik.java187.module_5.step_5_4_8;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class DeserializeAnimalArray {

    private DeserializeAnimalArray() {
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = in.readInt();
            Animal[] animals = new Animal[size];

            for (int i = 0; i < size; i++) {
                animals[i] = (Animal) in.readObject();
            }

            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
