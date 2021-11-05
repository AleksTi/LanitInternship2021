package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Carnivorous;
import ru.yandex.sashanc.lanit.animals.description.IRun;
import ru.yandex.sashanc.lanit.animals.description.IVoice;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;

public class Cat extends Carnivorous implements IVoice, IRun {

    public Cat(String idName, AviaryScale size) {
        super(idName, size);
    }

    @Override
    public String run() {
        return "I am Cat, I run with speed 50 km/h";
    }

    @Override
    public String voice() {
        return "I am Cat, I made a sound Meow";
    }





}
