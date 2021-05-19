import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class SudukoSolvingMachine extends JFrame {
	private JTable table;
	Object[][] values = {
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,},
	};
    String[] columnNames = {"Row 1","Row 2","Row 3","Row 4","Row 5","Row 6","Row 7","Row 8","Row 9",};
	public SudukoSolvingMachine() {
		getContentPane().setLayout(null);
		
		table = new JTable(values,columnNames);
		table.setBounds(72, 23, 294, 242);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Suduko Solver");
		lblNewLabel.setBounds(156, 0, 99, 25);
		getContentPane().add(lblNewLabel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
