package Animals.demoAnimals.bootstrap;

import Animals.demoAnimals.model.Animals;
import Animals.demoAnimals.repository.AnimalsInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnimalsBootstrap implements CommandLineRunner {
    private final AnimalsInterface animalsInterface;

    public AnimalsBootstrap(AnimalsInterface animalsInterface) {
        this.animalsInterface = animalsInterface;
    }

    @Override
    public void run(String... args) throws Exception {

        Animals animals1 = new Animals("Кошка", 2);
        Animals animals2 = new Animals("Собака", 10);
        Animals animals3 = new Animals("Корова", 350);
        Animals animals4 = new Animals("Лошадь", 500);
        Animals animals5 = new Animals("Баран", 35);
        animalsInterface.save(animals1);
        animalsInterface.save(animals2);
        animalsInterface.save(animals3);
        animalsInterface.save(animals4);
        animalsInterface.save(animals5);

    }}

