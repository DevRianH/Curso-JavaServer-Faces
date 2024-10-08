package br.com.primeirojsf2.javaee;

import br.com.rian.aula.quatro.dois.Linguagem;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("cadastro")
@RequestScoped
public class CadastroBean implements Serializable {

    private String nome;
    private String email;
    private String senha1;
    private String senha2;
    private String sexo;
    private boolean receberEmail;
    private String observacoes;
    private Integer[] linguagens;

    public Linguagem[] getListaLinguagens() {
        return Linguagem.LINGUAGENS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha1) {
        this.senha1 = senha1;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Integer[] getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(Integer[] linguagens) {
        this.linguagens = linguagens;
    }

    public String getLinguagensAsString() {
        String str = "";
        boolean first = true;
        for (Integer linguagem : linguagens) {
            if (!first) {
                str += ", ";
            }
            str += linguagem;
            first = false;
        }
        return str;
    }

}
