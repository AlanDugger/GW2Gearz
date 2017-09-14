package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import common.CurrAttributes;
import common.Main;

import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;



public class MainGUI extends JFrame 
{

	public static boolean baseValuesOn = false;
	public static Map<String, String> attributes = new HashMap<String, String>();
	public static CurrAttributes currAttributes = new CurrAttributes();
//	public static ArrayList<StatPrefix> prefixList = new ArrayList<StatPrefix>();
	private JPanel contentPane;
	private JButton btnQuit;
	private JLabel lblSelectAnEquipment;
	private JButton btnHead;
	private JButton btnShoulder;
	private JButton btnLegs;
	private JButton btnChest;
	private JButton btnFeet;
	private JButton btnBack;
	private JButton btnAmulet;
	private JButton btnRing_1;
	private JButton btnRing_2;
	private JButton btnAccessory_2;
	private JButton btnAccessory_1;
	private JButton btnMainhand;
	private JButton btnOffhand;
	private JButton btnTwohand;	
	private JLabel lblGWLogo;
	private JButton btnToggleBaseValues;
	private JTextPane txtCurrPower;
	private JTextPane txtCurrPrecision;
	private JTextPane txtCurrFerocity;
	private JTextPane txtCurrToughness;
	private JTextPane txtCurrVitality;
	private JTextPane txtCurrConcentration;
	private JTextPane txtCurrCondition;
	private JTextPane txtCurrExpertise;
	private JTextPane txtCurrHealing;
	private JButton btnHands;
	private JCheckBox chckbxTwoHand;
	

	//Main frame constructor
	public MainGUI() 
	{
		setResizable(false);
		initComponents();
		createEvents();
	}
	
	// This method contains code for creating events
	private void createEvents()
	{
		btnQuit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null,  "Thank you for using Guild Wars 2 Gearz.");
				System.exit(0);
			}
		});
		
		btnToggleBaseValues.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// If the base values are on turn them off and change the button name to toggle otherwise the reverse
				if (baseValuesOn) {
					baseValuesOn = false;
					/*
					currAttributes.modifyAttribute("Precision", -105);
					currAttributes.modifyAttribute("Ferocity", -2250);					
					currAttributes.modifyAttribute("Power", -1000);
					currAttributes.modifyAttribute("Toughness", -1000);
					currAttributes.modifyAttribute("Vitality", -1000);
					*/	
					updateAttributeText();
					btnToggleBaseValues.setText("Toggle Base Values On");
				} else {
					baseValuesOn = true;
					/*
					currAttributes.modifyAttribute("Precision", 105);
					currAttributes.modifyAttribute("Ferocity", 2250);					
					currAttributes.modifyAttribute("Power", 1000);
					currAttributes.modifyAttribute("Toughness", 1000);
					currAttributes.modifyAttribute("Vitality", 1000);
					*/
					updateAttributeText();
					btnToggleBaseValues.setText("Toggle Base Values Off");
				}
					
			}
		});	
		
		btnHead.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.HEAD;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnHands.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.HANDS;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnShoulder.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.SHOULDER;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnLegs.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.LEGS;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnChest.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.CHEST;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnFeet.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.FEET;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnBack.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.BACK;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnRing_1.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.RING1;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnRing_2.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI equipFrame = new EquipSlotUI();				    
							equipFrame.setVisible(true);
							Main.slotModifying = Main.RING2;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnAccessory_1.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.ACCESSORY1;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnAccessory_2.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.ACCESSORY2;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnTwohand.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.TWOHAND;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnMainhand.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.MAINHAND;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
		btnOffhand.addActionListener( new ActionListener()
		{
			
				public void actionPerformed(ActionEvent o) 
				{
						try 
						{					
							EquipSlotUI frame = new EquipSlotUI();				    
							frame.setVisible(true);
							Main.slotModifying = Main.OFFHAND;
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
				}
			
		});
		
	}
	
	public void updateAttributeText() {

		/* Reset the attributes firstly */
		currAttributes.setAttribute("Power",  0);
		currAttributes.setAttribute("Precision",  0);
		currAttributes.setAttribute("Toughness",  0);
		currAttributes.setAttribute("Vitality",  0);
		currAttributes.setAttribute("Concentration",  0);
		currAttributes.setAttribute("Condition",  0);
		currAttributes.setAttribute("Expertise",  0);
		currAttributes.setAttribute("Ferocity",  0);
		currAttributes.setAttribute("Healing",  0);
		
		// Check to see if base values are included or not
		if (baseValuesOn) 
		{			
			currAttributes.modifyAttribute("Precision", 105);
			currAttributes.modifyAttribute("Ferocity", 2250);					
			currAttributes.modifyAttribute("Power", 1000);
			currAttributes.modifyAttribute("Toughness", 1000);
			currAttributes.modifyAttribute("Vitality", 1000);					
		}
		
		for (int i = 0; i < 15; i++)
			for (int j = 0; j < 9; j++)
				currAttributes.modifyAttribute(j, Main.equippedArray[i][j]);
		
		txtCurrPower.setText(currAttributes.getConvertedAttributes("Power"));
		txtCurrPrecision.setText(currAttributes.getConvertedAttributes("Precision"));
		txtCurrFerocity.setText(currAttributes.getConvertedAttributes("Ferocity"));
		txtCurrToughness.setText(currAttributes.getConvertedAttributes("Toughness"));
		txtCurrVitality.setText(currAttributes.getConvertedAttributes("Vitality"));
		txtCurrConcentration.setText(currAttributes.getConvertedAttributes("Concentration"));
		txtCurrCondition.setText(currAttributes.getConvertedAttributes("Condition"));
		txtCurrExpertise.setText(currAttributes.getConvertedAttributes("Expertise"));
		txtCurrHealing.setText(currAttributes.getConvertedAttributes("Healing"));
	}
	
	// This method contains code for creating and initializing components
	private void initComponents()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainGUI.class.getResource("/resources/gw2_logo_2c-43x32.jpg")));
		setTitle("Guild Wars 2 Gear App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 855, 600);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		
		
		lblSelectAnEquipment = new JLabel("Select an Equipment Slot from Below");
		lblSelectAnEquipment.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblSelectAnEquipment.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnQuit = new JButton("Quit Application");
		btnToggleBaseValues = new JButton("Toggle Base Values On");
		btnHead = new JButton("Head");		
		btnHands = new JButton("Hands");		
		btnShoulder = new JButton("Shoulder");		
		btnLegs = new JButton("Legs");		
		btnChest = new JButton("Chest");		
		btnFeet = new JButton("Feet");		
		btnBack = new JButton("Back");		
		btnAmulet = new JButton("Amulet");		
		btnRing_1 = new JButton("Ring1");		
		btnRing_2 = new JButton("Ring2");		
		btnAccessory_2 = new JButton("Accessory2");		
		btnAccessory_1 = new JButton("Accessory1");		
		btnMainhand = new JButton("MainHand");		
		btnOffhand = new JButton("OffHand");		
		btnTwohand = new JButton("TwoHand");		
		
		lblGWLogo = new JLabel("");
		lblGWLogo.setIcon(new ImageIcon(MainGUI.class.getResource("/resources/GW2_Logo_225.jpg")));
		
		JPanel statsPanel = new JPanel();
		statsPanel.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2), new LineBorder(new Color(255, 0, 0), 2)));
		
		chckbxTwoHand = new JCheckBox("");
		
		JTextArea txtrUseTheCheck = new JTextArea();
		txtrUseTheCheck.setText("Use the checkbox \r\nto toggle between\r\nusing twohand stats\r\nand mainhand/offhand\r\nstats.");
		txtrUseTheCheck.setFont(new Font("Arial Black", Font.PLAIN, 10));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblSelectAnEquipment, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnMainhand, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
										.addGap(60)
										.addComponent(btnOffhand, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnTwohand, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(chckbxTwoHand))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnAccessory_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
											.addGap(60)
											.addComponent(btnAccessory_2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnRing_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
											.addGap(60)
											.addComponent(btnRing_2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
											.addGap(60)
											.addComponent(btnAmulet, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnChest, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
											.addGap(60)
											.addComponent(btnFeet, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnShoulder, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
											.addGap(60)
											.addComponent(btnLegs, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnHead, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
											.addGap(60)
											.addComponent(btnHands, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))))
								.addGap(42)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(lblGWLogo)))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(statsPanel, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtrUseTheCheck, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addGap(16))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(statsPanel, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtrUseTheCheck, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
							.addGap(76)
							.addComponent(btnQuit)))
					.addGap(87))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lblGWLogo, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSelectAnEquipment)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnHead)
						.addComponent(btnHands))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShoulder)
						.addComponent(btnLegs))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnChest)
						.addComponent(btnFeet))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBack)
						.addComponent(btnAmulet))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRing_1)
						.addComponent(btnRing_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAccessory_1)
						.addComponent(btnAccessory_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnTwohand)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnMainhand)
								.addComponent(btnOffhand)))
						.addComponent(chckbxTwoHand))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		
		JLabel lblCurrentStats = new JLabel("Current Stats");
		lblCurrentStats.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentStats.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		JEditorPane attributeNamePane = new JEditorPane();
		attributeNamePane.setEditable(false);
		attributeNamePane.setFont(new Font("Arial", Font.BOLD, 13));
		attributeNamePane.setText("Power\r\n\r\n\r\nPrecision\r\n\r\n\r\nFerocity\r\n\r\n\r\nToughness\r\n\r\n\r\nVitality\r\n\r\n\r\nConcentration\r\n\r\n\r\nCondition Damage\r\n\r\n\r\nExpertise\r\n\r\n\r\nHealing Power\r\n");
		
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		
		txtCurrPower = new JTextPane();
		txtCurrPower.setToolTipText(attributes.get("Power"));
		txtCurrPower.setBackground(Color.WHITE);
		txtCurrPower.setForeground(Color.BLACK);
		txtCurrPower.getStyledDocument().setParagraphAttributes(0, txtCurrPower.getStyledDocument().getLength(), center, false);		
		txtCurrPower.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrPower.setEditable(false);
		txtCurrPower.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		txtCurrPrecision = new JTextPane();
		txtCurrPrecision.setToolTipText(attributes.get("Precision"));
		txtCurrPrecision.getStyledDocument().setParagraphAttributes(0, txtCurrPrecision.getStyledDocument().getLength(), center, false);		
		txtCurrPrecision.setForeground(Color.BLACK);
		txtCurrPrecision.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrPrecision.setEditable(false);
		txtCurrPrecision.setBackground(Color.WHITE);
		txtCurrPrecision.setBorder(BorderFactory.createLineBorder(Color.black));
		
		txtCurrFerocity = new JTextPane();
		txtCurrFerocity.setToolTipText(attributes.get("Ferocity"));
		txtCurrFerocity.getStyledDocument().setParagraphAttributes(0, txtCurrFerocity.getStyledDocument().getLength(), center, false);
		txtCurrFerocity.setForeground(Color.BLACK);
		txtCurrFerocity.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrFerocity.setEditable(false);
		txtCurrFerocity.setBackground(Color.WHITE);
		txtCurrFerocity.setBorder(BorderFactory.createLineBorder(Color.black));
		
		txtCurrToughness = new JTextPane();
		txtCurrToughness.setToolTipText(attributes.get("Toughness"));
		txtCurrToughness.getStyledDocument().setParagraphAttributes(0, txtCurrToughness.getStyledDocument().getLength(), center, false);
		txtCurrToughness.setForeground(Color.BLACK);
		txtCurrToughness.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrToughness.setEditable(false);
		txtCurrToughness.setBackground(Color.WHITE);
		txtCurrToughness.setBorder(BorderFactory.createLineBorder(Color.black));
		
		txtCurrVitality = new JTextPane();
		txtCurrVitality.setToolTipText(attributes.get("Vitality"));
		txtCurrVitality.getStyledDocument().setParagraphAttributes(0, txtCurrVitality.getStyledDocument().getLength(), center, false);
		txtCurrVitality.setForeground(Color.BLACK);
		txtCurrVitality.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrVitality.setEditable(false);
		txtCurrVitality.setBackground(Color.WHITE);
		txtCurrVitality.setBorder(BorderFactory.createLineBorder(Color.black));
		
		txtCurrConcentration = new JTextPane();
		txtCurrConcentration.setToolTipText(attributes.get("Concentration"));
		txtCurrConcentration.getStyledDocument().setParagraphAttributes(0, txtCurrConcentration.getStyledDocument().getLength(), center, false);
		txtCurrConcentration.setForeground(Color.BLACK);
		txtCurrConcentration.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrConcentration.setEditable(false);
		txtCurrConcentration.setBackground(Color.WHITE);
		txtCurrConcentration.setBorder(BorderFactory.createLineBorder(Color.black));
		
		txtCurrCondition = new JTextPane();
		txtCurrCondition.setToolTipText(attributes.get("Condition"));
		txtCurrCondition.getStyledDocument().setParagraphAttributes(0, txtCurrCondition.getStyledDocument().getLength(), center, false);
		txtCurrCondition.setForeground(Color.BLACK);
		txtCurrCondition.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrCondition.setEditable(false);
		txtCurrCondition.setBackground(Color.WHITE);
		txtCurrCondition.setBorder(BorderFactory.createLineBorder(Color.black));
		
		txtCurrExpertise = new JTextPane();
		txtCurrExpertise.setToolTipText(attributes.get("Expertise"));
		txtCurrExpertise.getStyledDocument().setParagraphAttributes(0, txtCurrExpertise.getStyledDocument().getLength(), center, false);
		txtCurrExpertise.setForeground(Color.BLACK);
		txtCurrExpertise.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrExpertise.setEditable(false);
		txtCurrExpertise.setBackground(Color.WHITE);
		txtCurrExpertise.setBorder(BorderFactory.createLineBorder(Color.black));
		
		txtCurrHealing = new JTextPane();
		txtCurrHealing.setToolTipText(attributes.get("Healing"));
		txtCurrHealing.getStyledDocument().setParagraphAttributes(0, txtCurrHealing.getStyledDocument().getLength(), center, false);
		txtCurrHealing.setForeground(Color.BLACK);
		txtCurrHealing.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurrHealing.setEditable(false);
		txtCurrHealing.setBackground(Color.WHITE);
		txtCurrHealing.setBorder(BorderFactory.createLineBorder(Color.black));

		updateAttributeText();
		
		
		GroupLayout gl_statsPanel = new GroupLayout(statsPanel);
		gl_statsPanel.setHorizontalGroup(
			gl_statsPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_statsPanel.createSequentialGroup()
					.addGap(46)
					.addComponent(lblCurrentStats, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
					.addGap(42))
				.addGroup(gl_statsPanel.createSequentialGroup()
					.addGroup(gl_statsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_statsPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_statsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_statsPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_statsPanel.createSequentialGroup()
										.addContainerGap(24, Short.MAX_VALUE)
										.addGroup(gl_statsPanel.createParallelGroup(Alignment.TRAILING)
											.addComponent(txtCurrVitality, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtCurrToughness, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtCurrFerocity, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtCurrPrecision, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtCurrPower, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(Alignment.TRAILING, gl_statsPanel.createSequentialGroup()
										.addGap(24)
										.addComponent(txtCurrConcentration, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(Alignment.TRAILING, gl_statsPanel.createSequentialGroup()
									.addGap(24)
									.addComponent(txtCurrCondition, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(Alignment.TRAILING, gl_statsPanel.createSequentialGroup()
								.addGap(24)
								.addComponent(txtCurrExpertise, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(Alignment.TRAILING, gl_statsPanel.createSequentialGroup()
							.addGap(24)
							.addComponent(txtCurrHealing, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(attributeNamePane, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_statsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnToggleBaseValues, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_statsPanel.setVerticalGroup(
			gl_statsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_statsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCurrentStats)
					.addGap(18)
					.addGroup(gl_statsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(attributeNamePane, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_statsPanel.createSequentialGroup()
							.addComponent(txtCurrPower, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtCurrPrecision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtCurrFerocity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtCurrToughness, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(txtCurrVitality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(txtCurrConcentration, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(txtCurrCondition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(txtCurrExpertise, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(txtCurrHealing, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(btnToggleBaseValues)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		statsPanel.setLayout(gl_statsPanel);
		setLocationRelativeTo(null);
		contentPane.setLayout(gl_contentPane);		
	}
}
