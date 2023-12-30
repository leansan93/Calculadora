package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Negocio.OperacionesMatematicas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame implements ActionListener{

	public JFrame frame;
	private JTextField textNumero1;
	private JTextField textNum2;
	private JButton btnSumar , btnResta , btnDividir , btnMultiplicar;
	private OperacionesMatematicas _misOperaciones;
	private JLabel lblResultado;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Calculadora() {
		
		initialize();
		_misOperaciones= new OperacionesMatematicas(null, null);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        frame.setTitle("Operaciones Matetamticas");
        frame.setResizable(false); // no permite agrandar la pantalla 
		frame.setLocationRelativeTo(null); // centraliza la pantalla 
		
		
		JLabel lblTitulo = new JLabel("Calculadora ");
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 18));
		lblTitulo.setBounds(137, 11, 146, 45);
		frame.getContentPane().add(lblTitulo);
		
		textNumero1 = new JTextField();
		textNumero1.setBounds(108, 80, 234, 20);
		frame.getContentPane().add(textNumero1);
		textNumero1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setBounds(108, 128, 234, 20);
		frame.getContentPane().add(textNum2);
		textNum2.setColumns(10);
		
		
		JLabel lblNumOP1 = new JLabel("Numero 1 :");
		lblNumOP1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumOP1.setBounds(10, 80, 120, 20);
		frame.getContentPane().add(lblNumOP1);
		
		JLabel lblNumeroOP2 = new JLabel("Numero 2 : ");
		lblNumeroOP2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeroOP2.setBounds(10, 128, 71, 20);
		frame.getContentPane().add(lblNumeroOP2);
		
		btnSumar = new JButton("Suma");
		btnSumar.addActionListener(this);
		btnSumar.setBounds(41, 183, 89, 23);
		frame.getContentPane().add(btnSumar);
		
		btnResta = new JButton("Resta");
		btnResta.addActionListener(this);
		btnResta.setBounds(144, 183, 89, 23);
		frame.getContentPane().add(btnResta);
		
		btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(this);
		btnMultiplicar.setBounds(254, 183, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
		
	    btnDividir = new JButton("Dividir");
	    btnDividir.addActionListener(this);
		btnDividir.setBounds(144, 227, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(10, 278, 395, 14);
		frame.getContentPane().add(lblResultado);
		
		
	}
///////////////////////////////////////////////////////////////////////
//// eventos de los botones 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnSumar == e.getSource()) {
			int num1= Integer.parseInt(textNumero1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			int Resultado = _misOperaciones.Sumar(num1, num2);
			lblResultado.setText("la Suma es : " + Resultado);
			
		}
		if (btnResta == e.getSource()) {
			int num1= Integer.parseInt(textNumero1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			int Resultado = _misOperaciones.Restar(num1, num2);
			lblResultado.setText("la Resta es : " + Resultado);
		
		}
		if (btnMultiplicar == e.getSource()) {
			int num1= Integer.parseInt(textNumero1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			int Resultado = _misOperaciones.multiplicar(num1, num2);
			lblResultado.setText("la multiplicacion es : " + Resultado);
		
			
		}
		if (btnDividir == e.getSource()) {
			int num1= Integer.parseInt(textNumero1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			String Resultado = _misOperaciones.dividir(num1, num2);
			lblResultado.setText("la division es : " + Resultado);
		
			
		}
	}

}
