package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class VotingBooth {

public static void main(String[] args) {
String yourage= JOptionPane.showInputDialog("how old are you");	
int age = Integer.parseInt(yourage);
if(age>18) {
	JOptionPane.showMessageDialog(null, "Ok then who do you think will be the next president");
if (age<= 18) {
JOptionPane.showMessageDialog(null, "Ok nevermind");

}
	
}
}
}
