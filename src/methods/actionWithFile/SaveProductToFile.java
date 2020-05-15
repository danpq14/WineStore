package methods.actionWithFile;

import product.Wine;

import java.io.*;
import java.util.ArrayList;

public class SaveProductToFile {
    public static void excute(ArrayList<Wine> wineList) throws IOException {
        File saveFile = new File("C:\\Users\\hp\\Desktop\\Module 2\\WineStore\\File\\Wine");
        if (!saveFile.exists()){
            saveFile.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(saveFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(writer);
        String line = "";
        for (Wine item : wineList) {
            line = item.writeToFile();
            printWriter.println(line);
        }
        writer.flush();
        writer.close();
    }
}
