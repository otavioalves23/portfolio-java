package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class CalculoPorcentagem extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtValor;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtCusto;
	private JTextField txtLucro;
	private JTextField txtVenda;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField txtValortotal;
	private JLabel lblNewLabel_8;
	private JTextField txtDesconto;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton_2;
	private JTextField txtResultado;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoPorcentagem dialog = new CalculoPorcentagem();
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
	public CalculoPorcentagem() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(CalculoPorcentagem.class.getResource("/img/percentage48.png")));
		setTitle("C\u00E1lculo de Porcentagem");
		setBounds(100, 100, 450, 334);
		getContentPane().setLayout(null);

		txtX = new JTextField();
		txtX.setBounds(24, 49, 45, 20);
		getContentPane().add(txtX);
		txtX.setColumns(10);

		JLabel lblNewLabel = new JLabel("% de");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(91, 50, 46, 14);
		getContentPane().add(lblNewLabel);

		txtY = new JTextField();
		txtY.setBounds(162, 49, 45, 20);
		getContentPane().add(txtY);
		txtY.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(CalculoPorcentagem.class.getResource("/img/equal.png")));
		btnNewButton.setToolTipText("=");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(217, 21, 64, 64);
		getContentPane().add(btnNewButton);

		txtValor = new JTextField();
		txtValor.setEditable(false);
		txtValor.setBounds(291, 49, 45, 20);
		getContentPane().add(txtValor);
		txtValor.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Regra de 3");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(24, 21, 103, 14);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Custo x Venda");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(24, 95, 126, 14);
		getContentPane().add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Custo");
		lblNewLabel_3.setBounds(24, 123, 45, 14);
		getContentPane().add(lblNewLabel_3);

		txtCusto = new JTextField();
		txtCusto.setBounds(58, 120, 51, 20);
		getContentPane().add(txtCusto);
		txtCusto.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Lucro");
		lblNewLabel_4.setBounds(125, 123, 46, 14);
		getContentPane().add(lblNewLabel_4);

		txtLucro = new JTextField();
		txtLucro.setBounds(162, 120, 51, 20);
		getContentPane().add(txtLucro);
		txtLucro.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(223, 123, 26, 14);
		getContentPane().add(lblNewLabel_5);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(CalculoPorcentagem.class.getResource("/img/sale.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setRolloverEnabled(false);
		btnNewButton_1.setToolTipText("Venda");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularVenda();

			}
		});
		btnNewButton_1.setBounds(254, 96, 64, 64);
		getContentPane().add(btnNewButton_1);

		txtVenda = new JTextField();
		txtVenda.setEditable(false);
		txtVenda.setBounds(338, 120, 62, 20);
		getContentPane().add(txtVenda);
		txtVenda.setColumns(10);

		lblNewLabel_6 = new JLabel("Desconto");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(23, 169, 86, 14);
		getContentPane().add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Valor");
		lblNewLabel_7.setBounds(23, 211, 45, 14);
		getContentPane().add(lblNewLabel_7);

		txtValortotal = new JTextField();
		txtValortotal.setBounds(58, 208, 45, 20);
		getContentPane().add(txtValortotal);
		txtValortotal.setColumns(10);

		lblNewLabel_8 = new JLabel("Desconto");
		lblNewLabel_8.setBounds(113, 211, 59, 14);
		getContentPane().add(lblNewLabel_8);

		txtDesconto = new JTextField();
		txtDesconto.setBounds(182, 208, 46, 20);
		getContentPane().add(txtDesconto);
		txtDesconto.setColumns(10);

		lblNewLabel_9 = new JLabel("%");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(238, 211, 26, 14);
		getContentPane().add(lblNewLabel_9);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(CalculoPorcentagem.class.getResource("/img/discount.png")));
		btnNewButton_2.setToolTipText("Desconto =");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularDesconto();

			}
		});
		btnNewButton_2.setBounds(272, 187, 64, 64);
		getContentPane().add(btnNewButton_2);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(351, 208, 57, 20);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(CalculoPorcentagem.class.getResource("/img/eraser.png")));
		btnNewButton_3.setToolTipText("Limpar");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_3.setBounds(349, 21, 64, 64);
		getContentPane().add(btnNewButton_3);

		RestrictedTextField validar = new RestrictedTextField(txtX, "123456789.");
		validar.setLimit(99);
		RestrictedTextField validar2 = new RestrictedTextField(txtY, "123456789.");
		validar2.setLimit(99);
		RestrictedTextField validar3 = new RestrictedTextField(txtValor, "123456789.");
		validar3.setLimit(99);
		RestrictedTextField validar4 = new RestrictedTextField(txtCusto, "123456789.");
		validar4.setLimit(99);
		RestrictedTextField validar5 = new RestrictedTextField(txtLucro, "123456789.");
		validar5.setLimit(99);
		RestrictedTextField validar6 = new RestrictedTextField(txtVenda, "123456789.");
		validar6.setLimit(99);
		RestrictedTextField validar7 = new RestrictedTextField(txtValortotal, "123456789.");
		validar7.setLimit(99);
		RestrictedTextField validar8 = new RestrictedTextField(txtDesconto, "123456789.");
		validar8.setLimit(99);
		RestrictedTextField validar9 = new RestrictedTextField(txtResultado, "123456789.");
		validar9.setLimit(99);

	}// fim do construtor

	// M�todo regra de 3
	void calcular() {
		if (txtX.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a porcentagem");
			txtX.requestFocus();
		} else if (txtY.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o valor a calcular");
			txtY.requestFocus();
		} else {
			// vari�veis
			double x, y, valor;
			// entrada
			x = Double.parseDouble(txtX.getText());
			y = Double.parseDouble(txtY.getText());
			// processamento
			valor = (x * y) / 100;

			// saída
			txtValor.setText(String.valueOf(valor));
		}
	}

	// M�todo lucro venda
	void calcularVenda() {
		if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o preço de custo");
			txtCusto.requestFocus();
		} else if (txtLucro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a margem de lucro");
			txtLucro.requestFocus();
		} else {
			// vari�veis
			double custo, lucro, venda;
			// entrada
			custo = Double.parseDouble(txtCusto.getText());
			lucro = Double.parseDouble(txtLucro.getText());
			// processamento
			venda = custo + ((lucro * custo) / 100);
			// sa�da
			txtVenda.setText(String.valueOf(venda));

		}
	}

	// M�todo desconto
	void calcularDesconto() {
		if (txtValortotal.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o subtotal");
			txtValortotal.requestFocus();
		} else if (txtDesconto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o percentual de desconto");
			txtDesconto.requestFocus();
		} else {
			// vari�veis
			double total, desconto, descontoTotal;
			// entrada
			total = Double.parseDouble(txtValortotal.getText());
			desconto = Double.parseDouble(txtDesconto.getText());
			// processamento
			descontoTotal = total - (desconto * total) / 100;
			// sa�da
			txtResultado.setText(String.valueOf(descontoTotal));

		}
	}

	void limpar() {
		txtX.setText(null);
		txtY.setText(null);
		txtValor.setText(null);
		txtCusto.setText(null);
		txtLucro.setText(null);
		txtVenda.setText(null);
		txtValortotal.setText(null);
		txtDesconto.setText(null);
		txtResultado.setText(null);
		txtX.requestFocus();
	}
}// fim
