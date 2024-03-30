public class Cat implements AdoptableAnimal {
    // a couple declared variables for name, description, and price, which the methods previously outlined will pull
    String name;
    String description;
    double price;

    // a constructor for the Cat object
    public Cat(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // down here are all the overrides where the methods get implemented from AdoptableAnimal interface
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
