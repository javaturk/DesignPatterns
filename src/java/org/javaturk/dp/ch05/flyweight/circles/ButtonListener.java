
package org.javaturk.dp.ch05.flyweight.circles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String command = button.getActionCommand();
		switch(command){
		case "Start":
			break;
		case "Stop":
			break;
		}
	}
}
