import java.util.Random;

public class Human {
    String name;
    String surname;
    int yearOfBirth;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, Human mother, Human father) {
        this(name, surname, yearOfBirth);
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, yearOfBirth);
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {

    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        String slyness = pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + ", is " + pet.age + " years old, he is " + slyness);
    }

    public boolean feedPet(boolean isTimeToFeed) {
        if (isTimeToFeed) {
            System.out.println("Hm... I will feed " + pet.nickname);
            return true;
        } else {
            Random rand = new Random();
            int randomNum = rand.nextInt(101);
            if (pet.trickLevel > randomNum) {
                System.out.println("Hm... I will feed " + pet.nickname);
                return true;
            } else {
                System.out.println("I think " + pet.nickname + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + yearOfBirth + ", iq=" + iq + ", mother=" + (mother != null ? mother.name + " " + mother.surname : "None") +
                ", father=" + (father != null ? father.name + " " + father.surname : "None") + ", pet=" + pet + "}";
    }
}
