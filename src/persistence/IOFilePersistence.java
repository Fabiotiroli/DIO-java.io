package persistence;

import java.io.*;

public class IOFilePersistence implements Persistence {

    private String fileName = " ";
    private final String currentDirectory = System.getProperty("user.dir");
    private final String storeDir = "/managedFiles/IO/";
    public IOFilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currentDirectory + storeDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");
        clearFile();
    }

    private void clearFile()  {
        try {
            OutputStream out = new FileOutputStream(new File(currentDirectory + storeDir + fileName));
            System.out.println("inicializando arquivo");

        } catch (IOException e) {
                e.getStackTrace();        }

    }





    @Override
    public String write(String data) {
        try {
            var fileWriter = new FileWriter(currentDirectory + storeDir + fileName, true );
            System.out.println(currentDirectory + storeDir +  fileName);
            var bufferedWriter = new BufferedWriter(fileWriter);
            var printWriter = new PrintWriter(bufferedWriter) ;
            System.out.println(data);
            printWriter.println(data);


        }catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public String read(String data) {
        return "";
    }

    @Override
    public boolean remove(String sentence) {
        return false;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        return "";
    }

    @Override
    public String findAll(String pattern) {
        return "";
    }

    @Override
    public String findBy(String sentence) {
        return "";
    }
}
