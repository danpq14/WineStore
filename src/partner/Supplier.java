package partner;

public class Supplier {
    private String name;
    private int liabilities;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(int liabilities) {
        this.liabilities = liabilities;
    }

    @Override
    public String toString() {
        String str = "Tên nhà cung cấp : "+getName()+" | Công nợ phải thanh toán : "+getLiabilities();
        return str;
    }

    public String writeToFile(){
        String str = getName()+","+getLiabilities();
        return str;
    }
}
