package Animals.demoAnimals.controller;

import Animals.demoAnimals.model.Animals;
import Animals.demoAnimals.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AnimalsController.URLANIMALS)
public class AnimalsController {
    public static final String URLANIMALS = "/api/v1/animal";

    private final AnimalService animalService;

    public AnimalsController(AnimalService animalService){
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animals> getAnimals(){
        return animalService.findAllAnimals();
    }

    @GetMapping("/{id}")
    public Animals getAnimalsById(@PathVariable Long id){
        return animalService.animalsId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Animals saveAnimals(@RequestBody Animals animals){
        return animalService.saveAnimals(animals);
    }
}
