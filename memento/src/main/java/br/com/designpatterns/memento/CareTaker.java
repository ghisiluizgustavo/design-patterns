package br.com.designpatterns.memento;

import lombok.Getter;
import lombok.ToString;

import java.util.Stack;

@Getter
@ToString
public class CareTaker {

    private Stack<Memento> mementos = new Stack<>();
    private Originator originator;

    public CareTaker(Originator originator){
        this.originator = originator;
    }

    public void saveState(){
        mementos.push(originator.createMemento());
    }

    public void undo(){
        originator.setMemento(mementos.pop());
    }
}
