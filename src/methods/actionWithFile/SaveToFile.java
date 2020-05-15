package methods.actionWithFile;

import partner.Customer;
import partner.Supplier;
import product.Wine;

import java.io.IOException;
import java.util.ArrayList;

public class SaveToFile {
    public static void excute(ArrayList<Wine> wines, ArrayList<Supplier> suppliers, ArrayList<Customer> customers) throws IOException {
        SaveProductToFile.excute(wines);
        SaveSupplierToFile.excute(suppliers);
        SaveCustomerToFile.excute(customers);
    }
}
