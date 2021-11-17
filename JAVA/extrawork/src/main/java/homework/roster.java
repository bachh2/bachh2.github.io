package homework;

public class roster {
    int id;
    String name;
    position position;

    public roster(int id, String name, position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public void setID(int id) {
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

    public void setPosition(position position) {
        this.position = position;
    }

    public position getPosition() {
        return position;
    }

    public String toString() {
        return "Cầu thủ: " + name + ", số áo: " + id + ", đá ở vị trí: " + position;
    }

    public void display() {
        System.out.println("Cầu thủ: " + name + ", số áo: " + id + ", đá ở vị trí: " + position);
    }

}
