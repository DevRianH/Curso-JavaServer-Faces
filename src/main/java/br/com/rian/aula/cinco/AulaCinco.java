package br.com.rian.aula.cinco;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.Flash;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class AulaCinco implements Serializable {

    @Inject
    private Flash flash;
    private String nome;

    public String processar() {

        flash.put("nomeDoUsuario", nome);

        return "result?faces-redirect=true";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Flash getFlash() {
        return flash;
    }

    public void setFlash(Flash flash) {
        this.flash = flash;
    }

}
