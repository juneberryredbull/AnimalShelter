public class Schnauzer extends Dog {
    // again, some variables that get pulled from the methods defined in AdoptableAnimal
    String name;
    String description;
    double price;

    // a constructor
    public Schnauzer(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // all the overrides from AdoptableAnimal and the abstract method from the Dog class to return the breed as a string
    @Override
    public String getBreed() {
        return "Schnauzer";
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
