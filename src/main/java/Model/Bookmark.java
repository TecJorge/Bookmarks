package Model;

import java.util.ArrayList;
import java.util.List;

public class Bookmark {
    private String nome;
    private List<String> url;
    private List<String> tag;

    public Bookmark(String nome) {
        this.nome=nome;
        url = new ArrayList<>();
        tag = new ArrayList<>();
    }

    public List<String> getUrl() {
        return url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return
        String.format("Bookmark: %s\nUrl´s:\n%s\nTag´s:\n%s\n",nome,url,tag);
    }
    
}
