// here i declare some of the abstract methods that get implemented in the dog and cat classes and their respective subclasses
public interface AdoptableAnimal {
    // this method simply returns the name previously given as a string
    String getName();

    // this method returns the given description of the object as a string
    String getDescription();

    // this method returns the given price as a double
    double getPrice();

}

