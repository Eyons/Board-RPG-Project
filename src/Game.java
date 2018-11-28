import javax.swing.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Game extends JPanel implements KeyListener{

    private int playerCount;
    private ArrayList<Player> players;

    public Game(int playerCount){
        this.playerCount = playerCount;
        players = new ArrayList<>();
    }
}
