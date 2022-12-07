public class Flamingo {

    // this reference or Keyword

    String color = null;
    int legs = 4;
//    public void setColor(String color){
//        this.color=color;//if instance variable and method parameter is same then we use this reference/keyword
//    }
//    public void setLegs(int legs){
//        this.legs=legs;
//    }
    public void setProperties(String color, int legs){
        this.color=color;
        this.legs=legs;
    }

    public static void main(String[] args) {
        var f = new Flamingo();
//        f.setColor("Pink");
//        f.setLegs(2);
        f.setProperties("Pink",2);

        System.out.println(f.color);
        System.out.println(f.legs);

    }
}
