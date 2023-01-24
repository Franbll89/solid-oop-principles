package interface_segregation.bad;

public class Dog implements LandAnimal {
    @Override
    public String nameOfAnimal() {
        return "dog";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String talk() {
        return "woof!";
    }

}
