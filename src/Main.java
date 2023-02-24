import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("tesla", LocalDate.of(2022, 2, 22), 45000, TypeOfKusov.HETCHBACK);
        Car car1 = new Car("Toyato rav4", LocalDate.of(2023, 2, 22), 35000, TypeOfKusov.KROSSOVER);
        Car car2 = new Car("mercedes bens s class", LocalDate.of(2020, 2, 22), 55000, TypeOfKusov.SEDAN);
        Car car3 = new Car("leksus 570", LocalDate.of(2022, 2, 22), 60000, TypeOfKusov.VNEDOROJNIC);
        Car car4 = new Car("passat b4", LocalDate.of(2022, 2, 22), 45000, TypeOfKusov.UNOIMVERSAL);
        Car[] cars = {car4, car1, car4, car2, car3, car};


        car.typeCucovSerch(cars, "leksus 570");
        car.yearOFMade(cars, "leksus 570");


    }
}