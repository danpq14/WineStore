package methods.edit;

import methods.FactoryMethods;
import methods.search.SearchProduct;
import partner.Supplier;
import product.Wine;

import java.util.ArrayList;
import java.util.Scanner;

public class EditProduct {
    public static void excute(ArrayList<Wine> wineList, ArrayList<Supplier> suppliers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc mã sản phẩm muốn chỉnh sửa");
        String word = sc.nextLine().toLowerCase();
        int index = SearchProduct.excute(wineList, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy sản phẩm như yêu cầu !!!");
        }
        else {
            System.out.println("Bạn muốn thay đổi thông tin gì ?");
            System.out.println("1. Tên sản phẩm");
            System.out.println("2. Mã sản phẩm");
            System.out.println("3. Thương hiệu sản phẩm");
            System.out.println("4. Giá nhập vào");
            System.out.println("5. Giá bán ra");
            System.out.println("6. Nhà cung cấp");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    System.out.println("Nhập tên mới :");
                    String name = sc.nextLine();
                    wineList.get(index).setName(name);
                    System.out.println("Thay đổi tên thành công");
                    System.out.println(wineList.get(index).toString());
                    break;
                case 2:
                    System.out.println("Nhập mã sản phẩm mới :");
                    String id = sc.nextLine();
                    wineList.get(index).setId(id);
                    System.out.println("Thay đổi mã sản phẩm thành công");
                    System.out.println(wineList.get(index).toString());
                    break;
                case 3:
                    System.out.println("Nhập thương hiệu mới :");
                    String brand = sc.nextLine();
                    wineList.get(index).setBrand(brand);
                    System.out.println("Thay đổi thương hiệu thành công");
                    System.out.println(wineList.get(index).toString());
                    break;
                case 4:
                    System.out.println("Nhập giá đầu vào mới :");
                    int price = sc.nextInt();
                    sc.nextLine();
                    wineList.get(index).setPriceEntered(price);
                    System.out.println("Thay đổi giá nhập thành công");
                    System.out.println(wineList.get(index).toString());
                    break;
                case 5:
                    System.out.println("Nhập giá bán ra mới :");
                    int priceSale = sc.nextInt();
                    sc.nextLine();
                    wineList.get(index).setPriceEntered(priceSale);
                    System.out.println("Thay đổi giá bán thành công");
                    System.out.println(wineList.get(index).toString());
                    break;
                case 6:
                    System.out.println("Nhập tên nhà cung cấp");
                    String supplierName = sc.nextLine();
                    Supplier newSupplier = null;
                    boolean foundSupp = false;
                    for (Wine item : wineList) {
                        String supplier = item.getSupplier().getName();
                        if (supplier.equalsIgnoreCase(supplierName)) {
                            System.out.println("Nhà cung cấp đã có trong danh sách");
                            newSupplier = item.getSupplier();
                            foundSupp = true;
                            break;
                        }
                    }
                    if (foundSupp) {
                        wineList.get(index).setSupplier(newSupplier);
                        System.out.println("Thay đổi nhà cung cấp thành công");
                        System.out.println(wineList.get(index).toString());
                    }
                    else {
                        newSupplier = FactoryMethods.creatSupplier(supplierName);
                        suppliers.add(newSupplier);
                        wineList.get(index).setSupplier(newSupplier);
                        System.out.println("Thay đổi nhà cung cấp thành công");
                        System.out.println(wineList.get(index).toString());
                    }
                    break;
            }
        }
    }
}
