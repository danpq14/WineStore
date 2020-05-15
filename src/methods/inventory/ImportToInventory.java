package methods.inventory;

import methods.search.SearchProduct;
import partner.Supplier;
import product.Wine;

import java.util.ArrayList;
import java.util.Scanner;

public class ImportToInventory {
    public static void excute(ArrayList<Wine> wineList, ArrayList<Supplier> suppliers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hoặc tên sản phẩm :");
        String word = sc.nextLine();
        int index = SearchProduct.excute(wineList, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy sản phẩm như yêu cầu");
        }
        else {
            System.out.println("Nhập số lượng hàng nhập kho :");
            int amount = sc.nextInt();
            sc.nextLine();
            int oldNumber = wineList.get(index).getInventoryNumber();
            wineList.get(index).setInventoryNumber(oldNumber + amount);
            System.out.println("Nhập kho thành công");
            int oldLiabilities = wineList.get(index).getSupplier().getLiabilities();
            int costOfNewProduct = (wineList.get(index).getPriceEntered())*amount;
            wineList.get(index).getSupplier().setLiabilities(oldLiabilities+costOfNewProduct);
        }
    }
}
