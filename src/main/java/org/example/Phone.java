//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Objects;

public class Phone {
    String vendor;
    String model;
    Double price;

    public String toString() {
        return "Phone{vendor='" + this.vendor + "', model='" + this.model + "', price=" + this.price + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Phone phone = (Phone)o;
            return Objects.equals(this.vendor, phone.vendor) && Objects.equals(this.model, phone.model) && Objects.equals(this.price, phone.price);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.vendor, this.model, this.price});
    }

    public Phone(String vendor, String model, Double price) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
