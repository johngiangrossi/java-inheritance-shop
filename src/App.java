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
