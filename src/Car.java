import java.time.LocalDate;
import java.time.Period;

public class Car implements Methods {


    private String brandl;
    private LocalDate localDate;
    private int price;
    private TypeOfKusov typeOfKusov;
    private Car[] cars;

    public Car(String brandl, LocalDate localDate, int price, TypeOfKusov typeOfKusov) {
        this.brandl = brandl;
        this.localDate = localDate;
        this.price = price;
        this.typeOfKusov = typeOfKusov;
    }

    public String getBrandl() {
        return brandl;
    }

    public void setBrandl(String brandl) {
        this.brandl = brandl;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypeOfKusov getTypeOfKusov() {
        return typeOfKusov;
    }

    public void setTypeOfKusov(TypeOfKusov typeOfKusov) {
        this.typeOfKusov = typeOfKusov;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }


    //    @Override
    public void typeCucovSerch(Car[] cars, String carName) {

        for (Car c : cars) {

            if (c.getBrandl().equals(carName)) {
                if (c.typeOfKusov == TypeOfKusov.HETCHBACK) {
                    System.out.println("legokovoi clasyndagy mashina ");
                } else if (c.typeOfKusov == TypeOfKusov.VNEDOROJNIC) {
                    System.out.println("vnedorojnic classyndagy mashina ");
                } else if (c.typeOfKusov == TypeOfKusov.SEDAN) {
                    System.out.println("legkovoi classyndagy mashina  ");
                } else if (c.typeOfKusov == TypeOfKusov.KROSSOVER) {
                    System.out.println("vnedorojnic classyndagy mashina");
                } else if (c.typeOfKusov == TypeOfKusov.UNOIMVERSAL) {
                    System.out.println("universal classyndagy mashina ");
                    System.out.println(c.getTypeOfKusov().name());

                }
                System.out.println(c.getTypeOfKusov().name());
            }

        }
    }

    @Override
    public void yearOFMade(Car[] cars, String carName) {
        for (Car p : cars)

            if (p.getBrandl().equals(carName)) {
                Period ped = Period.between(p.getLocalDate(), LocalDate.now());
                System.out.println("year :"+ped.getYears());

            }
    }


    public Car(String brandl, LocalDate localDate, int price, TypeOfKusov typeOfKusov, Car[] cars) {
        this.brandl = brandl;
        this.localDate = localDate;
        this.price = price;
        this.typeOfKusov = typeOfKusov;
        this.cars = cars;


    }


    @Override

    public String toString() {
        return "\nCar  :" +
                "\nbrandl :" + brandl +
                "\n localDate :" + localDate +
                "\n price  :" + price +
                "\n typeOfKusov  " + typeOfKusov
                ;
    }
}
