package methods.actionWithFile;

import partner.Customer;
import partner.Supplier;
import product.Wine;

import java.io.IOException;
import java.util.ArrayList;

public class ImportDataFromFile {
    public static void excute(ArrayList<Wine> wines, ArrayList<Supplier> suppliers, ArrayList<Customer> customers, String fileProduct, String fileSupplier, String fileCustomer) throws IOException {
        ImportSupplierFromFile.excute(suppliers, fileSupplier);
        ImportCustomerFromFile.excute(customers, fileCustomer);
        ImportProductFromFile.excute(wines, fileProduct, suppliers);
    }
}
