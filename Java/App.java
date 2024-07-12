import java.io.File;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Path filePath = Path.of("./Foundational_Learning_Docs");
        try {
            File f = new File(filePath.toString());
            for(File file : f.listFiles()){
                System.out.println(file.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
