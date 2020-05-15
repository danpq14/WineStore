package methods.actionWithFile;

import methods.FactoryMethods;
import partner.Customer;

import java.io.*;
import java.util.ArrayList;

public class ImportCustomerFromFile {
    public static void excute(ArrayList<Customer> customers, String filePath) throws IOException {
        customers.clear();
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] customerToArray = line.split(",");
            String name = customerToArray[0];
            String phone = customerToArray[1];
            int discountPercent = Integer.parseInt(customerToArray[2]);
            int receivable = Integer.parseInt(customerToArray[3]);
            Customer customer = FactoryMethods.creatCustomer(name, phone, discountPercent);
            customer.setReceivable(receivable);
            customers.add(customer);
        }
    }
}