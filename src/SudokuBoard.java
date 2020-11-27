import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SudokuBoard {
    private static JTextField gridd [][] = new JTextField[9][9];

    public SudokuBoard (){

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        JMenuItem newLevel = new JMenuItem("Select New Level");
        menu.add(newLevel);
        JMenuItem reset = new JMenuItem("Reset");
        menu.add(reset);
        JMenuItem exit = new JMenuItem("Exit");
        menu.add(exit);

        exitaction e = new exitaction();
        newLevelaction d = new newLevelaction();
 
        exit.addActionListener(e);
        newLevel.addActionListener(d);

		JFrame frame = new JFrame("Sudoku");
		frame.setSize(600,600);
		JPanel board = new JPanel();
        board.setLayout(new GridLayout(3, 3));
        board.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        JPanel grid = new JPanel();
            grid.setLayout(new GridLayout(3, 3));
            for (int i2 = 0; i2 < 3; i2++) {
            for (int j2 = 0; j2 < 3; j2++) {
                gridd[i][j]=new JTextField(1);
                grid.add(gridd[i][j]);
            }
            }
            grid.setBorder(BorderFactory.createEmptyBorder(2,1,1,2));
            grid.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            grid.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 22));
		    grid.setFocusable(false);
            board.add(grid);
            }
        }

        frame.getContentPane().add(board);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public class exitaction implements ActionListener{
        public void actionPerformed (ActionEvent e){
            System.exit(0);
        }
    }
 
    public class newLevelaction implements ActionListener{
        public void actionPerformed (ActionEvent e){
            Level select = new Level(); 
        }
    }
    
}
