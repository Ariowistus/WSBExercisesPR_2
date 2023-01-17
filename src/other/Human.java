package other;

import creatures.Animal;
import devices.Car;
import devices.Phone;


import java.time.LocalDateTime;

public class Human {
    public String name;
    public Phone phone;
    int age;

    public Animal pet;
     Car car;
    private Double salary;
    public Double cash;
    private boolean isForSale = false;


    public Human(String name, int age, Double cash, Double salary, Animal pet, Car car, Phone phone) {
        this.name = name;
        this.age = age;
        this.cash = cash;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
        this.phone = phone;

    }

    public void sell() {
        if (isForSale) {
            System.out.println("Niestety, sprzedaż ludzi jest zabroniona i jest to przestępstwo!");
        } else {
            System.out.println("Nie sprzedajemy ludzi.");
        }
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        if(car == null){
            throw new NullPointerException("Seller sprzedał ostatni samochód");
        }
        if (car.price <=cash) {
            System.out.println("Udało się kupić za gotówkę");
            this.car = car;
        } else if (car.price <= salary) {
            System.out.println("Udało się kupić na kredyt (no trudno)");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (isForSale != human.isForSale) return false;
        if (!name.equals(human.name)) return false;
        if (!phone.equals(human.phone)) return false;
        if (!pet.equals(human.pet)) return false;
        if (!car.equals(human.car)) return false;
        if (!salary.equals(human.salary)) return false;
        return cash.equals(human.cash);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + age;
        result = 31 * result + pet.hashCode();
        result = 31 * result + car.hashCode();
        result = 31 * result + salary.hashCode();
        result = 31 * result + cash.hashCode();
        result = 31 * result + (isForSale ? 1 : 0);
        return result;
    }


}




