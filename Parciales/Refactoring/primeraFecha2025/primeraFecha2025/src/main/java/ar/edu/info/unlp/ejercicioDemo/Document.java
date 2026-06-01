package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Document {
    private String title;
    private List<String> authors;
    private String subtitle; // Usado en el bloque XLS para el sheetName

    public Document(String title) {
        this.title = title;
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }

    public String getTitle() { return title; }
    public List<String> getAuthors() { return authors; }
    public String getSubtitle() { return subtitle; }
}
