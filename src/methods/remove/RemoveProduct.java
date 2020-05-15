package methods.remove;

import methods.search.SearchProduct;
import product.Wine;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProduct {
    public static void excute(ArrayList<Wine> wineList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc mã sản phẩm muốn xóa");
        String word = sc.nextLine().toLowerCase();
        int index = SearchProduct.excute(wineList, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy sản phẩm như yêu cầu !!!");
        }
        else {
            if (wineList.get(index).getInventoryNumber() > 0) {
                System.out.println("Sản phẩm vẫn còn tồn kho, Ko thể xóa");
            }
            else {
                wineList.remove(index);
                System.out.println("Xóa sản phẩm thành công");
            }
        }
    }
}
