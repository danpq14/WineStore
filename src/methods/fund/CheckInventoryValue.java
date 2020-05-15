package methods.fund;

import product.Wine;

import java.util.ArrayList;

public class CheckInventoryValue {
    public static void execute(ArrayList<Wine> wines) {
        int sumEntered = 0;
        int sumSale = 0 ;
        for (Wine wine : wines) {
            int entered = wine.getPriceEntered()*wine.getInventoryNumber();
            int sale = wine.getPriceSale()*wine.getInventoryNumber();
            sumEntered += entered;
            sumSale += sale;
        }
        System.out.println("Tổng giá trị hàng trong kho theo giá đầu vào : "+sumEntered);
        System.out.println("Tổng giá trị hàng trong kho theo giá bán ra : "+sumSale);
    }
}
