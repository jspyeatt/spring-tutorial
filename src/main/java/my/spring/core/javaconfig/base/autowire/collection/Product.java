package my.spring.core.javaconfig.base.autowire.collection;

import java.util.StringJoiner;

public class Product {
    private String productId;
    private String productDesc;

    public Product(String productId, String productDesc) {
        this.productId = productId;
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("productId='" + productId + "'")
                .add("productDesc='" + productDesc + "'")
                .toString();
    }
}
