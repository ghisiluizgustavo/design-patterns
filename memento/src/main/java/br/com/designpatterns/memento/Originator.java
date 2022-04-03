package br.com.designpatterns.memento;

public class Originator {

    private Integer number;

    public Memento createMemento(){
        System.out.println("save the number = " + number.toString());
        return new Memento(number);
    }

    public void getNumber(Memento memento){
        this.number = memento.getNumber();
        System.out.println("recovered the number = " + memento.getNumber().toString());
    }

    public void setNumber(Integer number, CareTaker careTaker){
        this.number = number;
        careTaker.saveState();
    }

}
