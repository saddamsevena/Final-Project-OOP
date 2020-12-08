// import class untuk mengacak angka dalam tile Sudoku
import java.util.Random;

public class SudokuPuzzle {
    // deklarasi jumlah grid
    public static final int grid = 9;    // ukuran grid 9x9
    public static final int subgrid = 3; // ukuran subgrid 3x3

    public static Random random = new Random();     // instansiasi objek dari class Random

    // inisialisasi elemen dari setiap tile
    // array dg index puzzle 0-8
    private static int[][] sudokupuzzle = {
        { 5, 9, 8, 2, 7, 4, 3, 6, 1 },
        { 4, 7, 2, 1, 6, 3, 9, 5, 8 },
        { 1, 3, 6, 8, 5, 9, 2, 4, 7 },
        
        { 3, 6, 1, 9, 2, 7, 4, 8, 5 },
        { 2, 4, 7, 6, 8, 5, 1, 3, 9 },
        { 9, 8, 5, 4, 3, 1, 7, 2, 6 },
        
        { 7, 2, 3, 5, 1, 8, 6, 9, 4 },
        { 8, 1, 9, 3, 4, 6, 5, 7, 2 },
        { 6, 5, 4, 7, 9, 2, 8, 1, 3 }
    };

    private static int[][] generateSudoku() {
        int[] rowTemplate;
        for(int i=0; i<10; i++) {
            // acak nomor baris 1-9
            // utk i=0. misal dirandom dan didapat rowNumber = 1
            // utk i=1. misal dirandom dan didapat rowNumber = 2
            int rowNumber = (random.nextInt(subgrid));
            int newRow = (rowNumber*subgrid) / grid;
            // tukar baris 
            rowTemplate = sudokupuzzle[rowNumber];
            sudokupuzzle[rowNumber] = sudokupuzzle[newRow];
            sudokupuzzle[newRow] = rowTemplate;
        }
        return sudokupuzzle;
    }

    public static int[][] getPuzzle() { //mereturn puzzle sudoku 
        return generateSudoku(); 
    }
}