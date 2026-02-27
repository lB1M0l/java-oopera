import java.util.ArrayList;

// Класс музыкальных постановок
public class MusicalShow extends Show {
    private String musicAuthor; // Автор музыка
    private String librettoText; // Текст либретто

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто:\n" + librettoText);
    }

}
