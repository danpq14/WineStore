package methods.inventory;

import methods.search.SearchProduct;
import product.Wine;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckInventory {
    public static void excute(ArrayList<Wine> wineList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hoặc tên sản phẩm :");
        String word = sc.nextLine();
        int index = SearchProduct.excute(wineList, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy sản phẩm như yêu cầu");
        }
        else {
            String name = wineList.get(index).getName();
            int oldNumber = wineList.get(index).getInventoryNumber();
            System.out.println("Sản phẩm "+name+ " có tồn kho là : " +oldNumber);
        }
    }
}
