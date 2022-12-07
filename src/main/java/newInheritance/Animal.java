package newInheritance;

public class Animal {
    int age;
    // protected int age; // will not be inherited for roar method
    protected String name;
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
}
