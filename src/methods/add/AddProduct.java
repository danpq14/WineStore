package methods.add;

import methods.FactoryMethods;
import partner.Supplier;
import product.Wine;

import java.util.ArrayList;
import java.util.Scanner;

public class AddProduct {
    public static void excute(ArrayList<Wine> wineList, ArrayList<Supplier> suppliers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm : ");
        String name = sc.nextLine();
        System.out.println("Nhập mã sản phẩm :");
        String id = sc.nextLine();
        System.out.println("Nhập thương hiệu :");
        String brand = sc.nextLine();
        System.out.println("Giá nhập vào :");
        int priceEntered = sc.nextInt();
        sc.nextLine();
        System.out.println("Giá bán ra :");
        int priceSale = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nhà cung cấp :");
        String supplier = sc.nextLine();
        String supplierName = supplier.toLowerCase();
        Supplier newSupplier = null;
        boolean foundSupp = false;
        for (int i=0; i< suppliers.size(); i++) {
           String nameSupp = suppliers.get(i).getName().toLowerCase();
           if (nameSupp.contains(supplierName)) {
               System.out.println("Nhà cung cấp đã có trong danh sách");
               Wine newWine = FactoryMethods.creatWine(name, id, brand, priceEntered, priceSale, suppliers.get(i));
               foundSupp = true;
               wineList.add(newWine);
               break;
           }
        }
//        if (foundSupp) {
//            System.out.println("Nhà cung cấp đã có trong danh sách");
//            Wine newWine = FactoryMethods.creatWine(name, id, brand, priceEntered, priceSale, newSupplier);
//            wineList.add(newWine);
//        }
        if (!foundSupp){
            newSupplier = FactoryMethods.creatSupplier(supplier);
            Wine newWine = FactoryMethods.creatWine(name, id, brand, priceEntered, priceSale, newSupplier);
            wineList.add(newWine);
            suppliers.add(newSupplier);
        }
    }
}
