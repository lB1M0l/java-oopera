//Класс балета
public class Ballet extends MusicalShow{
    private String choreographer; // Хореографф

    public Ballet(String title, int duration, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
