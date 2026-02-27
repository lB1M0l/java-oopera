// Класс режисера
public class Director extends Person{
    private int numberOfShows; // Количесто поставленых спектаклей

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorInfo(){
        System.out.println("Режисер: " + super.getName() + " " + getSurname());
    }
}

