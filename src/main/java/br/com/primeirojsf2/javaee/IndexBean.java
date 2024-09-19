
package br.com.primeirojsf2.javaee;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;


@Named("bean")
@RequestScoped
public class IndexBean implements Serializable {
    
    public String getMensagem(){
        return "Esta é uma mensagem vinda da classe IndexBean!";
    }
    
}
