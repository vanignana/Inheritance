package methodOverriding;

public class Kangaroo extends Marsupial{
    @Override // in method overriding both parent child have same method signatures. Rule 1.
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }

    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight());
        System.out.println(new Kangaroo().getAverageWeight());
    }
}
