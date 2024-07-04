package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogDog() {
        Dog dog = new Dog();
        DogHouse.add(dog);

        Integer expected = 1;


        assertEquals(expected, DogHouse.getNumberOfDogs());


    }


    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeID() {
        Dog dog = new Dog();
        DogHouse.remove(dog.getId());

        Integer expected = 0;

        assertEquals(expected, DogHouse.getNumberOfDogs());


    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeDog() {
        Dog dog = new Dog();
        DogHouse.remove(dog);

        Integer expected = 0;

        assertEquals(expected, DogHouse.getNumberOfDogs());


    }


//    // TODO - Create tests for `Integer getNumberOfCats()`
//
//
//    @Test
//    public void getNumberofCats() {
//        Cat cat = new Cat();
//        CatHouse.getNumberOfCats();
//
//        Integer expected = 0;
//
//
//        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
//    }

    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByID() {
        Dog dog = new Dog();
        DogHouse.getDogById(0);

        Integer expected = 0;


        Assert.assertEquals(expected, dog.getId());


    }


    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberofDogs() {
        Dog dog = new Dog();
        DogHouse.getNumberOfDogs();

        Integer expected = 0;


        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }



    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
