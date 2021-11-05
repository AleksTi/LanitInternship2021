package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Herbivore;
import ru.yandex.sashanc.lanit.animals.description.ISwim;

public class Fish extends Herbivore implements ISwim {

    @Override
    public String swim() {
        return "I am a Fish, I can swim!";
    }
}
