package br.com.designpatterns.memento;

import br.com.designpatterns.model.User;

public class Originator {

    private User user;

    public Memento createMemento(){
        System.out.println("save the user = " + user.toString());
        return new Memento(user);
    }

    public void setMemento(Memento memento){
        this.user = memento.getUser();
        System.out.println("recovered the user = " + memento.getUser().toString());
    }

    public void addUserAndPassword(User user){
        this.user = user;
    }

}
