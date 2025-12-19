abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDone = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose done. Please pay 250rs");
            firstDone = true;
        } else {
            System.out.println("Not eligible for first dose");
        }
    }

    void secondDose() {
        if (firstDone)
            System.out.println("Second dose done");
        else
            System.out.println("Please complete first dose");
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    void boosterDose() {
        System.out.println("Booster dose done");
    }
}

public class Vaccination {
    public static void main(String[] args) {
        Vaccine v = new VaccinationSuccessful(18, "Indian");
        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}
