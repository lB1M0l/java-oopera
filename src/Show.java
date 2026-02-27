import java.util.ArrayList;

// Класс спектакля
public class Show {
    private String title; // Название спектакля
    private int duration; // Длительность в мин
    private Director director; // Режисер
    private ArrayList<Actor> listOfActors = new ArrayList<>(); // Список актеров

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    // Вывод списка актеров
    public void printActorList() {
        System.out.println(title + ", список актеров: ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
        System.out.println();
    }

    // Добавление нового актера
    public void addActor(Actor actor) {
        if (listOfActors == null) {
            System.out.println("Ошибка добавления");
            return;
        }

        if(listOfActors.contains(actor)){
            System.out.println("Актер уже добавлен");
        }else{
            listOfActors.add(actor);
        }
    }

    // Замена актера
    public void replaceActor(Actor repActor, String surname) {
        Actor actorFound = null;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                actorFound = actor;
                break;
            }
        }

        if (actorFound != null) {
            listOfActors.remove(actorFound);
            listOfActors.add(repActor);
        }else {
            System.out.println("Актер не найден!");
        }

    }
}
