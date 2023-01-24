package interface_segregation.bad;

public class Duck implements AerialAnimal, LandAnimal, AquaticAnimal {

    @Override
    public String nameOfAnimal() {
        return "duck";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String fly() {
        return "the " + nameOfAnimal() + " is flying!";
    }

    @Override
    public String swim() {
        return "the " + nameOfAnimal() + " is swimming!";
    }

    @Override
    public String talk() {
        return "quack!";
    }
}
