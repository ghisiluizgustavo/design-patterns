import br.com.designpatterns.memento.CareTaker;
import br.com.designpatterns.memento.Memento;
import br.com.designpatterns.memento.Originator;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker(originator);
        Random random = new Random();
        int upperbound = 100;

        originator.setNumber(random.nextInt(upperbound), careTaker);
        originator.setNumber(random.nextInt(upperbound), careTaker);
        originator.setNumber(random.nextInt(upperbound), careTaker);
        originator.setNumber(random.nextInt(upperbound), careTaker);
        originator.setNumber(random.nextInt(upperbound), careTaker);

        System.out.println("\n");

        int index = 0;
        for(Memento memento : careTaker.getMementos()){
            System.out.println("Element at position " + (index++) + ": " + memento.getNumber().toString());
        }

        System.out.println("\n");
        careTaker.getNumber(0);
        careTaker.getNumber(2);
        careTaker.getNumber(4);

    }
}
