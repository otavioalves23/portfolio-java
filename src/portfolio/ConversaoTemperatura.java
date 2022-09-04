package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Toolkit;

public class ConversaoTemperatura extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtF;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversaoTemperatura dialog = new ConversaoTemperatura();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConversaoTemperatura() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(ConversaoTemperatura.class.getResource("/img/celsius48.png")));
		setTitle("Convers\u00E3o de Temperatura");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 51, 83, 14);
		getContentPane().add(lblNewLabel);

		txtF = new JTextField();
		txtF.setBounds(150, 50, 86, 20);
		getContentPane().add(txtF);
		txtF.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Celsius");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 164, 83, 14);
		getContentPane().add(lblNewLabel_1);

		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setBounds(153, 163, 83, 20);
		getContentPane().add(txtC);
		txtC.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(ConversaoTemperatura.class.getResource("/img/Temperatura.png")));
		btnNewButton.setToolTipText("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				converter();
			}
		});
		btnNewButton.setBounds(160, 81, 64, 64);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ConversaoTemperatura.class.getResource("/img/eraser.png")));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(360, 186, 64, 64);
		getContentPane().add(btnNewButton_1);

		RestrictedTextField validar = new RestrictedTextField(txtF, "123456789.");
		validar.setLimit(99);
		RestrictedTextField validar2 = new RestrictedTextField(txtC, "123456789.");
		validar2.setLimit(99);

	} // fim do construtor

	void converter() {
		if (txtF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a temperatura em Fahrenheit");
			txtF.requestFocus();
		} else {
			// vari�veis
			double c, f;
			// entrada
			f = Double.parseDouble(txtF.getText());
			// processamento
			c = (5 * (f - 32)) / 9;

			// sa�da
			// a linha abaixo exibe o conte�do da vari�vel c na caixa de texto (� necess�rio
			// converter para String)
			txtC.setText(String.valueOf(c));
		}
	}

	void limpar() {
		txtF.setText(null);
		txtC.setText(null);
	}
}
