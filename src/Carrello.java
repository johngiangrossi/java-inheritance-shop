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
- Smartphone, caratterizzati anche dal codice IME I e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.

Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smartphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
*/


import Headphones.Headphone;
import Products.Product;
import Smartphones.Smartphone;
import Televisions.Television;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) throws Exception {

        /*
        Product product1 = new Product("123456", "S14", "Samsung", 1000.50);

        //product1.stampProductInfo();

        Smartphone smartphone1 = new Smartphone("123456", "S14", "Samsung", 1000.50, "im123456", 64);

        //smartphone1.stampSmartphoneInfo();
        //smartphone1.stampProductInfo();
        smartphone1.stampAllInfo();


        Headphone headphone1 = new Headphone("987654321", "bull", "samsung", 50.4, "red", false);

        //headphone1.stampHeadphoneInfo();
        headphone1.stampAllInfo();


        
        Television television1 = new Television("456123", "vh56", "samsung", 980.00, 1260, true);
        television1.stampAllInfo();
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci se vuoi uno smartphone o un televisore o delle cuffie");
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("inserisci il nome dello smartphone");
        String name = scanner.nextLine();

        System.out.println("inserisci il brand dello smartphone");
        String brand = scanner.nextLine();

        System.out.println("inserisci il prezzo dello smartphone");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product product1 = null;


        // uso if
        /*
        if (userChoice == 1) {
            System.out.println("inserisci il codice IMEI dello smartphone");
            String codeIMEI = scanner.nextLine();
        
            System.out.println("inserisci la RAM dello smartphone");
            int memoryRAM = scanner.nextInt();
            scanner.nextLine();
        
            product1 = new Smartphone(name, brand, price, codeIMEI, memoryRAM);
            System.out.println(product1.toString());
            
        } else if (userChoice == 2) {
            System.out.println("inserisci le dimensioni del televisore");
            int dimension = scanner.nextInt();
            scanner.nextLine();
        
            System.out.println("inserisci true se è smart o false se è non è smart");
            boolean smart = scanner.nextBoolean();
            scanner.nextLine();
        
            product1 = new Television(name, brand, price, dimension, smart);
            System.out.println(product1.toString());
        } else if (userChoice == 3) {
            System.out.println("inserisci il colore delle cuffie");
            String color = scanner.nextLine();
        
            System.out.println("inserisci true se è wireless o false se è non è wireless");
            boolean wireless = scanner.nextBoolean();
            scanner.nextLine();
        
            product1 = new Headphone(name, brand, price, color, wireless);
            System.out.println(product1.toString());
        } else {
            System.out.println("hai inserito il valore sbagliato");
        }
        */
        
        switch (userChoice) {
            case 1 -> {
                System.out.println("inserisci il codice IMEI dello smartphone");
                String codeIMEI = scanner.nextLine();

                System.out.println("inserisci la RAM dello smartphone");
                int memoryRAM = scanner.nextInt();
                scanner.nextLine();

                product1 = new Smartphone(name, brand, price, codeIMEI, memoryRAM);
                System.out.println(product1.toString());
            }
            case 2 -> {
                System.out.println("inserisci le dimensioni del televisore");
                int dimension = scanner.nextInt();
                scanner.nextLine();

                System.out.println("inserisci true se è smart o false se è non è smart");
                boolean smart = scanner.nextBoolean();
                scanner.nextLine();

                product1 = new Television(name, brand, price, dimension, smart);
                System.out.println(product1.toString());
            }
            case 3 -> {
                System.out.println("inserisci il colore delle cuffie");
                String color = scanner.nextLine();

                System.out.println("inserisci true se è wireless o false se è non è wireless");
                boolean wireless = scanner.nextBoolean();
                scanner.nextLine();

                product1 = new Headphone(name, brand, price, color, wireless);
                System.out.println(product1.toString());
            }
            default -> System.out.println("hai inserito il valore sbagliato");
        }
    }
}
