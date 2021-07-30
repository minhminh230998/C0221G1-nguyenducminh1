package thuchanh.animal_and_interface_edible;

public class Fruit implements Edible {
private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void howToEat() {
        System.out.println(getName()+" có thể ăn được");
    }


    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }


}
