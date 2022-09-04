package portfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Toolkit;

public class AppServico extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtRemuneracao;
	private JTextField txtCusto;
	private JTextField txtCargaHoraria;
	private JTextField txtHora;
	private JTextField txtTempoEstimado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppServico dialog = new AppServico();
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
	public AppServico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AppServico.class.getResource("/img/job48.png")));
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setTitle("C\u00E1lculo do Valor da Hora de Servi\u00E7o");
		setModal(true);
		setBounds(100, 100, 450, 370);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Remuneração");
		lblNewLabel.setBounds(31, 29, 117, 14);
		getContentPane().add(lblNewLabel);

		txtRemuneracao = new JTextField();
		txtRemuneracao.setBounds(194, 26, 86, 20);
		getContentPane().add(txtRemuneracao);
		txtRemuneracao.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Custo Operacional");
		lblNewLabel_1.setBounds(31, 68, 117, 14);
		getContentPane().add(lblNewLabel_1);

		txtCusto = new JTextField();
		txtCusto.setBounds(194, 65, 86, 20);
		getContentPane().add(txtCusto);
		txtCusto.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Carga Horária Mensal");
		lblNewLabel_2.setBounds(31, 111, 153, 14);
		getContentPane().add(lblNewLabel_2);

		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(194, 108, 86, 20);
		getContentPane().add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(AppServico.class.getResource("/img/save.png")));
		btnNewButton.setToolTipText("Salvar");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularHora();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(320, 125, 64, 64);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("Valor da Sua Hora de Serviço");
		lblNewLabel_3.setBounds(31, 157, 153, 14);
		getContentPane().add(lblNewLabel_3);

		txtHora = new JTextField();
		txtHora.setEditable(false);
		txtHora.setBounds(194, 154, 86, 20);
		getContentPane().add(txtHora);
		txtHora.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Estimativa da Hora de Serviço");
		lblNewLabel_4.setBounds(31, 224, 153, 14);
		getContentPane().add(lblNewLabel_4);

		txtTempoEstimado = new JTextField();
		txtTempoEstimado.setBounds(194, 221, 86, 20);
		getContentPane().add(txtTempoEstimado);
		txtTempoEstimado.setColumns(10);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(AppServico.class.getResource("/img/calc.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setToolTipText("Calcular");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularServico();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(55, 259, 64, 64);
		getContentPane().add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 200, 414, 3);
		getContentPane().add(panel);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setToolTipText("Limpar");
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setIcon(new ImageIcon(AppServico.class.getResource("/img/eraser.png")));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(320, 259, 64, 64);
		getContentPane().add(btnNewButton_1_1);

		RestrictedTextField validar = new RestrictedTextField(txtRemuneracao, "0123456789.");
		validar.setLimit(99);
		RestrictedTextField validar2 = new RestrictedTextField(txtCusto, "0123456789.");
		validar2.setLimit(99);
		RestrictedTextField validar3 = new RestrictedTextField(txtCargaHoraria, "0123456789.");
		validar3.setLimit(99);
		RestrictedTextField validar4 = new RestrictedTextField(txtHora, "0123456789.");
		validar4.setLimit(99);
		RestrictedTextField validar5 = new RestrictedTextField(txtTempoEstimado, "0123456789.");
		validar5.setLimit(99);

	}// fim do construtor

	// var�aveis globais
	double hora;

	// m�todo usado para calcular o valor da hora
	void calcularHora() {
		if (txtRemuneracao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o valor da remuneração");
			txtRemuneracao.requestFocus();
		} else if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o valor do custo");
			txtCusto.requestFocus();
		} else if (txtCargaHoraria.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o valor da carga horária");
			txtCargaHoraria.requestFocus();
		} else {
			// v�riaveis
			double remuneracao, custo, cargaHoraria;
			// entrada
			remuneracao = Double.parseDouble(txtRemuneracao.getText());
			custo = Double.parseDouble(txtCusto.getText());
			cargaHoraria = Double.parseDouble(txtCargaHoraria.getText());
			// processamento
			hora = (remuneracao + 0.3 * remuneracao + custo + 0.2 * remuneracao) / cargaHoraria;
			// sa�da
			txtHora.setText(String.valueOf(hora));
		}
	}

	// m�todo usado para calcular o valor do serviço
	void calcularServico() {

		if (txtTempoEstimado.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o valor da estimativa da hora de serviço");
			txtTempoEstimado.requestFocus();
		} else {
			// variáveis
			double tempoEstimado, valor;
			// entrada
			tempoEstimado = Double.parseDouble(txtTempoEstimado.getText());
			// processamento
			valor = tempoEstimado * hora;
			// saída
			JOptionPane.showMessageDialog(null, "Valor do serviço: " + valor, "Relatório", JOptionPane.DEFAULT_OPTION);

		}
	}

	void limpar() {
		txtRemuneracao.setText(null);
		txtCusto.setText(null);
		txtCargaHoraria.setText(null);
		txtHora.setText(null);
		txtTempoEstimado.setText(null);
		txtRemuneracao.requestFocus();
	}
}
// fim do c�digo
