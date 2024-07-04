package rocks.zipcodewilmington;
import java.util.Date;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void  animalNameTestDog(){
        AnimalFactory animalFactory = new AnimalFactory();
        Dog dog = new Dog();
        Date birthdateForBryan = new Date();
        String name = "Bryan";

        Dog Bryan = animalFactory.createDog(name, birthdateForBryan);

        assertEquals(name, Bryan.getName());
        assertEquals(birthdateForBryan, Bryan.getBirthDate());










    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void  animalNameTestCat(){
        AnimalFactory animalFactory = new AnimalFactory();
        Cat cat = new Cat();
        Date birthdateForJared = new Date();
        String name = "Jared";

        Cat Jared = animalFactory.createCat(name, birthdateForJared);

        assertEquals(name, Jared.getName());
        assertEquals(birthdateForJared, Jared.getBirthDate());










    }

















}
