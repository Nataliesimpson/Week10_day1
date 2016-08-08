public class Athlete{
  //instance variables//
  //Defining instance variables as private protects against unwanted access from outside// //We define all instance variables as private and create public getters and setters when needed to access from somewhere else//
  private String name;
  private int age;
  private String runningbuddy;
  //we declare the type of things that go into the array, then [], then the name of the array variable//
  //only water can go into this array//
  private Water[] hydration;


//constructor function - in Java we define a constructor function by writing a method with the same name as the class (like initialize in Ruby)//
//public allows this method to be accessed outside of the object//
//Getter - we define the type of what a method returns i.e String//
public Athlete(String name, int age, String runningbuddy){
  this.name = name;
  this.age = age;
  this.runningbuddy = runningbuddy;
  //we give the array a size, this is populated with the specified number of null values and can't be exceeded i.e. 10 in this case//
  this.hydration = new Water[10];
}

//setter//
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
  int count = 0;

  //looping over hydration collection//
  for (Water water : hydration){
    //we only want to count entries which are not null//
    if (water != null){
      //we are adding all values that are not null only//
      count++;
    }
  }
  return count;
}

//can only add an item to an array in Java by using an index position//
//in order to be able to add more than one item, we have to use a counter so we know where the next water should be added//
//we already have a counter in our hydrationCount method//

public void drink(Water water){
  if (hydrationMax()){
    return;
  }
  int hydrationCount = hydrationCount();
  hydration[hydrationCount] = water;
}

public boolean hydrationMax(){
  //adding a guard for when hydration is at max//
  return hydrationCount() == hydration.length;
}

public void run(){
  for(int i = 0; i < hydration.length; i++){
    hydration[i] = null;
  }  
}

}















