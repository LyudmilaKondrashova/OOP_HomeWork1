public class Chocolate extends Product {

    public Chocolate(String name, double price, String sort) {
        super(name, price);
        this.setSort(sort);
    }

    private String sort;

    public String getSort() {
        return sort;
    }

    private void setSort(String sort) {
        this.sort = sort;
    }

    public String toString() {
        return String.format("%s %s", super.toString(), sort);
    }
}
