package my.spring.core.javaconfig.base.scope;

import java.util.StringJoiner;

public class Product {
    private String id;
    private String description;

    public Product(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("description='" + description + "'")
                .toString();
    }
}
