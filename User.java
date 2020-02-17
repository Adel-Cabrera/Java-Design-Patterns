public class User {
  public String name;
  public int age;

  // Constructor

  public User(String name, int age){
    this.name = name;
    this.age = age;

  }

  // Methods

  public void sayHello(){
    System.out.println("Hi, my name is " + this.name + " and I have " + this.age + " years old");
  }

}