package Headphones;

import Products.Product;

public class Headphone extends Product{

    // fields
    private String color;
    private boolean wireless;
    
    // costruttore
    public Headphone(String code, String name, String brand, double price, String color, boolean wireless) {
        super(code, name, brand, price);
        if (color == null || color.equals("")) {
            System.out.println("hai inserito valori errati, uso quelli di default");
        } else {
            this.color = color;
            this.wireless = wireless;
        }
    }

    // metodi
    // ottengo se sono cablate o wireles
    public String getStringWireless() {
        if (wireless) {
            return "wireless";
        } else {
            return "cablate";
        }
    }

    // stampo le informazioni smartphone
    public void stampHeadphoneInfo() {
        System.out.println("il colore è: " + color + " e sono cuffie: " + getStringWireless());
    }

    // aggrego le info del prodotto con quelle dello smartphone
    public void stampHeadphoneAllInfo() {
        stampProductInfo();
        stampHeadphoneInfo();
    }


    // getters
    public String getColor() {
        return color;
    }

    public boolean getWireless() {
        return wireless;
    }


    // setters
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void setColor(String color) {
        if (color == null || color.equals("")) {
            System.out.println("hai inserito valori errati, non modifico i valori");
        } else {
            this.color = color;
        }
    }
}
