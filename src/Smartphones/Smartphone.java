package Smartphones;

import Products.Product;

public class Smartphone extends Product {

    // fields
    private String codeIMEI;
    private int memoryRAM;
    
    // costruttore
    public Smartphone(String code, String name, String brand, double price, String codeIMEI, int memoryRAM) {
        super(code, name, brand, price);
        if (codeIMEI == null || codeIMEI.equals("") || memoryRAM <= 0) {
            System.out.println("hai inserito valori errati, uso quelli di defautl");
        } else {
            this.codeIMEI = codeIMEI;
            this.memoryRAM = memoryRAM;
        }
    }



    // metodi
    // stampo le informazioni smartphone
    public void stampSmartphoneInfo() {
        System.out.println("il codice IMEI è: " + codeIMEI + " che ha una memoria RAM di: " + memoryRAM);
    }

    // aggrego le info del prodotto con quelle dello smartphone
    public void stampSmartphoneAllInfo() {
        stampProductInfo();
        stampSmartphoneInfo();
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
