package Animals.demoAnimals.service;

import Animals.demoAnimals.model.Animals;

import java.util.List;

public interface AnimalService {
    List<Animals> findAllAnimals();

    Animals animalsId(Long id);

    Animals saveAnimals(Animals animals);


}
