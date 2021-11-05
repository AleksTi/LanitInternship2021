package ru.yandex.sashanc.lanit;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.animals.*;
import ru.yandex.sashanc.lanit.animals.description.*;
import ru.yandex.sashanc.lanit.aviary.Aviary;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;
import ru.yandex.sashanc.lanit.food.Grass;
import ru.yandex.sashanc.lanit.food.Meat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    protected static final Logger logger = Logger.getLogger(Zoo.class);

    public static void main(String[] args) {

        Cat cat = new Cat("Murzik", AviaryScale.SMALL);
        Duck duck = new Duck("Donald", AviaryScale.SMALL);
        Fish fish = new Fish("Nemo", AviaryScale.MINI);
        Rabbit rabbit = new Rabbit("Rodger", AviaryScale.MEDIUM);
        Tiger tiger = new Tiger("Amur", AviaryScale.LARGE);
        Volf volf = new Volf("Black", AviaryScale.LARGE);

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


        try {
            for (Animal animal : animalList) {
                worker.feed(animal, grass);
                worker.feed(animal, meat);
                logger.info(animal.getFullness());
            }
        } catch (WrongFoodException e) {
            logger.warn("WrongFoodException is occurred", e);
        }


        //java-homework-3
        logger.info("================ java-homework-3 ================");
        Aviary<Carnivorous> carnivorousAviary1 = new Aviary<>(AviaryScale.LARGE);
        Aviary<Carnivorous> carnivorousAviary2 = new Aviary<>(AviaryScale.SMALL);
        Aviary<Herbivore> herbivoreAviary1 = new Aviary<>(AviaryScale.SMALL);
        Aviary<Herbivore> herbivoreAviary2 = new Aviary<>(AviaryScale.MEDIUM);


        for (Animal animal : animalList){
            if(animal instanceof Carnivorous){
                carnivorousAviary1.addAnimal((Carnivorous) animal);
                carnivorousAviary2.addAnimal((Carnivorous) animal);
            }
            if(animal instanceof Herbivore){
                herbivoreAviary1.addAnimal((Herbivore) animal);
                herbivoreAviary2.addAnimal((Herbivore) animal);
            }
        }

        if(carnivorousAviary1.getAnimal("Amur") != null){
            logger.info(carnivorousAviary1.getAnimal("Amur").getSize());
        }
        carnivorousAviary1.deleteAnimal(tiger);
        if(carnivorousAviary1.getAnimal("Amur") != null){
            logger.info(carnivorousAviary1.getAnimal("Amur").getSize());
        }
    }
}
