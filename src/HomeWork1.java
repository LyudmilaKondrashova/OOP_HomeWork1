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
        prodList.add(new Cereals("rice", 98.80, 450));
        prodList.add((new Cereals("buckwheat", 74, 400)));
        prodList.add(new Cereals("pearl-barley", 45.70, 350));
        prodList.add(new Chocolate("Milka", 156, "milk"));
        prodList.add(new Chocolate("Alpen Gold", 82, "white"));
        prodList.add(new Chocolate("Dove", 198, "dark"));
        prodList.add(new Chocolate("Nestle", 176, "milk"));

        VendingMachine machine2 = new VendingMachine(prodList);
        System.out.println(machine2);

//        System.out.println(machine2.findByName("kind"));
//        System.out.println(machine2.findByPrice(10));
//        System.out.println(machine2.findByPriceRange(9, 26));
    }
}