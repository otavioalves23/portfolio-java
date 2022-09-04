package portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Cursor;
import java.awt.Toolkit;


public class EtanolXGasolina extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtEtanol;
	private JTextField txtGasolina;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EtanolXGasolina dialog = new EtanolXGasolina();
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
	public EtanolXGasolina() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EtanolXGasolina.class.getResource("/img/fuelpump48.png")));
		setModal(true);
		setTitle("Etanol X Gasolina");
		setBounds(100, 100, 334, 346);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Etanol");
		lblNewLabel.setBounds(10, 25, 60, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gasolina");
		lblNewLabel_1.setBounds(160, 25, 66, 14);
		getContentPane().add(lblNewLabel_1);

		txtEtanol = new JTextField();
		txtEtanol.setBounds(67, 22, 60, 20);
		getContentPane().add(txtEtanol);
		txtEtanol.setColumns(10);

		txtGasolina = new JTextField();
		txtGasolina.setBounds(236, 22, 54, 20);
		getContentPane().add(txtGasolina);
		txtGasolina.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(EtanolXGasolina.class.getResource("/img/calc.png")));
		btnNewButton.setToolTipText("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(63, 74, 64, 64);
		getContentPane().add(btnNewButton);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(EtanolXGasolina.class.getResource("/img/neutro.png")));
		lblStatus.setBounds(0, 147, 320, 160);
		getContentPane().add(lblStatus);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(EtanolXGasolina.class.getResource("/img/eraser.png")));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(226, 74, 64, 64);
		getContentPane().add(btnNewButton_1);
		
		RestrictedTextField validar = new RestrictedTextField(txtEtanol, "123456789.");
		validar.setLimit(99);
		RestrictedTextField validar2 = new RestrictedTextField(txtGasolina, "123456789.");
		validar2.setLimit(99);

	}// fim do construtor

	void calcular() {
		if (txtEtanol.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o valor do Etanol");
			txtEtanol.requestFocus();
		} else if (txtGasolina.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o valor da Gasolina");
			txtGasolina.requestFocus();
		} else {

			// variaveis
			double etanol, gasolina;

			// entrada
			etanol = Double.parseDouble(txtEtanol.getText());
			gasolina = Double.parseDouble(txtGasolina.getText());

			// processamento/saída
			if (etanol < 0.7 * gasolina) {
				// abastecer com etanol
				// JOptionPane.showMessageDialog(null, "Abastecer com Etanol");
				lblStatus.setIcon(new ImageIcon(EtanolXGasolina.class.getResource("/img/etanol.png")));
			} else {
				// abastecer com gasolina
				// JOptionPane.showMessageDialog(null, "Abastecer com Gasolina");
				lblStatus.setIcon(new ImageIcon(EtanolXGasolina.class.getResource("/img/gasolina.png")));
			}
		}
	}
	
	void limpar() {
		txtEtanol.setText(null);
		txtGasolina.setText(null);
		lblStatus.setIcon(new ImageIcon(EtanolXGasolina.class.getResource("/img/neutro.png")));
		txtEtanol.requestFocus();
	}

}// fim do código
