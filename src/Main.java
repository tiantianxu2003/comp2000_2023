import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Graphics;
public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

  class Canves extends JPanel{
    Grid grid = new Grid();

    public Canves(){
        setPreferredSize(new Dimension(720, 720));

    }
    @Override
    public void paint(Graphics g){
        grid.paint(g);
    }
}

    private Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canves canves = new Canves();
        this.setContentPane(canves);
        this.pack();
        this.setVisible(true);
 }
}

