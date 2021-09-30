package ejemplos;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

public class FocusBkgEvent implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		Component sourceComp = e.getComponent();
		if (sourceComp instanceof JButton) {
			JButton icb = (JButton) sourceComp;
			icb.setBackground(Color.WHITE);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		Component sourceComp = e.getComponent();
		if (sourceComp instanceof JButton) {
			JButton icb = (JButton) sourceComp;
			icb.setBackground(Color.GRAY);
		}
	}
	

}
