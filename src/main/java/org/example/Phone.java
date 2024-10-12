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
        } else if (o != null && this.getClass() == o.getClass()) {
            Phone phone = (Phone)o;
            return Objects.equals(this.vendor, phone.vendor) && Objects.equals(this.model, phone.model) && Objects.equals(this.price, phone.price) && Objects.equals(this.color, phone.color);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.vendor, this.model, this.price, this.color});
    }

    public Phone(String vendor, String model, Double price) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
    }

    public Phone(String vendor, String model, Double price, String color) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    


    public int compareTo(Phone o) {

        int result = this.model.compareTo(o.model);

        return result;
    };




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
