package lesson18;

import java.util.Scanner;
import java.util.ArrayList;

public class moviefunction {
    public static void menu() {
        ArrayList<movie> movielist = new ArrayList<movie>();
        movielist.add(new movie(1, "Citizen Kane", "Orson Welles", "Drama", "Movie", 82653, 119));
        movielist.add(
                new movie(2, "Parasite", "Bong Joon-ho", "Drama, Comedy, Mystery & Thriller", "Movie", 112093, 132));
        movielist.add(new movie(3, "Come and See ", "Elem Klimov", "Drama", "Movie", 72653, 142));
        movielist.add(new movie(4, "The Irishman", "Martin Scorsese", "Drama, Crime", "Movie", 100653, 209));
        movielist.add(new movie(5, "The Godfather", "Francis Ford Coppola", "Drama, Crime", "Movie", 142653, 177));
        movielist.add(new movie(6, "Spider-Man: Into the Spider-Verse ", "Bob Persichetti, Peter Ramsey, Rodney Rothman",
                        "Comedy, Kids & Family, Action, Animation, Adventure, Fantasy", "Movie", 102653, 117));
        movielist.add(new movie(7, "1917", "Sam Mendes", "Drama, War, History", "Movie", 99653, 119));
        movielist.add(new movie(8, "Arcane: League of Legends", "Netflix", "Adventure, Fantasy, Animation", "TV Show",
                122653, 41));
        movielist.add(new movie(9, "Monster", "Masayuki Kojima, Ryôsuke Nakamura", "Dramam, Crime, Animation",
                "TV Show", 182653, 24));
        movielist.add(new movie(10, "Band of Brothers",
                "David Frankel, Mikael Salomon, Tom Hanks, David Leland, Richard Loncraine, David Nutter, Phil Alden Robinson, Tony To",
                "Drama, War, History", "TV Show", 282653, 594));
       
        Scanner sc = new Scanner(System.in);
        boolean continueCheck = false;
        while (!continueCheck) {
            System.out.println("Nhập công việc cần làm: ");
            System.out.println("1: Hiển thị tất cả các bộ phim");
            System.out.println("2: Lấy ra 3 bộ phim có lượt xem cao nhất");
            System.out.println("3: Liệt kê phim theo category");
            System.out.println("4: Liệt kê phim theo thể loại");
            System.out.println("0: Kết thúc chương trình");
            int work = sc.nextInt();
            switch (work) {
                case 1:
                    System.out.println("Danh sách phim: ");
                    movielist.stream().forEach(movie -> System.out.println(movie));
                    break;
                case 2:
                    System.out.println("Danh sách 3 phim nhiều lượt xem nhất: ");
                    movielist.stream().sorted((o1, o2) -> o2.getView() - o1.getView()).limit(3)
                            .forEach(
                                    movie -> System.out
                                            .println(movie));
                    break;

                case 3:
                    System.out.println("Danh sách phim theo phân loại: ");
                    movielist.stream().sorted((o1, o2) -> o1.getCategory().compareTo(o2.getCategory())).forEach(
                            movie -> System.out.println(movie));
                    break;
                case 4:
                    System.out.println("Danh sách phim theo thể loại: ");
                    movielist.stream().sorted((o1, o2) -> o1.getGenre().compareTo(o2.getGenre())).forEach(
                            movie -> System.out.println(movie));
                    break;
                case 0:
                    continueCheck = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này!!!");
            }
        }
        sc.close();
    }
}
