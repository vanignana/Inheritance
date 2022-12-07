package Abstract;

import java.util.Random;

public class AssignInstrument {

    public static void main(String[] args) {
        AssignInstrument[] instrument = new AssignInstrument[10]; // created object

        Random r = new Random(); // will not allow the user to declare an object of Instrument class.


        for (int i = 0; i < 10; i++) {
            int randNum = r.nextInt((3 - 1) + 1) + 1;

            if (randNum == 1)
                instrument[i] = new AssignInstrument();
            else if
            (randNum == 2)
                instrument[i] = new AssignInstrument();
            else if
            (randNum == 3)
                instrument[i] = new AssignInstrument();
            
            instrument[i].getPlay();

        }
        for (int i = 0; i < 10; i++){
            if (instrument[i] instanceof AssignInstrument)
                System.out.println("Piano is stored at index  + i");
            else if (instrument[i] instanceof AssignInstrument)
                System.out.println("Guitar is stored at index " + i);
            else if (instrument[i] instanceof AssignInstrument)
                System.out.println("Flute is stored at index " + i);
        }
    }
    private void getPlay() {
    }
}
