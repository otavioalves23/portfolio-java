package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Eleitor extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleitor dialog = new Eleitor();
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
	public Eleitor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Eleitor.class.getResource("/img/election48.png")));
		setTitle("Eleitor");
		setBounds(100, 100, 238, 211);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setBounds(23, 32, 46, 14);
		getContentPane().add(lblNewLabel);

		txtIdade = new JTextField();
		txtIdade.setBounds(67, 29, 86, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Eleitor.class.getResource("/img/check.png")));
		btnNewButton.setToolTipText("Verificar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar();
			}
		});
		btnNewButton.setBounds(23, 97, 64, 64);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Eleitor.class.getResource("/img/eraser.png")));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(136, 97, 64, 64);
		getContentPane().add(btnNewButton_1);

		RestrictedTextField validar = new RestrictedTextField(txtIdade, "123456789");
		validar.setLimit(3);

	}// fim do construtor

	void verificar() {
		if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a idade");
			txtIdade.requestFocus();
		} else {
			// variaveis
			int idade;

			// entrada
			idade = Integer.parseInt(txtIdade.getText());

			// processamento/sa�da
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Voto proíbido");
			} else if (idade > 17 && idade < 71) {
				JOptionPane.showMessageDialog(null, "Voto obrigatório");
			} else {
				JOptionPane.showMessageDialog(null, "Voto facultativo");
			}

		}
	}

	void limpar() {
		txtIdade.setText(null);
	}
}// fim do c�digo
