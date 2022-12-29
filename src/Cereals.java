public class Cereals extends Product {

    public Cereals(String name, double price, double weight) {
        super(name, price);
        this.setWeight(weight);
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return String.format("%s %.0f", super.toString(), weight);
    }
}
