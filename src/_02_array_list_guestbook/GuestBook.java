package _02_array_list_guestbook;

import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuestBook implements ActionListener {
	public static void main(String [] args) {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		new GuestBook().setup();
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	}
		JButton button = new JButton();	
		JButton button2 = new JButton();
		ArrayList <String> list = new ArrayList <String> ();
	public void setup() {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.getContentPane().add(panel);
		panel.add(button);
		panel.add(button2);
		button.setText("Add Name");
		button2.setText("View Names");
		button.addActionListener(this);
		button2.addActionListener(this);
		
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == button) {
			String input = JOptionPane.showInputDialog("Enter a name");
			list.add("Guest #" +(list.size()+1)	+ ": " +input);
		}
		else if(buttonPressed == button2) {
			JOptionPane.showMessageDialog(null, list);
		}
	}
}
