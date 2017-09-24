import javax.swing.JOptionPane;
public class RollerCoaster {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("How tall are you in feet(whole numbers)?");
	int y = Integer.parseInt(x);
	String a = JOptionPane.showInputDialog("How tall are you in inches (0-12)");
	int b = Integer.parseInt(a);
int total_inches = (y*12) + b;
if (total_inches>=48) {
	JOptionPane.showMessageDialog(null, "You can go on the rollercoaster!");
}
if (total_inches<48) {
	JOptionPane.showMessageDialog(null, "You can't go on the rollercoaster!");
}
}
}

