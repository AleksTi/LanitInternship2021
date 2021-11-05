package ru.yandex.sashanc.lanit;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.animals.*;
import ru.yandex.sashanc.lanit.animals.description.Animal;
import ru.yandex.sashanc.lanit.animals.description.ISwim;
import ru.yandex.sashanc.lanit.animals.description.IVoice;
import ru.yandex.sashanc.lanit.food.Grass;
import ru.yandex.sashanc.lanit.food.Meat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    protected static final Logger logger = Logger.getLogger(Zoo.class);

    public static void main(String[] args) {

        Cat cat = new Cat();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Volf volf = new Volf();

        List<Animal> animalList = new ArrayList<>(Arrays.asList(cat, duck, fish, rabbit, tiger, volf));
        List<ISwim> floatingAnimalPond = new ArrayList<>(Arrays.asList(duck, fish));
        List<IVoice> soundingAnimals = new ArrayList<>(Arrays.asList(cat, duck, tiger, volf));

        Grass grass = new Grass(10);
        Meat meat = new Meat(20);

        Worker worker = new Worker();

        for (ISwim floatingAnimal : floatingAnimalPond) {
            logger.info(floatingAnimal.swim());
        }

        for (IVoice soundingAnimal : soundingAnimals) {
            logger.info(soundingAnimal.voice());
        }

        for (Animal animal : animalList) {
            worker.feed(animal, grass);
            worker.feed(animal, meat);
            logger.info(animal.getFullness());
        }
    }
}
