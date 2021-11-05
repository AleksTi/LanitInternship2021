package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Carnivorous;
import ru.yandex.sashanc.lanit.animals.description.IRun;
import ru.yandex.sashanc.lanit.animals.description.IVoice;

public class Volf extends Carnivorous implements IVoice, IRun {

    @Override
    public String run() {
        return "I am wolf, I run with speed 30 km/h ";
    }

    @Override
    public String voice() {
        return "I am wolf, I made a sound RRR";
    }
}
