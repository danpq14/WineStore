package manager;

import methods.actionWithFile.ImportDataFromFile;
import methods.actionWithFile.SaveToFile;
import methods.add.AddCustomer;
import methods.add.AddProduct;
import methods.add.AddSupplier;
import methods.customer.CheckReceivable;
import methods.customer.PaymentCustomer;
import methods.edit.EditCustomer;
import methods.edit.EditProduct;
import methods.edit.EditSupplier;
import methods.fund.CheckInventoryValue;
import methods.fund.CheckTotalLiabilities;
import methods.fund.CheckTotalReceivable;
import methods.inventory.CheckInventory;
import methods.inventory.ExportFromInventory;
import methods.inventory.ImportToInventory;
import methods.remove.RemoveCustomer;
import methods.remove.RemoveProduct;
import methods.remove.RemoveSupplier;
import methods.supplier.CheckSupplier;
import methods.supplier.PaymentToSupplier;
import partner.Customer;
import partner.Supplier;
import product.Wine;

import java.io.IOException;
import java.util.ArrayList;

public class WineStoreManager implements Manager, WineManager {
    private ArrayList<Wine> wineList;
    private ArrayList<Supplier> suppliers;
    private ArrayList<Customer> customers;

    public WineStoreManager() {
        wineList = new ArrayList<Wine>();
        suppliers = new ArrayList<Supplier>();
        customers = new ArrayList<Customer>();
    }

    public void importDataFromeFile() throws IOException {
        String fileProduct = "C:\\Users\\hp\\Desktop\\Module 2\\WineStore\\File\\Wine";
        String fileSupp = "C:\\Users\\hp\\Desktop\\Module 2\\WineStore\\File\\Supplier";
        String fileCustomer = "C:\\Users\\hp\\Desktop\\Module 2\\WineStore\\File\\Customer";
        ImportDataFromFile.excute(wineList, suppliers, customers,fileProduct,fileSupp,fileCustomer);
    }

    @Override
    public void addProduct() throws IOException {
        AddProduct.excute(wineList,suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void addCustomer() throws IOException {
        AddCustomer.excute(customers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void addSupplier() throws IOException {
        AddSupplier.excute(suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void removeProduct() throws IOException {
        RemoveProduct.excute(wineList);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    public void removeSupplier() throws IOException {
        RemoveSupplier.execute(suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    public void removeCustomer() throws IOException {
        RemoveCustomer.execute(customers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void edit() throws IOException {
        EditProduct.excute(wineList,suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    public void editSupplier() throws IOException {
        EditSupplier.execute(suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    public void editCustomer() throws IOException {
        EditCustomer.execute(customers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void importProduct() throws IOException {
        ImportToInventory.excute(wineList,suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void exportProduct() throws IOException {
        ExportFromInventory.excute(wineList,customers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void checkInventory() throws IOException {
        CheckInventory.excute(wineList);
        SaveToFile.excute(wineList, suppliers, customers);
    }


    public void checkInventoryValue() throws IOException {
        CheckInventoryValue.execute(wineList);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    public void checkTotalReceivable() {
        CheckTotalReceivable.execute(customers);
    }

    public void checkToTalLiabilities() {
        CheckTotalLiabilities.execute(suppliers);
    }

    @Override
    public void checkSuppiler() throws IOException {
        CheckSupplier.execute(suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    public void paymentToSupplier() throws IOException {
        PaymentToSupplier.execute(suppliers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    @Override
    public void checkCustomer() throws IOException {
        CheckReceivable.execute(customers);
        SaveToFile.excute(wineList, suppliers, customers);
    }

    public void paymentCustomer() throws IOException {
        PaymentCustomer.execute(customers);
        SaveToFile.excute(wineList, suppliers, customers);
    }
}
