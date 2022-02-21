package com.design.patterns.builder;

public class Mobile {

    private String name;
    private String color;
    private String processor;
    private String ram;
    private String price;

    public Mobile(Builder builder) {
        this.name=builder.name;
        this.color= builder.color;
        this.processor=builder.processor;
        this.ram= builder.ram;
        this.price= builder.price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        color = color;
    }

    public String getProcessor() {
        return this.processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return this.ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static class Builder{

        private String name;
        private String color;
        private String processor;
        private String ram;
        private String price;

        public Mobile build(){
            return new Mobile(this);
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
