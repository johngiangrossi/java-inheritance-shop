package Televisions;

import Products.Product;

public class Television extends Product {

    // fields
    private int dimension;
    private boolean smart;
    
    // costruttore
    public Television(String code, String name, String brand, double price, int dimension, boolean smart) {
        super(code, name, brand, price);
        if (dimension <= 0) {
            System.out.println("hai inserito valori errati, uso quelli di default");
        } else {
            this.dimension = dimension;
            this.smart = smart;
        }
    }


    // metodi
    // ottengo se sono smart o no
    public String getStringSmart() {
        if (smart) {
            return " è smart";
        } else {
            return " non è smart"; 
        }
    }

    // stampo le informazioni smartphone
    public void stampTelevisionInfo() {
        System.out.println("le dimensioni sono: " + dimension + " pixel ed: " + getStringSmart());
    }

    // aggrego le info del prodotto con quelle del televisore
    public void stampTelevisionAllInfo() {
        stampProductInfo();
        stampTelevisionInfo();
    }


    // getters
    public int getDimension() {
        return dimension;
    }

    public boolean getSmart() {
        return smart;
    }



    // setters
    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public void setDimension(int dimension) {
        if (dimension <= 0) {
            System.out.println("hai inserito valori errati, non modifico i valori");
        } else {
            this.dimension = dimension;
        }
    }

}
