package constructor;

//Creating Constructor
//Constructor Overloading
//Instantiation
// this reference in constructor

public class Bunny {
    String name;
    int age;

    public Bunny(int age, String name){
        this(15);
        this.name = "Pink";

    }
    public Bunny(String name){
        new Bunny("White");
    }
    public Bunny(long height){
        new Bunny(121323242);
    }
    public Bunny(Boolean pet){
        new Bunny(true);
    }



}
