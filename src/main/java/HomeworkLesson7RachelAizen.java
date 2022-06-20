import java.io.IOException;
import java.nio.file.Paths;

public class HomeworkLesson7RachelAizen {
    private static String filePath;

    public static void main(String[] args) throws IOException {
        //1
        System.out.println("No, design patterns are NOT language dependent.");

        //2
        LogsMaker logsMaker = LogsMaker.getInstance();
        LogsMaker.writeToFile("Hello");
        //3
        CarFactory carFactory = new CarFactory();

        Drivable myFiat = carFactory.getDrivable("Fiat");
        myFiat.drive();

        Drivable myBMW = carFactory.getDrivable("BMW");
        myBMW.drive();

        Drivable myPorsche = carFactory.getDrivable("Porsche");
        myPorsche.drive();

        //6
        System.out.println("Maven - a software project managing tool.");
        System.out.println("Used to manage a project (Duh!), report and document.");

    }
}
