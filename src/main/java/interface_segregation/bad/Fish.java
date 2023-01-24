package interface_segregation.bad;

public class Fish implements AquaticAnimal{
    @Override
    public String nameOfAnimal() {
        return "fish";
    }

    @Override
    public String swim() {
        return "the " + nameOfAnimal() + " is swimming!";
    }

    @Override
    public String talk() {
        return null;
    }
}
