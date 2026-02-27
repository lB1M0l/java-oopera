public class Main{
    public static void main(String[] args) {
        Actor actor1 = new Actor("Максим", "Фипов",Gender.MALE,180);
        Actor actor2 = new Actor("Игорь", "Крюков",Gender.MALE,177);
        Actor actor3 = new Actor("Татьяна", "Титова",Gender.FEMALE,168);

        Director director1 = new Director("Филип","Таранков",Gender.MALE,3);
        Director director2 = new Director("Ксения","Трубко",Gender.FEMALE,2);

        Show show = new Show("Акробаты",100,director1);
        Opera opera = new Opera("Крик души",70,director2,"Криторы","Либретто 1",10);
        Ballet ballet = new Ballet("Танцевалька",80,director1,"Таптам", "Либретто 2","Виктор Потер"); // В задании не указано, но не праильнее было сделать его Person? Ответьте пожалуйста

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);

        show.printActorList();
        opera.printActorList();
        ballet.printActorList();

        ballet.replaceActor(actor3, "Крюков");
        ballet.printActorList();

        show.replaceActor(actor3,"Попков");

        opera.printLibretto();
        ballet.printLibretto();
    }
}