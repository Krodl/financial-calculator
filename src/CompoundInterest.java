//Kordell Teenie
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CompoundInterest extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField compoundInterestPV;
	private JTextField rateOfReturnPV;
	private JTextField numofPeriodsPV;
	private JTextField principal;
	private JTextField enterCompound;
	private JTextField enterRate;
	private JTextField enterNum;
	private JTextField enterPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CompoundInterest dialog = new CompoundInterest();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CompoundInterest() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(175, 238, 238));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnChangeFont = new JMenu("Change font");
		mnFile.add(mnChangeFont);
		
		JMenuItem mntmSetAllFont_3 = new JMenuItem("Set all font to 8");
		mntmSetAllFont_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterCompound.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 8));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 8));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 8));
				principal.setFont(new Font("Calibri", Font.PLAIN, 8));
				compoundInterestPV.setFont(new Font("Calibri", Font.PLAIN, 8));
			}
		});
		mnChangeFont.add(mntmSetAllFont_3);
		
		JMenuItem mntmSetAllFont_2 = new JMenuItem("Set all font to 10");
		mntmSetAllFont_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterCompound.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 10));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 10));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 10));
				principal.setFont(new Font("Calibri", Font.PLAIN, 10));
				compoundInterestPV.setFont(new Font("Calibri", Font.PLAIN, 10));
			}
		});
		mnChangeFont.add(mntmSetAllFont_2);
		
		JMenuItem mntmSetAllFont = new JMenuItem("Set all font to 12");
		mntmSetAllFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterCompound.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 12));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				principal.setFont(new Font("Calibri", Font.PLAIN, 12));
				compoundInterestPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				
			}
		});
		mnChangeFont.add(mntmSetAllFont);
		
		JMenuItem mntmSetAllFont_1 = new JMenuItem("Set all font to 14");
		mntmSetAllFont_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterCompound.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 14));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 14));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 14));
				principal.setFont(new Font("Calibri", Font.PLAIN, 14));
				compoundInterestPV.setFont(new Font("Calibri", Font.PLAIN, 14));}
		});
		mnChangeFont.add(mntmSetAllFont_1);
		{
			compoundInterestPV = new JTextField();
			compoundInterestPV.setBounds(269, 11, 155, 20);
			contentPanel.add(compoundInterestPV);
			compoundInterestPV.setColumns(10);
		}
		{
			rateOfReturnPV = new JTextField();
			rateOfReturnPV.setBounds(269, 45, 155, 20);
			contentPanel.add(rateOfReturnPV);
			rateOfReturnPV.setColumns(10);
		}
		{
			numofPeriodsPV = new JTextField();
			numofPeriodsPV.setBounds(269, 73, 155, 20);
			contentPanel.add(numofPeriodsPV);
			numofPeriodsPV.setColumns(10);
		}
		{
			
		}
		{
			JLabel lblAnswer = new JLabel("Answer");
			lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
			lblAnswer.setForeground(new Color(240, 128, 128));
			lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblAnswer.setBounds(10, 163, 414, 44);
			contentPanel.add(lblAnswer);
			
			JButton btnCalculate = new JButton("Calculate");
			btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double num1CI, num2CI, num3CI, num4CI, ans1CI;
					
					
					try{	
						num1CI = Double.parseDouble(compoundInterestPV.getText());
						num2CI = Double.parseDouble(rateOfReturnPV.getText());
						num3CI = Double.parseDouble(numofPeriodsPV.getText());
						num4CI = Double.parseDouble(principal.getText());
						DecimalFormat myFormat = new DecimalFormat("#.00");
						
						ans1CI =  (double) (num4CI * (Math.pow((1+num2CI), num3CI) - 1));
						lblAnswer.setText(myFormat.format(ans1CI));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,  "Please Enter a valid number");
					}
				}
			});
			
			
			btnCalculate.setBounds(293, 135, 98, 23);
			contentPanel.add(btnCalculate);
		}
		{
			principal = new JTextField();
			principal.setBounds(269, 104, 155, 20);
			contentPanel.add(principal);
			principal.setColumns(10);
		}
		{
			enterCompound = new JTextField();
			enterCompound.setEditable(false);
			enterCompound.setForeground(Color.DARK_GRAY);
			enterCompound.setBackground(Color.LIGHT_GRAY);
			enterCompound.setHorizontalAlignment(SwingConstants.CENTER);
			enterCompound.setFont(new Font("Tahoma", Font.PLAIN, 11));
			enterCompound.setText("Enter compound interest:");
			enterCompound.setBounds(10, 11, 233, 20);
			contentPanel.add(enterCompound);
			enterCompound.setColumns(10);
		}
		{
			enterRate = new JTextField();
			enterRate.setEditable(false);
			enterRate.setHorizontalAlignment(SwingConstants.CENTER);
			enterRate.setForeground(Color.DARK_GRAY);
			enterRate.setBackground(Color.LIGHT_GRAY);
			enterRate.setText("Enter rate of return:");
			enterRate.setBounds(10, 45, 233, 20);
			contentPanel.add(enterRate);
			enterRate.setColumns(10);
		}
		{
			enterNum = new JTextField();
			enterNum.setEditable(false);
			enterNum.setHorizontalAlignment(SwingConstants.CENTER);
			enterNum.setForeground(Color.DARK_GRAY);
			enterNum.setBackground(Color.LIGHT_GRAY);
			enterNum.setText("Enter number of periods:");
			enterNum.setBounds(10, 73, 233, 20);
			contentPanel.add(enterNum);
			enterNum.setColumns(10);
		}
		{
			enterPrincipal = new JTextField();
			enterPrincipal.setEditable(false);
			enterPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
			enterPrincipal.setForeground(Color.DARK_GRAY);
			enterPrincipal.setBackground(Color.LIGHT_GRAY);
			enterPrincipal.setText("Enter principal(original balance):");
			enterPrincipal.setBounds(10, 104, 233, 20);
			contentPanel.add(enterPrincipal);
			enterPrincipal.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 239, 213));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("BACK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}