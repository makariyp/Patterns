package org.makariyp.builder;

public class Product {
    private Integer first;
    private String second;

    public Product(Integer first, String second) {
        this.first = first;
        this.second = second;
    }
    public boolean checkProduct() {
        return (first != null) && (second != null);
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}
