package my.spring.core;

import java.util.StringJoiner;

public class Product {
    private String productId;
    private String productName;
    private String productDesc;

    public Product(String productId, String productName, String productDesc) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("productId='" + productId + "'")
                .add("productName='" + productName + "'")
                .add("productDesc='" + productDesc + "'")
                .toString();
    }
}
