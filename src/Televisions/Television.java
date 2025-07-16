package Televisions;

import Products.Product;

public class Television extends Product {

    // fields
    private int dimension;
    private boolean smart;
    
    // costruttore
    public Television(String name, String brand, double price, int dimension, boolean smart) {
        super(name, brand, price);
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

    // stampo le informazioni smartphone usando override
    // aggrego le info del prodotto con quelle del televisore
    @Override
    public String toString() {
        return super.toString() + "\nle dimensioni sono: " + dimension + "\npixel ed: " + getStringSmart();
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
