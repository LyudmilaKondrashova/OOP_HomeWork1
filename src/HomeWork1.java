import java.util.ArrayList;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {
        Product water = new Product("H2O", 25.20);

        System.out.println(water);

        VendingMachine machine1 = new VendingMachine();
        System.out.println(machine1);

        List<Product> prodList = new ArrayList<>();
        prodList.add(water);
        prodList.add(new Product("vine", 120.45));
        prodList.add(new Product("dust", 10));
        prodList.add(new Soda("kind", 19, "grape"));

        VendingMachine machine2 = new VendingMachine(prodList);
        System.out.println(machine2);

        System.out.println(machine2.findByName("kind"));
        System.out.println(machine2.findByPrice(10));
        System.out.println(machine2.findByPriceRange(9, 26));
    }
}