package methods.search;

import product.Wine;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchProduct {
    public static int excute(ArrayList<Wine> wineList, String keyword) {
        Scanner sc = new Scanner(System.in);
        int found = 0;
        int index = -1;
        keyword = keyword.toLowerCase();
        for (int i=0; i< wineList.size(); i++) {
            String name = wineList.get(i).getName().toLowerCase();
            String id    = wineList.get(i).getId().toLowerCase();
            if (name.contains(keyword) || id.contains(keyword)) {
                System.out.println(wineList.get(i).toString());
                index = i;
                found++;
            }
        }
        if (found == 0) {
            return -1;
        }
        if (found == 1) {
            return index;
        }
        if (found > 1) {
            System.out.println("Có "+found+ " sản phẩm được tìm thấy !" );
            System.out.println("Nhập lại mã sản phẩm chính xác hơn");
            String searchAgain = sc.nextLine();
            return SearchProduct.excute(wineList, searchAgain);
        }
        return -1;
    }
}
