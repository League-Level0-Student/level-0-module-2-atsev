import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("How old are you?");
	int y = Integer.parseInt(x);
	if (y>=18) {
		JOptionPane.showInputDialog("Who do you think will be the next president?");
	}		
	
	if (y<18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
}
}
