package org.makariyp.builder;

public interface ProductBulder {
    ProductBulder first(int first);
    ProductBulder second(String second);
    Product build();
}
