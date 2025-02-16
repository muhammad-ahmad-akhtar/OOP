import javax.swing.JOptionPane;

class NameDialogue{

	public static void main(String[] args){

		String name = JOptionPane.showInputDialog("What is your name?");
		String message = String.format("Welcome, %S, to Java Programing!", name);
		
		JOptionPane.showMessageDialog(null, message);
	}
}