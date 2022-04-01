package br.com.designpatterns.memento;

import br.com.designpatterns.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Memento {

    public Memento(User user) {
        this.user = user;
    }

    private User user;
    private String sla;

}
