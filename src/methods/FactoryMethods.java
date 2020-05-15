package methods;

import partner.Customer;
import partner.Supplier;
import product.Wine;

public class FactoryMethods {
    public static Wine creatWine(String name, String id, String brand, int priceEntered, int priceSale, Supplier supplier){
        Wine newWine = new Wine(name, id, brand, priceEntered, priceSale, supplier);
        return newWine;
    }

    public static Supplier creatSupplier(String name){
        Supplier newSuppilier = new Supplier(name);
        return newSuppilier;
    }

    public static Customer creatCustomer(String name, String phoneNumber, int discountPercent) {
        Customer newCustomer = new Customer(name, phoneNumber, discountPercent);
        return  newCustomer;
    }

}
