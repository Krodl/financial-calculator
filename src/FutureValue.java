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
import javax.swing.UIManager;

public class FutureValue extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField cashFlowPV;
	private JTextField rateOfReturnPV;
	private JTextField numofPeriodsPV;
	private JTextField enterCashFlow;
	private JTextField enterRate;
	private JTextField enterNum;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FutureValue dialog = new FutureValue();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FutureValue() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(175, 238, 238));
		contentPanel.setForeground(new Color(175, 238, 238));
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
				cashFlowPV.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterCashFlow.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 8));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 8));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 8));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 8));
			}
		});
		mnChangeFont.add(mntmSetAllFont_3);
		
		JMenuItem mntmSetAllFont_2 = new JMenuItem("Set all font to 10");
		mntmSetAllFont_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cashFlowPV.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterCashFlow.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 10));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 10));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 10));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 10));
			}
		});
		mnChangeFont.add(mntmSetAllFont_2);
		
		JMenuItem mntmSetAllFont = new JMenuItem("Set all font to 12");
		mntmSetAllFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cashFlowPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterCashFlow.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 12));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 12));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 12));
				
			}
		});
		mnChangeFont.add(mntmSetAllFont);
		
		JMenuItem mntmSetAllFont_4 = new JMenuItem("Set all font to 14");
		mntmSetAllFont_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cashFlowPV.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterCashFlow.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 14));
				enterNum.setFont(new Font("Calibri", Font.PLAIN, 14));	
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 14));
				numofPeriodsPV.setFont(new Font("Calibri", Font.PLAIN, 14));
			}
		});
		mnChangeFont.add(mntmSetAllFont_4);
		{
			cashFlowPV = new JTextField();
			cashFlowPV.setBounds(263, 11, 161, 20);
			contentPanel.add(cashFlowPV);
			cashFlowPV.setColumns(10);
		}
		{
			rateOfReturnPV = new JTextField();
			rateOfReturnPV.setBounds(263, 42, 161, 20);
			contentPanel.add(rateOfReturnPV);
			rateOfReturnPV.setColumns(10);
		}
		{
			numofPeriodsPV = new JTextField();
			numofPeriodsPV.setBounds(263, 73, 161, 20);
			contentPanel.add(numofPeriodsPV);
			numofPeriodsPV.setColumns(10);
		}
		{
			
		}
		{
			JLabel lblAnswer = new JLabel("ANSWER");
			lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
			lblAnswer.setBackground(new Color(240, 128, 128));
			lblAnswer.setForeground(new Color(240, 128, 128));
			lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblAnswer.setBounds(10, 163, 414, 44);
			contentPanel.add(lblAnswer);
			
			JButton btnCalculate = new JButton("Calculate");
			btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double num1, num2, num3, ans;
					
					
					try{	
						num1 = Double.parseDouble(cashFlowPV.getText());
						num2 = Double.parseDouble(rateOfReturnPV.getText());
						num3 = Double.parseDouble(numofPeriodsPV.getText());
						DecimalFormat myFormat = new DecimalFormat("#.00");
						
						ans =  (double) (num1 * Math.pow((1 + num2), num3));
						lblAnswer.setText(myFormat.format(ans));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,  "Please Enter a valid number");
					}
				}
			});
			btnCalculate.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e){
						
					}
				}
			);
			btnCalculate.setBounds(303, 104, 89, 23);
			contentPanel.add(btnCalculate);
		}
		{
			enterCashFlow = new JTextField();
			enterCashFlow.setEditable(false);
			enterCashFlow.setForeground(Color.DARK_GRAY);
			enterCashFlow.setBackground(Color.LIGHT_GRAY);
			enterCashFlow.setHorizontalAlignment(SwingConstants.CENTER);
			enterCashFlow.setText("Enter cash flow at period 0:");
			enterCashFlow.setBounds(35, 11, 219, 23);
			contentPanel.add(enterCashFlow);
			enterCashFlow.setColumns(10);
		}
		{
			enterRate = new JTextField();
			enterRate.setEditable(false);
			enterRate.setForeground(Color.DARK_GRAY);
			enterRate.setBackground(Color.LIGHT_GRAY);
			enterRate.setHorizontalAlignment(SwingConstants.CENTER);
			enterRate.setText("Enter rate of return:");
			enterRate.setBounds(35, 41, 219, 23);
			contentPanel.add(enterRate);
			enterRate.setColumns(10);
		}
		{
			enterNum = new JTextField();
			enterNum.setEditable(false);
			enterNum.setForeground(Color.DARK_GRAY);
			enterNum.setBackground(Color.LIGHT_GRAY);
			enterNum.setText("Number of periods:");
			enterNum.setHorizontalAlignment(SwingConstants.CENTER);
			enterNum.setBounds(35, 72, 219, 23);
			contentPanel.add(enterNum);
			enterNum.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setForeground(new Color(255, 239, 213));
			buttonPane.setBackground(new Color(255, 239, 213));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("BACK");
				okButton.setBackground(UIManager.getColor("Button.background"));
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