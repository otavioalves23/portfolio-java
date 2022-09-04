package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Tabuada extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTabuada;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada dialog = new Tabuada();
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
	public Tabuada() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tabuada.class.getResource("/img/multiplication48.png")));
		setTitle("Tabuada");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 310, 529);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tabuada");
		lblNewLabel.setBounds(31, 48, 60, 14);
		getContentPane().add(lblNewLabel);

		txtTabuada = new JTextField();
		txtTabuada.setBounds(90, 45, 86, 20);
		getContentPane().add(txtTabuada);
		txtTabuada.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.setIcon(new ImageIcon(Tabuada.class.getResource("/img/calc.png")));
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setBorderPainted(false);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(45, 91, 64, 64);
		getContentPane().add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(Tabuada.class.getResource("/img/eraser.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setAutoscrolls(true);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(172, 91, 64, 64);
		getContentPane().add(btnLimpar);

		txtArea = new JTextArea();
		txtArea.setBounds(31, 171, 228, 284);
		getContentPane().add(txtArea);

		RestrictedTextField validar = new RestrictedTextField(txtTabuada, "123456789");
		validar.setLimit(1);

	}// fim do construtor

	void calcular() {
		if (txtTabuada.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Escolha uma tabuada");
			txtTabuada.requestFocus();
		} else {
			// vari�veis + entrada
			int valor = Integer.parseInt(txtTabuada.getText());
			// processamento + sa�da
			for (int i = 1; i < 11; i++) {
				txtArea.append(" " + String.valueOf(valor) + " x " + String.valueOf(i) + " = "
						+ String.valueOf(valor * i) + "\n");
			}
		}
	}

	void limpar() {
		txtTabuada.setText(null);
		txtArea.setText(null);
	}

}// fim do c�digo
