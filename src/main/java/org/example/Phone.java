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
    String color;

    @Override
    public String toString() {
        return "Phone{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return Objects.equals(vendor, phone.vendor) &&
                Objects.equals(model, phone.model) &&
                Objects.equals(price, phone.price) &&
                Objects.equals(color, phone.color);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.vendor, this.model, this.price, this.color});
    }

    public Phone(String vendor, String model, Double price) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.color = null;
    }

    public Phone(String vendor, String model, Double price, String color) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.color = color;
    }


    public int compareVendors(Phone other) {
        return this.vendor.compareTo(other.vendor);
    }


    public int compareToPrices(Phone other) {
        return Double.compare(this.price, other.price);
    }




    public String getVendor() {
        return this.vendor;
    }


    public String getModel() {
        return this.model;
    }


    public Double getPrice() {
        return this.price;
    }

}
