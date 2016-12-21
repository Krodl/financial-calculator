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
import javax.swing.SwingConstants;
import java.awt.Color;

public class DoublingTime extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField rateOfReturnPV;
	private JTextField enterRate;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DoublingTime dialog = new DoublingTime();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DoublingTime() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(175, 238, 238));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
	/**
	 * Create menu bar and Change Font function
	 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnChangeFont = new JMenu("Change font");
		mnFile.add(mnChangeFont);
		
		JMenuItem mntmSetAllFont_3 = new JMenuItem("Set all font to 8");
		mntmSetAllFont_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 8));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 8));
			}
		});
		mnChangeFont.add(mntmSetAllFont_3);
		
		JMenuItem mntmSetAllFont_2 = new JMenuItem("Set all font to 10");
		mntmSetAllFont_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 10));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 10));
			}
		});
		mnChangeFont.add(mntmSetAllFont_2);
		
		JMenuItem mntmSetAllFont = new JMenuItem("Set all font to 12");
		mntmSetAllFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 12));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 12));
			}
		});
		mnChangeFont.add(mntmSetAllFont);
		
		JMenuItem mntmSetAllFont_1 = new JMenuItem("Set all font to 14");
		mntmSetAllFont_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterRate.setFont(new Font("Calibri", Font.PLAIN, 14));
				rateOfReturnPV.setFont(new Font("Calibri", Font.PLAIN, 14));}
		});
		mnChangeFont.add(mntmSetAllFont_1);
		{
			rateOfReturnPV = new JTextField();
			rateOfReturnPV.setBounds(260, 42, 164, 20);
			contentPanel.add(rateOfReturnPV);
			rateOfReturnPV.setColumns(10);
		}
		{
			
		}
		{
			JLabel lblAnswer = new JLabel("Answer");
			lblAnswer.setForeground(new Color(205, 92, 92));
			lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
			lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblAnswer.setBounds(10, 151, 414, 56);
			contentPanel.add(lblAnswer);
			
			JButton btnCalculate = new JButton("Calculate");
			btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double num2SI, ans1SI;
					
					
					try{	
						num2SI = Double.parseDouble(rateOfReturnPV.getText());
						DecimalFormat myFormat = new DecimalFormat("#.00");
						
						ans1SI =  ((Math.log(2.0))/num2SI);
						lblAnswer.setText(myFormat.format(ans1SI));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,  "Please Enter a valid number");
					}
				}
			});
			
			
			btnCalculate.setBounds(291, 72, 92, 28);
			contentPanel.add(btnCalculate);
		}
		
		enterRate = new JTextField();
		enterRate.setEditable(false);
		enterRate.setForeground(Color.DARK_GRAY);
		enterRate.setBackground(Color.LIGHT_GRAY);
		enterRate.setHorizontalAlignment(SwingConstants.CENTER);
		enterRate.setText("Enter rate of return:");
		enterRate.setBounds(69, 42, 181, 20);
		contentPanel.add(enterRate);
		enterRate.setColumns(10);
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