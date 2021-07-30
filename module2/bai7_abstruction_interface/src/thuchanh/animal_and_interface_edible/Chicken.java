package thuchanh.animal_and_interface_edible;

public abstract class Chicken extends Animal implements Edible {
    @Override
    public void makeSound(){
        System.out.println("gà kêu :chip chip");
    }
    @Override
    public void  howToEat(){
        System.out.println("gà là để ăn");
    }
}
