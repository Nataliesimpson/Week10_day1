//telling our code tha we want to use the ArrayList Class//
import java.util.*;

public class Athlete{
 
  private String name;
  private int age;
  private String runningbuddy;
  private ArrayList<Drinkable> hydration;

public Athlete(String name, int age, String runningbuddy){
  this.name = name;
  this.age = age;
  this.runningbuddy = runningbuddy;
  this.hydration = new ArrayList<Drinkable>();
}

public String getName(){
  return this.name;
}

public int getAge(){
  return this.age;
}

public String getRunningBuddy(){
  return this.runningbuddy;
}

public int hydrationCount(){
  return hydration.size();
}

public void drink(Drinkable drinks){
  hydration.add(drinks);
}

public void run(){
  hydration.clear();
}

public int totalHydration(){
  int total = 0;

  for(Drinkable drinks : hydration){
    total += drinks.hydrationValue();
    }
  return total;
  }

}















