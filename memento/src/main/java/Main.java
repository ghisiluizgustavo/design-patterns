import br.com.designpatterns.memento.CareTaker;
import br.com.designpatterns.memento.Memento;
import br.com.designpatterns.memento.Originator;
import br.com.designpatterns.model.User;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker(originator);

        originator.addUserAndPassword(new User("luiz", "123"));
        careTaker.saveState();
        originator.addUserAndPassword(new User("janna", "321"));
        careTaker.saveState();
        originator.addUserAndPassword(new User("david", "!@#"));
        careTaker.saveState();
        originator.addUserAndPassword(new User("artur", "%¨&"));
        for(Memento memento : careTaker.getMementos()){
            System.out.println(memento.getUser().toString());
        }
        careTaker.undo();
        careTaker.undo();
        careTaker.undo();

    }
}
