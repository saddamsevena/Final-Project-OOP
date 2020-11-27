import javax.swing.JOptionPane;

public class Sudoku {
    public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello. Welcome to a game of Sudoku");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new SudokuBoard();
	}

}
