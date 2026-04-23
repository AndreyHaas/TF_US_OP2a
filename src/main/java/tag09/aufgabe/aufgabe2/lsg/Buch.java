package tag09.aufgabe.aufgabe2.lsg;

public class Buch {
    private String titel;
    private String autor;
    private String isbn;

    public Buch(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
