package other;

import creatures.Animal;
import devices.Car;
import devices.Phone;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Human {
    public String name;
    private static final int DEFAULT_GARAGE_SIZE = 5;
    public int garageSize;
    public Phone phone;
    int age;

    public Animal pet;
    public List<Car> garage;
    private Double salary;
    public Double cash;
    private boolean isForSale = false;

    public Human(String name, int age, Double salary, Double cash) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cash = cash;
        this.garage = new ArrayList<>(DEFAULT_GARAGE_SIZE);
    }

    public Human(List<Car> garage,int garageSize) {
        this.garage = garage;
        this.garageSize = garageSize;
    }

    public void sell() {
        if (isForSale) {
            System.out.println("Niestety, sprzedaż ludzi jest zabroniona i jest to przestępstwo!");
        } else {
            System.out.println("Nie sprzedajemy ludzi.");
        }
    }

    public int getGarageSize() {
        return garage.size();
    }

    public Car getCar(int parkingSpot) {
        return garage.get(parkingSpot);
    }

    public void setCar(int parkingSpot, Car car) {
        garage.set(parkingSpot, car);
    }


    public void sortCarsByYear() {
        garage.sort((car1, car2) -> car1.getYearOfProduction() - car2.getYearOfProduction());
    }

//    public Car getCar() {
//        return car;
//    }
//    public void setCar(Car car) {
//        if(car == null){
//            throw new NullPointerException("Seller sprzedał ostatni samochód");
//        }
//        if (car.price <=cash) {
//            System.out.println("Udało się kupić za gotówkę");
//            this.car = car;
//        } else if (car.price <= salary) {
//            System.out.println("Udało się kupić na kredyt (no trudno)");
//            this.car = car;
//        } else {
//            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
//        }
//    }

    public Double getSalary() {
        System.out.println("Data pobrania wynagrodzenia: " + LocalDateTime.now());
        System.out.println("Wartość wynagrodzenia przed zwróceniem: " + salary);
        return salary;
    }
    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nie można przypisać ujemnej wartości wypłaty.");
            return;
        }
        System.out.println("Nowe dane zostały wysłane do systemu ");
        System.out.println("Konieczność odebrania aneksu do umowy od Pani Ani z kadr.");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty nie uciekniesz .");
        this.salary = salary;
    }







}




