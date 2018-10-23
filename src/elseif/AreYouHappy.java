package elseif;
import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	 String mood  = JOptionPane.showInputDialog("Are you Happy?");
	  if (mood.equals("yes")) { 
		  JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
	 }
	  else {
		  String blu = JOptionPane.showInputDialog(null, "Do you want to be happy ");
		  if (blu.equals("no")) {
			  JOptionPane.showMessageDialog(null, "Keep doing whatever youre doing" );
		  }
		  if (blu.equals("yes")) {
			  JOptionPane.showMessageDialog(null, "Then change something");
		  }
	  }
			 
}
}