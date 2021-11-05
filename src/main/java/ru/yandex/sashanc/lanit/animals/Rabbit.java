package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Herbivore;
import ru.yandex.sashanc.lanit.animals.description.IRun;

public class Rabbit extends Herbivore implements IRun {

    @Override
    public String run() {
        return "I am a Rabbit, I run with speed 40 km/h";
    }
}
