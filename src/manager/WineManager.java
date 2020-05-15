package manager;

import java.io.IOException;

public interface WineManager {
    void checkInventory() throws IOException;
    void checkSuppiler() throws IOException;
    void checkCustomer() throws IOException;
    void addCustomer() throws IOException;
    void addSupplier() throws IOException;
}
