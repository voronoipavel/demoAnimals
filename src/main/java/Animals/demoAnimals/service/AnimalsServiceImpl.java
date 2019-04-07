package Animals.demoAnimals.service;

import Animals.demoAnimals.model.Animals;
import Animals.demoAnimals.repository.AnimalsInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsServiceImpl implements AnimalService {
    private final AnimalsInterface animalsInterface;

    public AnimalsServiceImpl(AnimalsInterface animalsInterface){
        this.animalsInterface = animalsInterface;
    }

    @Override
    public List<Animals> findAllAnimals() {
        return animalsInterface.findAll();
    }

    @Override
    public Animals animalsId(Long id) {
        return animalsInterface.findById(id).get();
    }

    @Override
    public Animals saveAnimals(Animals animals) {
        return animalsInterface.save(animals);
    }
}
