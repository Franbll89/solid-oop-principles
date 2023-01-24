package interface_segregation.bad;

public class Dog implements Animal{
    @Override
    public String nameOfAnimal() {
        return "dog";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String swim() {
        return null;
    }

    @Override
    public String bark() {
        return "woof!";
    }

    @Override
    public String quack() {
        return null;
    }

    @Override
    public String meow() {
        return null;
    }
}
