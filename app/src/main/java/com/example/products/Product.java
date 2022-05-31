package com.example.products;

public class Product {

        private String name;
        private int imageId;
        private double price;
        private String description;

        public Product(String name, int imageId, double price, String description) {
            this.name = name;
            this.imageId = imageId;
            this.price = price;
            this.description =description ;
        }

        public String getName() {
            return name;
        }

        public int getImageId() {
            return imageId;
        }

        public double getPrice() {
            return price;
        }

    public String getDescription() {
        return description;
    }
    }


