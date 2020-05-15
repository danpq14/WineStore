package product;

import partner.Supplier;

public class Wine {
    private String name;
    private String id;
    private String brand;
    private int priceSale;
    private int priceEntered;
    private Supplier supplier;
    private int inventoryNumber;

    public Wine(String name, String id, String brand, int priceEntered, int priceSale, Supplier supplier) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.priceSale = priceSale;
        this.priceEntered = priceEntered;
        this.supplier = supplier;
        this.setInventoryNumber(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public int getPriceEntered() {
        return priceEntered;
    }

    public void setPriceEntered(int priceEntered) {
        this.priceEntered = priceEntered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    @Override
    public String toString() {
        String toString = "Tên sp : "+getName()+" | Mã sp : "+getId()+" | Thương hiệu : "+getBrand()+" | Giá nhập vào : "+getPriceEntered()+ " | Giá bán ra :"+getPriceSale()+" | Nhà cung cấp : "+ getSupplier().getName() +" | Tồn kho : " +getInventoryNumber();
        return toString;
    }

    public String writeToFile() {
        String writeToFile = getName()+","+getId()+","+getBrand()+","+getPriceEntered()+","+getPriceSale()+","+getSupplier().getName()+","+getInventoryNumber();
        return writeToFile;
    }
}
