package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Herbivore;
import ru.yandex.sashanc.lanit.animals.description.IRun;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;

public class Rabbit extends Herbivore implements IRun {

    public Rabbit(String idName, AviaryScale size) {
        super(idName, size);
    }

    @Override
    public String run() {
        return "I am a Rabbit, I run with speed 40 km/h";
    }
}
