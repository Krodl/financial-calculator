//Kordell Teenie
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assign6 extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField txtEnterYourCash;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField cashFlowPV;
	private JTextField rateOfReturnPV;
	private JTextField numOfPeriodsPV;
	private JPanel contentPane1;
	//double given = Integer.parseInt(textField.getText());
	/**
	 * Launch the application.
	 */
	JFrame Frame = new JFrame();
	private JTextField txtSelectWhichFormula;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assign6 frame = new Assign6();
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
	public Assign6() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnChangeFont = new JMenu("Change font");
		mnFile.add(mnChangeFont);
		
		JMenuItem mntmSetAllFont_3 = new JMenuItem("Set all font to 8");
		mntmSetAllFont_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSelectWhichFormula.setFont(new Font("Calibri", Font.BOLD, 8));
			}
		});
		mnChangeFont.add(mntmSetAllFont_3);
		
		JMenuItem mntmSetAllFont_2 = new JMenuItem("Set all font to 10");
		mntmSetAllFont_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSelectWhichFormula.setFont(new Font("Calibri", Font.BOLD, 10));
			}
		});
		mnChangeFont.add(mntmSetAllFont_2);
		
		JMenuItem mntmSetAllFont = new JMenuItem("Set all font to 12");
		mntmSetAllFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSelectWhichFormula.setFont(new Font("Calibri", Font.BOLD, 12));
				
			}
		});
		mnChangeFont.add(mntmSetAllFont);
		
		JMenuItem mntmSetAllFont_1 = new JMenuItem("Set all font to 14");
		mntmSetAllFont_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSelectWhichFormula.setFont(new Font("Calibri", Font.BOLD, 14));
			}
		});
		mnChangeFont.add(mntmSetAllFont_1);
		
		JMenu mnFormulas = new JMenu("Formulas");
		menuBar.add(mnFormulas);
		
		JMenuItem mntmPresentValueOf = new JMenuItem("Present value of annuity");
		mntmPresentValueOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PresentValue3 newWindow = new PresentValue3();
				newWindow.setVisible(true);
			}
		});
		mnFormulas.add(mntmPresentValueOf);
		
		JMenuItem mntmFutureValueOf = new JMenuItem("Future value of an investment");
		mntmFutureValueOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FutureValue futureValue = new FutureValue();
				futureValue.setVisible(true);
			}
		});
		mnFormulas.add(mntmFutureValueOf);
		
		JMenuItem mntmPaymentUsingSimple = new JMenuItem("Payment using simple interest");
		mntmPaymentUsingSimple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleInterest simpleInterest = new SimpleInterest();
				simpleInterest.setVisible(true);
			}
		});
		mnFormulas.add(mntmPaymentUsingSimple);
		
		JMenuItem mntmPaymentUsingCompound = new JMenuItem("Payment using compound interest");
		mntmPaymentUsingCompound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompoundInterest compoundInterest = new CompoundInterest();
				compoundInterest.setVisible(true);
			}
		});
		mnFormulas.add(mntmPaymentUsingCompound);
		
		JMenuItem mntmFindingDoublingTime = new JMenuItem("Finding doubling time");
		mntmFindingDoublingTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoublingTime doublingTime = new DoublingTime();
				doublingTime.setVisible(true);
			}
		});
		mnFormulas.add(mntmFindingDoublingTime);
		contentPane1 = new JPanel();
		contentPane1.setBackground(Color.GREEN);
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		txtSelectWhichFormula = new JTextField();
		txtSelectWhichFormula.setHorizontalAlignment(SwingConstants.CENTER);
		txtSelectWhichFormula.setEditable(false);
		txtSelectWhichFormula.setForeground(Color.WHITE);
		txtSelectWhichFormula.setBackground(Color.RED);
		txtSelectWhichFormula.setFont(new Font("Calibri", Font.BOLD, 15));
		txtSelectWhichFormula.setText("Select which formula you would like to use from the menu above.");
		txtSelectWhichFormula.setBounds(0, 0, 434, 72);
		contentPane1.add(txtSelectWhichFormula);
		txtSelectWhichFormula.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Assign6.class.getResource("/Images/giphy.gif")));
		lblNewLabel.setBounds(76, 72, 278, 157);
		contentPane1.add(lblNewLabel);
	}
}
