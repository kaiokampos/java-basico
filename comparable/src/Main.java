import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\KaioDev\\in.txt";

        List<String> nameList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null){
                nameList.add(line);
                line = bufferedReader.readLine();
            }
            Collections.sort(nameList);

            for (String name : nameList){
                System.out.println(name);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}