package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora implements ActionListener{

	private JFrame frame;
	private JTextField textNumero1;
	private JTextField textNum2;
	private JButton btnSumar , btnResta , btnDividir , btnMultiplicar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        frame.setTitle("Operaciones Matetamticas");
		frame.setLocationRelativeTo(null);
		
		
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
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSumar.setBounds(41, 183, 89, 23);
		frame.getContentPane().add(btnSumar);
		
		btnResta = new JButton("Resta");
		btnResta.setBounds(144, 183, 89, 23);
		frame.getContentPane().add(btnResta);
		
		btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setBounds(254, 183, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
		
	    btnDividir = new JButton("Dividir");
		btnDividir.setBounds(144, 227, 89, 23);
		frame.getContentPane().add(btnDividir);
	}
//////////////////////
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
