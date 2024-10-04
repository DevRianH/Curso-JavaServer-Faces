package br.com.rian.aula.quatro.um;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

//@Named
@SessionScoped
public class controlador implements Serializable {

    private String page;

    public enum Pages {
        page_a, page_b;
    }

    public Pages goTo() {

        if ("a".equalsIgnoreCase(page)) {
            return Pages.page_a;
        } else {
            return Pages.page_b;
        }

    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

}
