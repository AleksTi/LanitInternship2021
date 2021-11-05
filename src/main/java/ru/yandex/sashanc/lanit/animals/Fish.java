package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Herbivore;
import ru.yandex.sashanc.lanit.animals.description.ISwim;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;

public class Fish extends Herbivore implements ISwim {

    public Fish(String idName, AviaryScale size) {
        super(idName, size);
    }

    @Override
    public String swim() {
        return "I am a Fish, I can swim!";
    }
}
