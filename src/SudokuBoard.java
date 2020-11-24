import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
 
public class SudokuBoard extends JFrame {
 
    public final int SQUARE_COUNT = 9;
    public Squares [] squares = new Squares[SQUARE_COUNT];
 
    public SudokuBoard(){
 
        super("Sudoku");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 
        JPanel panel = new JPanel(new GridLayout(3,3));
        for(int i=0; i<SQUARE_COUNT; i++){
            squares[i] = new Squares();
            panel.add(squares[i]);
        }
 
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
 
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
 
        JMenuItem newLevel = new JMenuItem("Select New Level");
        menu.add(newLevel);
 
        JMenuItem reset = new JMenuItem("Reset");
        menu.add(reset);
 
        JMenuItem exit = new JMenuItem("Exit");
        menu.add(exit);
 
        add(panel, BorderLayout.CENTER);
 
        setVisible(true);
        setLocationRelativeTo(null);
 
    }
 
    public class exitaction implements ActionListener{
        public void actionPerformed (ActionEvent e){
            System.exit(0);
        }
    }

    public static void main(String[] args) { 
        SudokuBoard board = new SudokuBoard();
 
    }    
 }