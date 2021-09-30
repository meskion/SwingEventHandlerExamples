package ejemplos;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelGrowEvent implements MouseWheelListener{
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		
		Component growButton = e.getComponent();
		
		growButton.setSize(growButton.getWidth() + 10, growButton.getHeight()+10);
	}

}
