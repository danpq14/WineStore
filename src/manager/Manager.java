package manager;

import java.io.IOException;

public interface Manager {
    void addProduct() throws IOException;
    void removeProduct() throws IOException;
    void edit() throws IOException;
    void importProduct() throws IOException;
    void exportProduct() throws IOException;
}
