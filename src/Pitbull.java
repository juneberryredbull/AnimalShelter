public class Pitbull extends Dog {
    // basically more of the same
    String name;
    String description;
    int price;

    public Pitbull(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // same as schnauzer class
    @Override
    public String getBreed() {
        return "Pitbull";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
