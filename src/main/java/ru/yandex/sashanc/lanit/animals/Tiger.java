package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Carnivorous;
import ru.yandex.sashanc.lanit.animals.description.IRun;
import ru.yandex.sashanc.lanit.animals.description.IVoice;

public class Tiger extends Carnivorous implements IVoice, IRun {

    @Override
    public String run() {
        return "I am Tiger, I run with speed 50 km/h";
    }

    @Override
    public String voice() {
        return "I am Tiger, I made a sound RRR";
    }
}
