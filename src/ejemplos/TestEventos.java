package ejemplos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import java.awt.Dimension;

public class TestEventos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestEventos frame = new TestEventos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {40, 108, 63, 133, 95, 30};
		gbl_contentPane.rowHeights = new int[] { 21, 0, 0, 0, 0, 50, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		
				JButton growButton = new JButton("GROW");
				int baseWidth = growButton.getWidth();
				int baseHeigth = growButton.getHeight();
				
						growButton.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								growButton.setSize(baseWidth, baseHeigth);
								contentPane.updateUI();
							}
						});
						growButton.addMouseWheelListener(new MouseWheelGrowEvent());
								JTextPane descGrowButton = new JTextPane();
								descGrowButton.setText("Con la rueda del rat\u00F3n crezco, si me pinchas vuelvo a mi estado original");
								descGrowButton.setEditable(false);
								GridBagConstraints gbc_descGrowButton = new GridBagConstraints();
								gbc_descGrowButton.gridwidth = 2;
								gbc_descGrowButton.insets = new Insets(0, 0, 5, 5);
								gbc_descGrowButton.fill = GridBagConstraints.HORIZONTAL;
								gbc_descGrowButton.gridx = 1;
								gbc_descGrowButton.gridy = 2;
								contentPane.add(descGrowButton, gbc_descGrowButton);
						
								GridBagConstraints gbc_growButton = new GridBagConstraints();
								gbc_growButton.fill = GridBagConstraints.BOTH;
								gbc_growButton.insets = new Insets(0, 0, 5, 5);
								gbc_growButton.gridx = 3;
								gbc_growButton.gridy = 2;
								contentPane.add(growButton, gbc_growButton);

		placeButtonDescriptions();
	}

	private void placeButtonDescriptions() {
												
														JButton colorChangeButton = new JButton("blue");
														colorChangeButton.setForeground(Color.LIGHT_GRAY);
														colorChangeButton.setMaximumSize(new Dimension(70, 21));
														colorChangeButton.setMinimumSize(new Dimension(70, 21));
														colorChangeButton.setBorderPainted(false);
														colorChangeButton.setBackground(Color.BLUE);
														colorChangeButton.addMouseListener(new ChangeColorButtonEvent());
																
																		JTextPane descColorButton = new JTextPane();
																		descColorButton.setText("Cuando pasan el raton por encima m\u00EDa cambio de color!");
																		descColorButton.setEditable(false);
																		GridBagConstraints gbc_descColorButton = new GridBagConstraints();
																		gbc_descColorButton.gridwidth = 2;
																		gbc_descColorButton.insets = new Insets(0, 0, 5, 5);
																		gbc_descColorButton.fill = GridBagConstraints.BOTH;
																		gbc_descColorButton.gridx = 1;
																		gbc_descColorButton.gridy = 3;
																		contentPane.add(descColorButton, gbc_descColorButton);
														
																GridBagConstraints gbc_colorChangeButton = new GridBagConstraints();
																gbc_colorChangeButton.fill = GridBagConstraints.BOTH;
																gbc_colorChangeButton.insets = new Insets(0, 0, 5, 5);
																gbc_colorChangeButton.gridx = 3;
																gbc_colorChangeButton.gridy = 3;
																contentPane.add(colorChangeButton, gbc_colorChangeButton);
																		
																				JButton indentityCrisisButton = new JButton("Change me!!!");
																				indentityCrisisButton.setBackground(Color.GRAY);
																				JButton icb = indentityCrisisButton;
																				
																						indentityCrisisButton.addFocusListener(new FocusBkgEvent());
																						
																								indentityCrisisButton.addKeyListener(new KeyAdapter() {
																									@Override
																									public void keyPressed(KeyEvent e) {
																										String str = icb.getText();
																										if (indentityCrisisButton.isFocusOwner()) {
																						
																											if (e.getKeyCode() == 8 && !str.isEmpty()) {
																												icb.setText(str.substring(0, str.length() - 1));
																						
																											} else if (e.getKeyCode() >= 48 && e.getKeyCode() <= 90 || e.getKeyCode() == 32) {
																												char keyPressed = e.getKeyChar();
																												icb.setText(str + keyPressed);
																											}
																						
																										}
																									}
																								});
																										
																												JTextPane descIndentityButton = new JTextPane();
																												descIndentityButton.setEditable(false);
																												descIndentityButton.setText("Si gano el foco puedes editar mi mensaje!");
																												GridBagConstraints gbc_descIndentityButton = new GridBagConstraints();
																												gbc_descIndentityButton.gridwidth = 2;
																												gbc_descIndentityButton.insets = new Insets(0, 0, 5, 5);
																												gbc_descIndentityButton.fill = GridBagConstraints.BOTH;
																												gbc_descIndentityButton.gridx = 1;
																												gbc_descIndentityButton.gridy = 4;
																												contentPane.add(descIndentityButton, gbc_descIndentityButton);
																								
																										GridBagConstraints gbc_indentityCrisisButton = new GridBagConstraints();
																										gbc_indentityCrisisButton.fill = GridBagConstraints.BOTH;
																										gbc_indentityCrisisButton.insets = new Insets(0, 0, 5, 5);
																										gbc_indentityCrisisButton.gridx = 3;
																										gbc_indentityCrisisButton.gridy = 4;
																										contentPane.add(indentityCrisisButton, gbc_indentityCrisisButton);
	}

}
