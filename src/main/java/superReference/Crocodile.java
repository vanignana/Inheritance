package superReference;

// Super reference/keyword to call variable/method of superclass from subclass

public class Crocodile extends Reptile {
    int speed = 30;

    public int getSpeed() {
        return super.speed;
    }

    public Crocodile(int legs){
        super(legs);

    }
    public Crocodile(){
       //this(4); //this reference
        super(0); // Super reference
    }

    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed());
        System.out.println(croc.legs);
    }
}

