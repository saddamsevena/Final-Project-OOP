import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
 
 
public class Squares extends JPanel {
 
    public final int CELL_COUNT = 9;
    public Cell [] cells = new Cell[CELL_COUNT];
 
    public Squares(){
        this.setLayout(new GridLayout(3,3));
        this.setBorder(new LineBorder(Color.BLACK,2));
        for(int i =0; i<CELL_COUNT; i++){
            cells[i] = new Cell();
            this.add(cells[i]);
        }
    }
 
    public class Cell extends JTextField{
        public Cell(){
 
        }
 
    }
 
}
