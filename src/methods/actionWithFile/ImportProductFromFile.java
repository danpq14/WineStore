package methods.actionWithFile;

import methods.FactoryMethods;
import partner.Supplier;
import product.Wine;

import java.io.*;
import java.util.ArrayList;

public class ImportProductFromFile {
    public static void excute(ArrayList<Wine> wines, String filePath, ArrayList<Supplier> suppliers) throws IOException {
        wines.clear();
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] productToArray = line.split(",");
            String name = productToArray[0];
            String id = productToArray[1];
            String brand = productToArray[2];
            int priceEntered = Integer.parseInt(productToArray[3]);
            int priceSale = Integer.parseInt(productToArray[4]);
            String suppName = productToArray[5];
            int inventoryNumber = Integer.parseInt(productToArray[6]);
            Supplier supplier = null;

            for (Supplier item : suppliers) {
                String Sname = item.getName();
                if (suppName.equalsIgnoreCase(Sname)) {
                    supplier = item;
                    break;
                }
            }

            Wine wine = FactoryMethods.creatWine(name, id, brand, priceEntered, priceSale, supplier);
            wine.setInventoryNumber(inventoryNumber);
            wines.add(wine);
        }
    }
}