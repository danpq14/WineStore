package partner;

public class Customer {
    private String name;
    private int receivable;
    private String phoneNumber;
    private int discountPercent;

    public Customer(String name, String phoneNumber, int discountPercent) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.discountPercent = discountPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReceivable() {
        return receivable;
    }

    public void setReceivable(int receivable) {
        this.receivable = receivable;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return "Tên Khách Hàng : "+getName()+" | Số điện thoại : "+getPhoneNumber()+" | Công nợ phải thu : " +getReceivable();
    }

    public String writeToFile(){
        String str = getName()+","+getPhoneNumber()+","+getDiscountPercent()+","+getReceivable();
        return  str;
    }
}
