package newInheritance;

public class Lion extends Animal {
    protected void setProperties(int age, String n){
        setAge(age);
        name = n;
    }
    public void roar(){
        System.out.println(name + " , age" + getAge() + " , says Roar");
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        var Lion = new Lion();
        Lion.setProperties(3,"King");
        Lion.roar();
    }
}
