package my.spring.core.javaconfig.base.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// setting the scope to prototype. This way in the application context whenever you do a .getBean()
// for the Cart class you get a new instance. Instead of getting a singleton.
@Scope("prototype")
@Component
public class Cart {
    private List<Product> productList = new ArrayList<>();
    public void addProduct(Product p) {
        productList.add(p);
    }
    public List<Product> getProducts() {
        return productList;
    }
}
