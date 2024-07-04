package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test

    public void dogTest(){

        Dog dog = new Dog();

        dog.setName("Snoop");



        assertEquals("Snoop", dog.getName());
    }

    @Test
    public void birthDateTest(){
        Dog Snoop = new Dog();
        Date expectedBirthDate = new Date();
        Snoop.setBirthDate(expectedBirthDate);
        Date actualbirthDate = Snoop.getBirthDate();


        assertEquals(expectedBirthDate, Snoop.getBirthDate());

    }

    @Test
    public void idTest(){
        Dog Snoop = new Dog();
        Snoop.getId();
        int expected = Snoop.getId();

        Assert.assertEquals(expected, 0);
    }


    // TODO - Create tests for `speak`

    @Test
    public void speakTest(){
        Dog Snoop = new Dog();
        String actual = "bark!";
        String expected = Snoop.speak();



        assertEquals("bark!", Snoop.speak());

    }



    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDay(){
        Dog Snoop = new Dog();
        Date expectedBirthDate = new Date();
        Snoop.setBirthDate(expectedBirthDate);
        Date actualbirthDate = Snoop.getBirthDate();


        assertEquals(expectedBirthDate, Snoop.getBirthDate());
    }


    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest(){
        Dog Snoop = new Dog();
        Snoop.eat(new Food("Fries"));
        Integer expected = 1;

        Assert.assertEquals(expected, Snoop.getNumberOfMealsEaten());

    }


    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalInheritance(){
        Dog Snoop = new Dog();

        assertTrue(Snoop instanceof Animal);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void checkMammalInheritance(){
        Dog Snoop = new Dog();

        assertTrue(Snoop instanceof Mammal);

    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
