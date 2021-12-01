package lesson18;

public class movie {
    int id;
    String name;
    String director;
    String genre;
    String category;
    int view;
    int length;

    public movie(int id, String name, String director, String genre, String category, int view, int length) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.category = category;
        this.view = view;
        this.length = length;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getView() {
        return view;
    }

    public String toString() {
        return id + " - " + name + " - " + director + " - " + genre + " - " + category + " - " + length + "m - " + view;
    }
}
