package ejemplos;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class ChangeColorButtonEvent extends MouseAdapter {// implements MouseListener
	/*Que implemente a la interfaz viene implicito en que extiende
	 *  de MouseAdapter, que ya la implementa*/

	@Override
	public void mouseExited(MouseEvent e) {

		Component sourceComp = e.getComponent();
		if (sourceComp instanceof JButton) {
			JButton colorChangeButton = (JButton) sourceComp;
			colorChangeButton.setBackground(Color.BLUE);
			colorChangeButton.setText("blue");

		}

	}

	public void mouseEntered(MouseEvent e) {
		Component sourceComp = e.getComponent();
		if (sourceComp instanceof JButton) {
			JButton colorChangeButton = (JButton) sourceComp;
			colorChangeButton.setBackground(Color.RED);
			colorChangeButton.setText("red");
		}
	}

}
