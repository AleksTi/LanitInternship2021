package ru.yandex.sashanc.lanit.aviary;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.animals.description.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private static final Logger logger = Logger.getLogger(Aviary.class);

    private final Map<String, T> animals;
    private final AviaryScale aviarySize;

    public Aviary(AviaryScale aviarySize) {
        this.animals = new HashMap<>();
        this.aviarySize = aviarySize;
    }

    public void addAnimal(T animal) {
        if (aviarySize == animal.getSize()) {
            animals.put(animal.getIdName(), animal);
            logger.info("Animal " + animal.getIdName() + " is added");
            return;
        }
        logger.info("Animal " + animal.getIdName() + " is NOT added because the size of the animal does not match the size of the aviary");
    }

    public void deleteAnimal(T animal) {
        if (animals.remove(animal.getIdName(), animal)) {
            logger.info("Animal is removed");
            return;
        }
        logger.info("Animal is NOT removed because the animal is NOT found");
    }

    public T getAnimal(String idName){
        if(animals.containsKey(idName)){
            return animals.get(idName);
        }
        return null;
    }
}
