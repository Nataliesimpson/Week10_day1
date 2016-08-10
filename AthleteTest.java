import static org.junit.Assert.assertEquals;
import org.junit.*;

public class AthleteTest{
  Athlete athlete;
  Water water;
  SportsDrink sportsDrink;

  @Before
  public void before(){
    athlete = new Athlete("Nat", 30, "Frank");
    water = new Water();
    sportsDrink = new SportsDrink();
  }

  @Test
  public void hasName(){
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
  public void canDrink(){
    athlete.drink(water);
    athlete.drink(sportsDrink);
    assertEquals(2, athlete.hydrationCount() );
  }
  
  @Test
  public void hydrationShouldBeEmptyAfterRun(){
    athlete.drink(water);
    athlete.drink(sportsDrink);
    assertEquals(2, athlete.hydrationCount());
    athlete.run();
    assertEquals(0, athlete.hydrationCount());
  }

  @Test 
  public void totalHydration(){
  athlete.drink(water);
  athlete.drink(sportsDrink);
  assertEquals(5, athlete.totalHydration() );
  }


}



