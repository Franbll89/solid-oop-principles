package interface_segregation.bad;

public class Cat implements LandAnimal {
    @Override
    public String nameOfAnimal() {
        return "cat";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String talk() {
        return "meow!";
    }
}
