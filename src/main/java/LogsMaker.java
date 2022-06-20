import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LogsMaker {

    private static LogsMaker instance = null;

    private LogsMaker(){}

    public static LogsMaker getInstance(){
        if (instance == null){
            instance = new LogsMaker();}
        return instance;}

    public static void writeToFile(String content) throws IOException{
        String filePath = "C:\\Users\\888\\Desktop\\Log.txt";
        Files.writeString(Path.of(filePath), content + "\n", StandardOpenOption.CREATE_NEW);
    }
}
