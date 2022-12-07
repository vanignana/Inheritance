package SingleInheritance;

public class Car extends Vehicle{
    public void setProperties(int wheels, String n){
    setWheels(wheels);
    name = n;
        System.out.println(wheels +" , "+name);
    }
//    public void make(){
//        System.out.println(wheels +" , "+name);
//    }

    public static void main(String[] args) {

        var Car = new Car();
        Car.setProperties(4,"BMW");
        //Car.make();

    }
}
