package methods.actionWithFile;

import partner.Customer;
import partner.Supplier;

import java.io.*;
import java.util.ArrayList;

public class SaveCustomerToFile {
    public static void excute(ArrayList<Customer> customers) throws IOException {
        File saveFile = new File("C:\\Users\\hp\\Desktop\\Module 2\\WineStore\\File\\Customer");
        if (!saveFile.exists()){
            saveFile.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(saveFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(writer);
        String line = "";
        for (Customer item : customers) {
            line = item.writeToFile();
            printWriter.println(line);
        }
        writer.flush();
        writer.close();
    }
}
