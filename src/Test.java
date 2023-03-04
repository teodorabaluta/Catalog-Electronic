import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public void runTests(String[] inputFiles) throws IOException {
        for (String inputFile : inputFiles) {
                List<String> inputData = new ArrayList<>();
                File file = new File(inputFile);
                BufferedReader br = new BufferedReader(new FileReader("Studenti.txt"));
                String stud;
                while ((stud = br.readLine()) != null) {
                    inputData.add(stud);
                }
                System.out.println(inputData);
        }
    }
}
