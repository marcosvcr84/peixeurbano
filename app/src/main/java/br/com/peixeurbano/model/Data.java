package br.com.peixeurbano.model;

public class Data {

    private String name, description, price, image;
    //private int imageId;
    public Data(){}

    public Data(String name, String description, String price,String image){
        this.name = name;
        this.description = description;
        this.price = price;
        this.image= image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImageId(String image) {
        this.image = image;
    }
}
