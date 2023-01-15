import java.time.LocalDateTime;
import java.util.Locale;

public class Human {
    String name;
    int age;
    int weight;
    int height;
    Animal pet;
    Car car;
    private Double salary;


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




