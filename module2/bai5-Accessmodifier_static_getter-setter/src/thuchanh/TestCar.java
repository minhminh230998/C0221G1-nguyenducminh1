package thuchanh;

public class TestCar {
        public static void main(String[] args) {
            Car.NumberOfCars();
            Car car1=new Car("blue");
            System.out.println(car1.toString());
            Car car2=new Car("black","BMW");
            System.out.println(car2.toString());
        }
}
