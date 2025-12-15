import persistence.IOFilePersistence;
import persistence.Persistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");


        Persistence persistence = new IOFilePersistence("user.csv");
        System.out.println(persistence.write("Lucas;Jose;"));


    }
}