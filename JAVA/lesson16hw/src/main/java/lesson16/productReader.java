package lesson16;

// import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class productReader {
    public ArrayList<product> getData() {
        ArrayList<product> productInfo = new ArrayList<>();
        try {
            Gson gson = new Gson();

            FileReader reader = new FileReader("JAVA/lesson16hw/src/main/java/lesson16/product.json");

            Type objectType = new TypeToken<ArrayList<product>>() {
            }.getType();

            productInfo = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return productInfo;
    }
    

}
