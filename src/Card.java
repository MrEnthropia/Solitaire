import javax.swing.*;
import java.awt.*;

public class Card {

    ImageIcon imageFace;
    ImageIcon imageShirt=new ImageIcon("res/Рубашка.png");
    int number;
    int numberPair;

    public void setStatus(STATUS status) {
        this.status = status;
    }

    STATUS status;


    public Card(ImageIcon imageFace, int number, int numberPair) {
        this.imageFace = imageFace;
        this.number = number;
        this.numberPair = numberPair;
        this.status = STATUS.CLOSE;
    }

    public ImageIcon getImageFace() {
        return imageFace;
    }

    public ImageIcon getImageShirt() {
        return imageShirt;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberPair() {
        return numberPair;
    }

    public STATUS getStatus() {
        return status;
    }
}
enum STATUS{
    OPEN,
    CLOSE,
    FOUND
}
