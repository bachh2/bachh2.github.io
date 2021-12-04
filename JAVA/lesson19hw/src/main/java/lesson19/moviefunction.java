package lesson19;

import java.util.ArrayList;

public class moviefunction extends Thread {
 
    public static void menu() {
       
        moviefunction thread = new moviefunction();
        thread.run();
        thread.run2();
        thread.run3();
        thread.run4();

    }

      
    public void run() {
        
        ArrayList<movie> movielist = new ArrayList<movie>();
        movielist.add(new movie(1, "Citizen Kane", "Orson Welles", "Drama", "Movie", 82653, 119));
        movielist.add(
                new movie(2, "Parasite", "Bong Joon-ho", "Drama, Comedy, Mystery & Thriller", "Movie", 112093, 132));
        movielist.add(new movie(3, "Come and See ", "Elem Klimov", "Drama", "Movie", 72653, 142));
        movielist.add(new movie(4, "The Irishman", "Martin Scorsese", "Drama, Crime", "Movie", 100653, 209));
        movielist.add(new movie(5, "The Godfather", "Francis Ford Coppola", "Drama, Crime", "Movie", 142653, 177));
        movielist
                .add(new movie(6, "Spider-Man: Into the Spider-Verse ", "Bob Persichetti, Peter Ramsey, Rodney Rothman",
                        "Comedy, Kids & Family, Action, Animation, Adventure, Fantasy", "Movie", 102653, 117));
        movielist.add(new movie(7, "1917", "Sam Mendes", "Drama, War, History", "Movie", 99653, 119));
        movielist.add(new movie(8, "Arcane: League of Legends", "Netflix", "Adventure, Fantasy, Animation", "TV Show",
                122653, 41));
        movielist.add(new movie(9, "Monster", "Masayuki Kojima, Ryôsuke Nakamura", "Dramam, Crime, Animation",
                "TV Show", 182653, 24));
        movielist.add(new movie(10, "Band of Brothers",
                "David Frankel, Mikael Salomon, Tom Hanks, David Leland, Richard Loncraine, David Nutter, Phil Alden Robinson, Tony To",
                "Drama, War, History", "TV Show", 282653, 594));
        System.out.println("Danh sách các phim: ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        movielist.stream().forEach(movie -> System.out.println(movie));

    }

    public void run2() {
  
        ArrayList<movie> movielist = new ArrayList<movie>();
        movielist.add(new movie(1, "Citizen Kane", "Orson Welles", "Drama", "Movie", 82653, 119));
        movielist.add(
                new movie(2, "Parasite", "Bong Joon-ho", "Drama, Comedy, Mystery & Thriller", "Movie", 112093, 132));
        movielist.add(new movie(3, "Come and See ", "Elem Klimov", "Drama", "Movie", 72653, 142));
        movielist.add(new movie(4, "The Irishman", "Martin Scorsese", "Drama, Crime", "Movie", 100653, 209));
        movielist.add(new movie(5, "The Godfather", "Francis Ford Coppola", "Drama, Crime", "Movie", 142653, 177));
        movielist
                .add(new movie(6, "Spider-Man: Into the Spider-Verse ", "Bob Persichetti, Peter Ramsey, Rodney Rothman",
                        "Comedy, Kids & Family, Action, Animation, Adventure, Fantasy", "Movie", 102653, 117));
        movielist.add(new movie(7, "1917", "Sam Mendes", "Drama, War, History", "Movie", 99653, 119));
        movielist.add(new movie(8, "Arcane: League of Legends", "Netflix", "Adventure, Fantasy, Animation", "TV Show",
                122653, 41));
        movielist.add(new movie(9, "Monster", "Masayuki Kojima, Ryôsuke Nakamura", "Dramam, Crime, Animation",
                "TV Show", 182653, 24));
        movielist.add(new movie(10, "Band of Brothers",
                "David Frankel, Mikael Salomon, Tom Hanks, David Leland, Richard Loncraine, David Nutter, Phil Alden Robinson, Tony To",
                "Drama, War, History", "TV Show", 282653, 594));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Danh sách 3 phim nhiều lượt xem nhất: ");

        movielist.stream().sorted((o1, o2) -> o2.getView() - o1.getView()).limit(3)
                .forEach(
                        movie -> System.out
                                .println(movie));
    }

    public void run3() {
        
        ArrayList<movie> movielist = new ArrayList<movie>();
        movielist.add(new movie(1, "Citizen Kane", "Orson Welles", "Drama", "Movie", 82653, 119));
        movielist.add(
                new movie(2, "Parasite", "Bong Joon-ho", "Drama, Comedy, Mystery & Thriller", "Movie", 112093, 132));
        movielist.add(new movie(3, "Come and See ", "Elem Klimov", "Drama", "Movie", 72653, 142));
        movielist.add(new movie(4, "The Irishman", "Martin Scorsese", "Drama, Crime", "Movie", 100653, 209));
        movielist.add(new movie(5, "The Godfather", "Francis Ford Coppola", "Drama, Crime", "Movie", 142653, 177));
        movielist
                .add(new movie(6, "Spider-Man: Into the Spider-Verse ", "Bob Persichetti, Peter Ramsey, Rodney Rothman",
                        "Comedy, Kids & Family, Action, Animation, Adventure, Fantasy", "Movie", 102653, 117));
        movielist.add(new movie(7, "1917", "Sam Mendes", "Drama, War, History", "Movie", 99653, 119));
        movielist.add(new movie(8, "Arcane: League of Legends", "Netflix", "Adventure, Fantasy, Animation", "TV Show",
                122653, 41));
        movielist.add(new movie(9, "Monster", "Masayuki Kojima, Ryôsuke Nakamura", "Dramam, Crime, Animation",
                "TV Show", 182653, 24));
        movielist.add(new movie(10, "Band of Brothers",
                "David Frankel, Mikael Salomon, Tom Hanks, David Leland, Richard Loncraine, David Nutter, Phil Alden Robinson, Tony To",
                "Drama, War, History", "TV Show", 282653, 594));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Danh sách phim theo phân loại: ");
        movielist.stream().sorted((o1, o2) -> o1.getCategory().compareTo(o2.getCategory())).forEach(
                movie -> System.out.println(movie));
    }

    public void run4() {
        
        ArrayList<movie> movielist = new ArrayList<movie>();
        movielist.add(new movie(1, "Citizen Kane", "Orson Welles", "Drama", "Movie", 82653, 119));
        movielist.add(
                new movie(2, "Parasite", "Bong Joon-ho", "Drama, Comedy, Mystery & Thriller", "Movie", 112093, 132));
        movielist.add(new movie(3, "Come and See ", "Elem Klimov", "Drama", "Movie", 72653, 142));
        movielist.add(new movie(4, "The Irishman", "Martin Scorsese", "Drama, Crime", "Movie", 100653, 209));
        movielist.add(new movie(5, "The Godfather", "Francis Ford Coppola", "Drama, Crime", "Movie", 142653, 177));
        movielist
                .add(new movie(6, "Spider-Man: Into the Spider-Verse ", "Bob Persichetti, Peter Ramsey, Rodney Rothman",
                        "Comedy, Kids & Family, Action, Animation, Adventure, Fantasy", "Movie", 102653, 117));
        movielist.add(new movie(7, "1917", "Sam Mendes", "Drama, War, History", "Movie", 99653, 119));
        movielist.add(new movie(8, "Arcane: League of Legends", "Netflix", "Adventure, Fantasy, Animation", "TV Show",
                122653, 41));
        movielist.add(new movie(9, "Monster", "Masayuki Kojima, Ryôsuke Nakamura", "Dramam, Crime, Animation",
                "TV Show", 182653, 24));
        movielist.add(new movie(10, "Band of Brothers",
                "David Frankel, Mikael Salomon, Tom Hanks, David Leland, Richard Loncraine, David Nutter, Phil Alden Robinson, Tony To",
                "Drama, War, History", "TV Show", 282653, 594));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Danh sách phim theo thể loại: ");
        movielist.stream().sorted((o1, o2) -> o1.getGenre().compareTo(o2.getGenre())).forEach(
                movie -> System.out.println(movie));
    }
}
