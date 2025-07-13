package Products;

public class Product {

    // fields
    private String code;
    private String name;
    private String brand;
    private double price;
    private int iva = 22;

    // costruttore
    public Product(String code, String name, String brand, double price) {
        if (code == null || code.equals("") || name == null || name.equals("")|| brand == null || brand.equals("") || price <= 0) {
            System.out.println("inserito valori errati, uso quelli di default");
        } else {
            this.code = code;
            this.name = name;
            this.brand = brand;
            this.price = price;
        }
    }

    // metodi
    // calcolo prezzo finale
    public Double getFinalPrice() {
        Double priceIva = (price * iva) / 100;
        Double finalPrice = price + priceIva;
        return finalPrice;
    }

    // formatto il prezzo finale
    public String getFinalPriceFormatted() {
        return String.format("%.2f", getFinalPrice());
    }
    
    // stampo informazioni prodotto
    public void stampProductInfo() {
        System.out.println("il codice prodotto è: " + code + " del prodotto: " + name + " " + brand + " che costa: " + getFinalPriceFormatted());
    }


    // getters

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public int getIva() {
        return iva;
    }



    // setters

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("inserito valori errati, non modifico il valore");
        } else {
            this.name = name;
        }
    }

    public void setBrand(String brand) {
        if (brand == null || brand.equals("")) {
            System.out.println("inserito valori errati, non modifico il valore");
        } else {
            this.brand = brand;
        }
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("inserito valori errati, non modifico il valore");
        } else {
            this.price = price;
        }
    }

    public void setIva(int iva) {
        if (iva <= 0) {
            System.out.println("inserito valori errati, non modifico il valore");
        } else {
            this.iva = iva;
        }
    }
}
