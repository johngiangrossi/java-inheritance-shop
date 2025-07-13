/*
Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
- Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
*/


import Headphones.Headphone;
import Products.Product;
import Smartphones.Smartphone;
import Televisions.Television;

public class App {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product("123456", "S14", "Samsung", 1000.50);

        //product1.stampProductInfo();

        Smartphone smartphone1 = new Smartphone("123456", "S14", "Samsung", 1000.50, "im123456", 64);

        //smartphone1.stampSmartphoneInfo();
        //smartphone1.stampProductInfo();
        smartphone1.stampSmartphoneAllInfo();


        Headphone headphone1 = new Headphone("987654321", "bull", "samsung", 50.4, "red", false);

        //headphone1.stampHeadphoneInfo();
        headphone1.stampHeadphoneAllInfo();


        
        Television television1 = new Television("456123", "vh56", "samsung", 980.00, 1260, true);
        television1.stampTelevisionAllInfo();
        
    }
}
