import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;
    private String[][] schedule;
    private Family family;


    static {
        System.out.println("Loading a new Human class...");
    }


    {
        System.out.println("Creating a new Human object...");
    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, int iq, String[][] schedule) {
        this(name, surname, yearOfBirth);
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {

    }


    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + yearOfBirth + ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) + "}";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this==comparedObject) {
            return true;
        }
        if (comparedObject==null || getClass()!=comparedObject.getClass()) {
            return false;
        }

        Human comparedHuman =(Human) comparedObject;

        return yearOfBirth==comparedHuman.yearOfBirth &&
                iq==comparedHuman.iq &&
                Objects.equals(name,comparedHuman.name) &&
                Objects.equals(surname, comparedHuman.surname) &&
                Arrays.deepEquals(schedule, comparedHuman.schedule);
                // I did not compare Family objects, because this might lead to cyclic references and infinite loops
                // as I also compare Human objects in Family class.

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + yearOfBirth;
        result = 31 * result + iq;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(surname);
        result = 31 * result + Arrays.deepHashCode(schedule);
        // I did not consider hashcode for Family objects, because this might lead to cyclic references and infinite loops
        // as I also consider hashcode for Human objects in Family class.
        return result;
    }

}