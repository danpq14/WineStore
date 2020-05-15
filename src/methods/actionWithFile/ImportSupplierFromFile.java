package methods.actionWithFile;

import methods.FactoryMethods;
import partner.Customer;
import partner.Supplier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportSupplierFromFile {
    public static void excute(ArrayList<Supplier> suppliers, String filePath) throws IOException {
        suppliers.clear();
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] supplierToArray = line.split(",");
            String name = supplierToArray[0];
            int lizi = Integer.parseInt(supplierToArray[1]);
            Supplier supplier = FactoryMethods.creatSupplier(name);
            supplier.setLiabilities(lizi);
            suppliers.add(supplier);
        }
    }
}
