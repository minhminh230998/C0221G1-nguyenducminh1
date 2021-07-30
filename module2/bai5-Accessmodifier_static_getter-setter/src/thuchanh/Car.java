package thuchanh;

public class Car {
    private String color;
    private String name;
    public  static int numberOfCars;
     Car(String color){
        this.color=color;
        this.name="MCD";
    }
   
    public  Car(String color, String name) {
        this.color = color;
        this.name = name;
        numberOfCars++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    public static void NumberOfCars() {
    }


    @Override
    public String toString() {
        return "Car{" +
                "number="+numberOfCars + '\'' +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

