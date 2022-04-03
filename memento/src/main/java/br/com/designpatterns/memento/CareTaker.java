package br.com.designpatterns.memento;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Getter
@ToString
public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();
    private Originator originator;

    public CareTaker(Originator originator){
        this.originator = originator;
    }

    public void saveState(){
        mementos.add(originator.createMemento());
    }

    public void getNumber(Integer index){
        originator.getNumber(mementos.get(index));
    }
}
