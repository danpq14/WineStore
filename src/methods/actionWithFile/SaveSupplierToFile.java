package methods.actionWithFile;

import partner.Supplier;
import product.Wine;

import java.io.*;
import java.util.ArrayList;

public class SaveSupplierToFile {
    public static void excute(ArrayList<Supplier> suppliers) throws IOException {
        File saveFile = new File("C:\\Users\\hp\\Desktop\\Module 2\\WineStore\\File\\Supplier");
        if (!saveFile.exists()){
            saveFile.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(saveFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(writer);
        String line = "";
        for (Supplier item : suppliers) {
            line = item.writeToFile();
            printWriter.println(line);
        }
        writer.flush();
        writer.close();
    }
}
