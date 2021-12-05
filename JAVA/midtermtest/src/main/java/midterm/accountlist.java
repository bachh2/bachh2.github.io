package midterm;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;

public class accountlist {
    public ArrayList<account> getData() {
        ArrayList<account> list = new ArrayList<>();
        try {
            Gson gson = new Gson();

            FileReader reader = new FileReader("JAVA/midtermtest/src/main/java/midterm/account.json");

            Type objectType = new TypeToken<ArrayList<account>>() {
            }.getType();

            list = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return list;
    }
   
}
