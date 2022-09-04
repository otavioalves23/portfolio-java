package portfolio;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

public class TelaIMC extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtResultado;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIMC frame = new TelaIMC();
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
	public TelaIMC() {
		setResizable(false);
		setTitle("Cálculo do IMC");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaIMC.class.getResource("/img/imcfavicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc8.png")));
		lblStatus.setBounds(0, 0, 213, 425);
		contentPane.add(lblStatus);

		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(270, 29, 46, 26);
		contentPane.add(lblNewLabel_1);

		txtPeso = new JTextField();
		txtPeso.setBounds(270, 66, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(270, 97, 46, 28);
		contentPane.add(lblNewLabel_2);

		txtAltura = new JTextField();
		txtAltura.setBounds(270, 136, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.setToolTipText("Calcular IMC");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setBorderPainted(false);
		btnCalcular.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/balance.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(223, 307, 64, 64);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/eraser.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setBounds(330, 307, 64, 64);
		contentPane.add(btnLimpar);

		JLabel lblNewLabel_2_1 = new JLabel("Seu IMC é");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(270, 180, 86, 28);
		contentPane.add(lblNewLabel_2_1);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(270, 219, 86, 20);
		contentPane.add(txtResultado);

		// Uso da bliblioteca ATxy2k
		RestrictedTextField validar = new RestrictedTextField(txtPeso, "0123456789.");
		validar.setLimit(4);

		RestrictedTextField validar2 = new RestrictedTextField(txtAltura, "0123456789.");
		validar2.setLimit(4);

	}// fim do construtor

	/**
	 * M�todo usado para calcular o IMC
	 */
	void calcular() {
		// valida��o
		if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o peso");
			txtPeso.requestFocus();
		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a altura");
			txtAltura.requestFocus();
		} else {
			// l�gica principal
			// vari�veis
			double peso, altura, imc;
			// formatador de casas decimais
			DecimalFormat formatador = new DecimalFormat("#0.00");
			// entrada
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());
			// processamento
			imc = peso / (altura * altura);
			// resultado
			txtResultado.setText(String.valueOf(formatador.format(imc)));
			// status
			if (imc < 17) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc1.png")));
			} else if (imc < 18.5) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc2.png")));
			} else if (imc < 25) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc3.png")));
			} else if (imc < 30) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc4.png")));
			} else if (imc < 35) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc5.png")));
			} else if (imc < 40) {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc6.png")));
			} else {
				lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc7.png")));
			}
		}
	}

	/**
	 * M�todo usado para limpar os campos
	 */
	void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtResultado.setText(null);
		lblStatus.setIcon(new ImageIcon(TelaIMC.class.getResource("/img/imc8.png")));
		txtPeso.requestFocus();
	}

}// fim do c�digo
