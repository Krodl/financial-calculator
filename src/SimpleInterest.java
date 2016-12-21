//Kordell Teenie
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.awt.Color;
import javax.swing.SwingConstants;

public class SimpleInterest extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField rateOfReturnPV;
	private JTextField numofPeriodsPV;
	private JTextField principal;
	private JTextField enterRate;
	private JTextField enterPrincipal;
	private JTextField enterNum;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SimpleInterest dialog = new SimpleInterest();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SimpleInterest() {
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
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 8));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 8));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 8));
				principal.setFont(new Font("Calibri", Font.PLAIN, 8));
			}
		});
		mnChangeFont.add(mntmSetAllFont_3);
		
		JMenuItem mntmSetAllFont_2 = new JMenuItem("Set all font to 10");
		mntmSetAllFont_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 10));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 10));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 10));
				principal.setFont(new Font("Calibri", Font.PLAIN, 10));
			}
		});
		mnChangeFont.add(mntmSetAllFont_2);
		
		JMenuItem mntmSetAllFont = new JMenuItem("Set all font to 12");
		mntmSetAllFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 12));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				principal.setFont(new Font("Calibri", Font.PLAIN, 12));
				
			}
		});
		mnChangeFont.add(mntmSetAllFont);
		
		JMenuItem mntmSetAllFont_1 = new JMenuItem("Set all font to 14");
		mntmSetAllFont_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterPrincipal.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 14));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 14));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 14));
				principal.setFont(new Font("Calibri", Font.PLAIN, 14));
				}
		});
		mnChangeFont.add(mntmSetAllFont_1);
		{
			rateOfReturnPV = new JTextField();
			rateOfReturnPV.setBounds(279, 11, 145, 20);
			contentPanel.add(rateOfReturnPV);
			rateOfReturnPV.setColumns(10);
		}
		{
			numofPeriodsPV = new JTextField();
			numofPeriodsPV.setBounds(279, 42, 145, 20);
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
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double num2SI, num3SI, num4SI, ans1SI;
					
					
					try{	
						num2SI = Double.parseDouble(rateOfReturnPV.getText());
						num3SI = Double.parseDouble(numofPeriodsPV.getText());
						num4SI = Double.parseDouble(principal.getText());
						DecimalFormat myFormat = new DecimalFormat("#.00");
						
						ans1SI =  (num2SI * num3SI * num4SI);
						lblAnswer.setText(myFormat.format(ans1SI));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,  "Please Enter a valid number");
					}
				}
			});
			
			
			btnCalculate.setBounds(310, 98, 89, 23);
			contentPanel.add(btnCalculate);
		}
		{
			principal = new JTextField();
			principal.setBounds(279, 73, 145, 20);
			contentPanel.add(principal);
			principal.setColumns(10);
		}
		
		enterRate = new JTextField();
		enterRate.setEditable(false);
		enterRate.setHorizontalAlignment(SwingConstants.CENTER);
		enterRate.setForeground(Color.DARK_GRAY);
		enterRate.setBackground(Color.LIGHT_GRAY);
		enterRate.setText("Enter rate of return:");
		enterRate.setBounds(22, 11, 247, 20);
		contentPanel.add(enterRate);
		enterRate.setColumns(10);
		
		enterNum = new JTextField();
		enterNum.setEditable(false);
		enterNum.setHorizontalAlignment(SwingConstants.CENTER);
		enterNum.setForeground(Color.DARK_GRAY);
		enterNum.setBackground(Color.LIGHT_GRAY);
		enterNum.setText("Enter number of periods:");
		enterNum.setBounds(22, 42, 247, 20);
		contentPanel.add(enterNum);
		enterNum.setColumns(10);
		
		enterPrincipal = new JTextField();
		enterPrincipal.setEditable(false);
		enterPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		enterPrincipal.setForeground(Color.DARK_GRAY);
		enterPrincipal.setBackground(Color.LIGHT_GRAY);
		enterPrincipal.setText("Enter principal(original balance):");
		enterPrincipal.setBounds(22, 73, 247, 20);
		contentPanel.add(enterPrincipal);
		enterPrincipal.setColumns(10);
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