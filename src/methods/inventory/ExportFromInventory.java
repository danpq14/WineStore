package methods.inventory;

import methods.search.SearchCustomer;
import methods.search.SearchProduct;
import partner.Customer;
import product.Wine;

import java.util.ArrayList;
import java.util.Scanner;

public class ExportFromInventory {
    public static void excute(ArrayList<Wine> wineList, ArrayList<Customer> customers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hoặc tên sản phẩm :");
        String word = sc.nextLine();
        int index = SearchProduct.excute(wineList, word);
        if (index == -1) {
            System.out.println("Ko tìm thấy sản phẩm như yêu cầu");
        }
        else {
            System.out.println("Nhập số lượng hàng xuất kho :");
            int amount = sc.nextInt();
            sc.nextLine();

            //lấy thông tin khách hàng và thay đổi công nợ
            System.out.println("Nhập tên hoặc số điện thoại khách hàng");
            String customName = sc.nextLine();
            int indexCustom = SearchCustomer.excute(customers, customName);
            int discount = (customers.get(indexCustom).getDiscountPercent())/100;
            int pay = (wineList.get(index).getPriceSale())*amount*(1-discount);
            int oldReceivable = customers.get(indexCustom).getReceivable();
            customers.get(indexCustom).setReceivable(oldReceivable+pay);

            //thay đổi số lượng hàng trong kho
            int oldNumber = wineList.get(index).getInventoryNumber();
            if (amount < oldNumber) {
                wineList.get(index).setInventoryNumber(oldNumber-amount);
                System.out.println("Xuất kho thành công");
            }
            else {
                System.out.println("Ko đủ số lượng để xuất");
            }
        }
    }
}
