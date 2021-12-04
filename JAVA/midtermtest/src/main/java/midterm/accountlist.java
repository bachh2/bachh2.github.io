package midterm;

import java.util.ArrayList;

public class accountlist {
    ArrayList<account> list;

    list=new ArrayList<>();

    public ArrayList<account> addAccount() {
        list.add(new account("doofus", "One-should", "doofus.gmail@com"));
        list.add(new account("doofus2", "One-shouldnot", "doofus2.gmail@com"));
        list.add(new account("doofus3", "One-shall", "doofus3.gmail@com"));
        return list;
    }

    public ArrayList<account> getAccount() {
        return list;
    }
}
