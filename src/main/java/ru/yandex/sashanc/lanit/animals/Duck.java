package ru.yandex.sashanc.lanit.animals;

import ru.yandex.sashanc.lanit.animals.description.Herbivore;
import ru.yandex.sashanc.lanit.animals.description.IFly;
import ru.yandex.sashanc.lanit.animals.description.ISwim;
import ru.yandex.sashanc.lanit.animals.description.IVoice;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;

public class Duck extends Herbivore implements IVoice, ISwim, IFly {

    public Duck(String idName, AviaryScale size) {
        super(idName, size);
    }

    @Override
    public String fly() {
        return "I am a Duck, I can fly!";
    }

    @Override
    public String swim() {
        return "I am a Duck, I can swim!";
    }

    @Override
    public String voice() {
        return "I am a Duck, I made a sound Buck-buck";
    }


}
