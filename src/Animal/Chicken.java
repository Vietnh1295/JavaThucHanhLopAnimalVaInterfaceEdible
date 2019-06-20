package Animal;


import Edible.Edible;

public  class Chicken extends Animal implements Edible {
    public String makeSound()
    {
        return "Chiken";
    }
    public String howtoEat()
    {
        return "Eat alive";
    }
}
