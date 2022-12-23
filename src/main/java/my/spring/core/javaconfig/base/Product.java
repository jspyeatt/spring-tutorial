package my.spring.core.javaconfig.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringJoiner;

public class Product {
    private static final Logger log = LoggerFactory.getLogger(Product.class);
    private String productId;
    private String productDesc;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
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
