package br.com.rian.aula.seis;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class AulaSeis implements Serializable {

    private String nome;

//    @PostConstruct
//    public void init() {
//        nome = "não é Rian";
//    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
