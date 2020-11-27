import javax.swing.*;
import java.awt.*;

public class Level {
    final JButton startButton = new JButton("Start");
    public Level (){
        JFrame frame = new JFrame("Difficulty");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel difficultyLabel = new JLabel("Select difficulty:");
		difficultyLabel.setFont(new Font("Calibri Light", Font.BOLD, 16));
		difficultyLabel.setBounds(435, 70, 155, 24);
		frame.getContentPane().add(difficultyLabel);

		final JRadioButton easyButton = new JRadioButton("Easy");
		easyButton.setFont(new Font("Calibri Light", Font.BOLD, 13));
		easyButton.setBounds(435, 103, 127, 25);
		frame.getContentPane().add(easyButton);

		final JRadioButton mediumButton = new JRadioButton("Medium");
		mediumButton.setFont(new Font("Calibri Light", Font.BOLD, 13));
		mediumButton.setBounds(435, 133, 127, 25);
		frame.getContentPane().add(mediumButton);

		final JRadioButton hardButton = new JRadioButton("Hard");
		hardButton.setFont(new Font("Calibri Light", Font.BOLD, 13));
		hardButton.setBounds(435, 163, 127, 25);
		frame.getContentPane().add(hardButton);

		ButtonGroup bg = new ButtonGroup();
		bg.add(easyButton);
		bg.add(mediumButton);
		bg.add(hardButton);
        bg.setSelected(mediumButton.getModel(), true);
        startButton.setBounds(400, 198, 123, 20);
		frame.getContentPane().add(startButton);
		startButton.setFont(new Font("Calibri Light", Font.ITALIC, 12));
    }
}
