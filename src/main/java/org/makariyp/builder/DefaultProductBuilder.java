package org.makariyp.builder;

public class DefaultProductBuilder implements ProductBulder{
    private int first;
    private String second;

    @Override
    public ProductBulder first(int first) {
        this.first = first;
        return this;
    }

    @Override
    public ProductBulder second(String second) {
        this.second = second;
        return this;
    }

    @Override
    public Product build() {
        Product product = new Product(first, second);
        if (product.checkProduct()) {
            return product;
        } else {
            throw new IllegalArgumentException("Product is not valid");
        }
    }
}
