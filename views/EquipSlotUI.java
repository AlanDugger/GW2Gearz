package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import common.Main;
import common.PrefixList;
import common.StatPrefix;
import javax.swing.JButton;

public class EquipSlotUI extends JFrame implements ActionListener {
	private int[] modArray = { 0, 0, 0, 0, 0, 0, 0, 0 , 0 };
	private JTextPane txtPowerPane;
	private JTextPane txtPrecisionPane;
	private JTextPane txtFerocityPane;
	private JTextPane txtToughnessPane;
	private JTextPane txtVitalityPane;
	private JTextPane txtConcentrationPane;
	private JTextPane txtConditionPane;
	private JTextPane txtExpertisePane;
	private JTextPane txtHealingPane;
	private JButton btnCommitButton;
	
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		String prefixName = (String) cb.getSelectedItem();
		modArray = PrefixList.findArray(prefixName);
		updateModStats();
	}
	
	public void updateModStats() 
	{
		txtPowerPane.setText(Integer.toString(modArray[StatPrefix.POWER]));
		txtPrecisionPane.setText(Integer.toString(modArray[StatPrefix.PRECISION]));
		txtToughnessPane.setText(Integer.toString(modArray[StatPrefix.TOUGHNESS]));
		txtVitalityPane.setText(Integer.toString(modArray[StatPrefix.VITALITY]));
		txtFerocityPane.setText(Integer.toString(modArray[StatPrefix.FEROCITY]));
		txtExpertisePane.setText(Integer.toString(modArray[StatPrefix.EXPERTISE]));
		txtConditionPane.setText(Integer.toString(modArray[StatPrefix.CONDITION]));
		txtConcentrationPane.setText(Integer.toString(modArray[StatPrefix.CONCENTRATION]));
		txtHealingPane.setText(Integer.toString(modArray[StatPrefix.HEALING]));
	}
	
	public EquipSlotUI() 
	{
		initComponents();
		createEvents();
	}
	
	private void createEvents() {
		
		btnCommitButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				for (int i = 0; i < 9; i++)
					Main.equippedArray[Main.slotModifying][i] = modArray[i];
				for (int i = 0; i < 9; i++)
					modArray[i] = 0;
				Main.slotModifying = -1;	
				close();
			}
		});
		
	}
	
	private void initComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EquipSlotUI.class.getResource("/resources/gw2_logo_2c-43x32.jpg")));	
		setBounds(100, 100, 855, 600);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblPleaseSelectFrom = new JLabel("Please Select From The Drop Down");
		lblPleaseSelectFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectFrom.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		JComboBox prefixListBox = new JComboBox(PrefixList.getPrefixList());
		prefixListBox.setFont(new Font("Arial", Font.BOLD, 13));		
		prefixListBox.addActionListener(this); 

		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("Power\r\n\r\n\r\nPrecision\r\n\r\n\r\nFerocity\r\n\r\n\r\nToughness\r\n\r\n\r\nVitality\r\n\r\n\r\nConcentration\r\n\r\n\r\nCondition Damage\r\n\r\n\r\nExpertise\r\n\r\n\r\nHealing Power\r\n");
		editorPane.setFont(new Font("Arial", Font.BOLD, 13));
		editorPane.setEditable(false);
		
		JLabel lblStatsWillBe = new JLabel("Stats Will Be Modified As Shown");
		lblStatsWillBe.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatsWillBe.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		
		txtPowerPane = new JTextPane();
		txtPowerPane.setToolTipText((String) null);		
		txtPowerPane.setForeground(Color.BLACK);
		txtPowerPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtPowerPane.setEditable(false);
		txtPowerPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtPowerPane.setBackground(Color.WHITE);
		txtPowerPane.getStyledDocument().setParagraphAttributes(0, txtPowerPane.getStyledDocument().getLength(), center, false);
		
		txtPrecisionPane = new JTextPane();
		txtPrecisionPane.setToolTipText((String) null);
		txtPrecisionPane.setForeground(Color.BLACK);
		txtPrecisionPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtPrecisionPane.setEditable(false);
		txtPrecisionPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtPrecisionPane.setBackground(Color.WHITE);
		txtPrecisionPane.getStyledDocument().setParagraphAttributes(0, txtPrecisionPane.getStyledDocument().getLength(), center, false);
		
		txtFerocityPane = new JTextPane();
		txtFerocityPane.setToolTipText((String) null);
		txtFerocityPane.setForeground(Color.BLACK);
		txtFerocityPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtFerocityPane.setEditable(false);
		txtFerocityPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtFerocityPane.setBackground(Color.WHITE);
		txtFerocityPane.getStyledDocument().setParagraphAttributes(0, txtFerocityPane.getStyledDocument().getLength(), center, false);
		
		txtToughnessPane = new JTextPane();
		txtToughnessPane.setToolTipText((String) null);
		txtToughnessPane.setForeground(Color.BLACK);
		txtToughnessPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtToughnessPane.setEditable(false);
		txtToughnessPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtToughnessPane.setBackground(Color.WHITE);
		txtToughnessPane.getStyledDocument().setParagraphAttributes(0, txtToughnessPane.getStyledDocument().getLength(), center, false);
		
		txtVitalityPane = new JTextPane();
		txtVitalityPane.setToolTipText((String) null);
		txtVitalityPane.setForeground(Color.BLACK);
		txtVitalityPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtVitalityPane.setEditable(false);
		txtVitalityPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtVitalityPane.setBackground(Color.WHITE);
		txtVitalityPane.getStyledDocument().setParagraphAttributes(0, txtVitalityPane.getStyledDocument().getLength(), center, false);
		
		txtConcentrationPane = new JTextPane();
		txtConcentrationPane.setToolTipText((String) null);
		txtConcentrationPane.setForeground(Color.BLACK);
		txtConcentrationPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtConcentrationPane.setEditable(false);
		txtConcentrationPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtConcentrationPane.setBackground(Color.WHITE);
		txtConcentrationPane.getStyledDocument().setParagraphAttributes(0, txtConcentrationPane.getStyledDocument().getLength(), center, false);
		
		txtConditionPane = new JTextPane();
		txtConditionPane.setToolTipText((String) null);
		txtConditionPane.setForeground(Color.BLACK);
		txtConditionPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtConditionPane.setEditable(false);
		txtConditionPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtConditionPane.setBackground(Color.WHITE);
		txtConditionPane.getStyledDocument().setParagraphAttributes(0, txtConditionPane.getStyledDocument().getLength(), center, false);
		
		txtExpertisePane = new JTextPane();
		txtExpertisePane.setToolTipText((String) null);
		txtExpertisePane.setForeground(Color.BLACK);
		txtExpertisePane.setFont(new Font("Arial", Font.BOLD, 12));
		txtExpertisePane.setEditable(false);
		txtExpertisePane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtExpertisePane.setBackground(Color.WHITE);
		txtExpertisePane.getStyledDocument().setParagraphAttributes(0, txtExpertisePane.getStyledDocument().getLength(), center, false);
		
		txtHealingPane = new JTextPane();
		txtHealingPane.setToolTipText((String) null);
		txtHealingPane.setForeground(Color.BLACK);
		txtHealingPane.setFont(new Font("Arial", Font.BOLD, 12));
		txtHealingPane.setEditable(false);
		txtHealingPane.setBorder(BorderFactory.createLineBorder(Color.black));
		txtHealingPane.setBackground(Color.WHITE);
		txtHealingPane.getStyledDocument().setParagraphAttributes(0, txtHealingPane.getStyledDocument().getLength(), center, false);
		updateModStats();
		
		btnCommitButton = new JButton("Press to Commit Stats");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPleaseSelectFrom, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(prefixListBox, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtPowerPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtPrecisionPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtFerocityPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtToughnessPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtVitalityPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtConcentrationPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtConditionPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtExpertisePane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtHealingPane, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
									.addGap(11)
									.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(btnCommitButton, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblStatsWillBe, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(328, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPleaseSelectFrom, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(prefixListBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCommitButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblStatsWillBe, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(txtPowerPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtPrecisionPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtFerocityPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtToughnessPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtVitalityPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(txtConcentrationPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(txtConditionPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(txtExpertisePane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(txtHealingPane, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		setLocationRelativeTo(null);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void close() {
		this.dispose();
	}
}
