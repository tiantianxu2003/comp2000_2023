import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    int x;
    int y;
    static int size = 35;

    public Cell(int inX, int inY){
        x= inX;
        y = inY;
    }
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }
}
