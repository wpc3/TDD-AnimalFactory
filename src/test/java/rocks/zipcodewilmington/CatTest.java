package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest() {

        Cat cat = new Cat();
        cat.setName("Willy");

//        cat.setName();

        assertEquals("Willy", cat.getName());

    }





    // TODO - Create tests for `speak`


    @Test
    public void speakTest(){

        Cat Willy = new Cat();
        String actual = "Woof";
        String expected = Willy.speak();



    assertEquals("Woof", Willy.speak());




    }




    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDate() {
        Cat Willy = new Cat();
        Date expectedBirthDate = new Date();
        Willy.setBirthDate(expectedBirthDate);
        Date actualbirthDate = Willy.getBirthDate();


        assertEquals(expectedBirthDate, Willy.getBirthDate());
    }


    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatFoodTest() {
        Cat Willy = new Cat();

        Willy.eat(new Food("Fries"));
        Integer expected = 1;

        Assert.assertEquals(expected, Willy.getNumberOfMealsEaten());
    }






    // TODO - Create tests for `Integer getId()`

    @Test

    public void getIDTest() {
        Cat Willy = new Cat();
        Willy.getId();
        int expected = Willy.getId();

        Assert.assertEquals(expected, 0);

    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void animalInheritanceTest() {
        Cat Willy = new Cat();

        assertTrue(Willy instanceof Animal);

    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void mammalInheritanceTest(){
        Cat Willy = new Cat();

        assertTrue(Willy instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

}
