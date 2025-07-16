package Smartphones;

import Products.Product;

public class Smartphone extends Product {

    // fields
    private String codeIMEI;
    private int memoryRAM;
    
    // costruttore
    public Smartphone(String name, String brand, double price, String codeIMEI, int memoryRAM) {
        super(name, brand, price);
        if (codeIMEI == null || codeIMEI.equals("") || memoryRAM <= 0) {
            System.out.println("hai inserito valori errati, uso quelli di defautl");
        } else {
            this.codeIMEI = codeIMEI;
            this.memoryRAM = memoryRAM;
        }
    }



    // metodi
    // stampo le informazioni smartphone usando override
    // aggrego le info del prodotto con quelle dello smartphone
    @Override
    public String toString() {
        return super.toString() + "\nil codice IMEI è: " + this.codeIMEI + "\nche ha una memoria RAM di: " + this.memoryRAM;
    }
    

    // getters

    public String getCodeIMEI() {
        return codeIMEI;
    }

    public int getmemoryRAM() {
        return memoryRAM;
    }

    
    // setters

    public void setCodeIMEI(String codeIMEI) {
        if (codeIMEI == null || codeIMEI.equals("")) {
            System.out.println("hai inserito valori errati, non modifico il valore");
        } else {
            this.codeIMEI = codeIMEI;
        }
    }

    public void setmemoryRAM(int memoryRAM) {
        if (memoryRAM <= 0) {
            System.out.println("hai inserito valori errati, non modifico il valore");
        } else {
            this.memoryRAM = memoryRAM;
        }
    }

}
