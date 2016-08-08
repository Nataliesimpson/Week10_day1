//import the junit testing package & AssertEquals function//
import static org.junit.Assert.assertEquals;
import org.junit.*;

//convention to name test file the class name + 'Test'//
public class AthleteTest{
  //declaring it for use across the entire file - like instance variable in Ruby//
  Athlete athlete;
  Water water;

  //@Before is a setup in Java, it signals JUnit to run a piece of code before easch test//
  @Before
  public void before(){
    //new-ing up//
    athlete = new Athlete("Nat", 30, "Frank");
    water = new Water();
  }

  //@Test tells JUnit to run the following function as a test//
  @Test
  public void hasName(){
    //assertEquals compares the expected value with the result of something//
    assertEquals("Nat", athlete.getName() );
  }

  @Test
  public void hasAge(){
    assertEquals(30, athlete.getAge() );
  }

  @Test
  public void hasRunningBuddy(){
    assertEquals("Frank", athlete.getRunningBuddy() );
  }

  @Test
  public void hydrationStartsAtZero(){
    assertEquals(0, athlete.hydrationCount() );
  }

  @Test 
  public void canDrinkWater(){
    athlete.drink(water);
    assertEquals(1, athlete.hydrationCount() );
  }

  @Test
  public void canNotDrinkWaterWhenHydrationMax(){
    //this loop tries to add 20 water to the hydration//
    for(int i = 0; i < 20; i++){
      athlete.drink(water);
    }
    assertEquals(10, athlete.hydrationCount());
  }

  @Test
  public void hydrationIsMax(){
    for(int i = 0; i < 10; i++){
      athlete.drink(water);
    }
  assertEquals(true, athlete.hydrationMax());
  }
  
  @Test
  public void hydrationShouldBeEmptyAfterRun(){
    athlete.drink(water);
    assertEquals(1, athlete.hydrationCount());
    athlete.run();
    assertEquals(0, athlete.hydrationCount());
  }


}



