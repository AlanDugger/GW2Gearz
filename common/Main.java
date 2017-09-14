package common;

import java.awt.EventQueue;

import views.MainGUI;



public class Main {

	public static PrefixList prefixList = new PrefixList();
	public static int[][] equippedArray = new int[15][9];
	public static boolean useTwoHand = false;
	public static int slotModifying = -1;
	public static final int HEAD = 0;
	public static final int HANDS = 1;
	public static final int SHOULDER = 2;
	public static final int LEGS = 3;
	public static final int CHEST = 4;
	public static final int FEET = 5;
	public static final int BACK = 6;
	public static final int AMULET = 7;
	public static final int RING1 = 8;
	public static final int RING2 = 9;
	public static final int ACCESSORY1 = 10;
	public static final int ACCESSORY2 = 11;
	public static final int TWOHAND = 12;
	public static final int MAINHAND = 13;
	public static final int OFFHAND = 14;
	
	
	public static void main(String[] args) 
	{
		
			
			//Setup window look & feel
		/*	try {
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");} 
			catch (Throwable e) {
				e.printStackTrace();} */
			
			//Setup initial data structures
			initializeData();			
			
			//Start a thread for the main frame
			EventQueue.invokeLater(new Runnable() {
				public void run() {
						try {					
							MainGUI frame = new MainGUI();				    
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
	}
	
	private static void initializeData() 
	{
		
		for (int i = 0; i < 15; i++)
			for (int k = 0; k < 9; k++)
				equippedArray[i][k] = 0;
		
		MainGUI.attributes.put("Power",  "Increases Direct Damage");
		MainGUI.attributes.put("Precision",  "Increases Critical Hit Chance");
		MainGUI.attributes.put("Toughness",  "Increases Armor");
		MainGUI.attributes.put("Vitality",  "Increases Health");
		MainGUI.attributes.put("Concentration",  "Increases Boon Duration");
		MainGUI.attributes.put("Condition",  "Increases Condition Damage");
		MainGUI.attributes.put("Expertise",  "Increases Condition Duration");
		MainGUI.attributes.put("Ferocity",  "Increases Critical Damage");
		MainGUI.attributes.put("Healing",  "Increases Healing Output");
		
		MainGUI.currAttributes.setAttribute("Power",  0);
		MainGUI.currAttributes.setAttribute("Precision",  0);
		MainGUI.currAttributes.setAttribute("Toughness",  0);
		MainGUI.currAttributes.setAttribute("Vitality",  0);
		MainGUI.currAttributes.setAttribute("Concentration",  0);
		MainGUI.currAttributes.setAttribute("Condition",  0);
		MainGUI.currAttributes.setAttribute("Expertise",  0);
		MainGUI.currAttributes.setAttribute("Ferocity",  0);
		MainGUI.currAttributes.setAttribute("Healing",  0);
		

		int[] statArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		String prefixName = "None";
		StatPrefix newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);				
		
		// Celestial special set, All get 22
		prefixName = "Celestial";
		statArray[StatPrefix.POWER] = 22;
		statArray[StatPrefix.PRECISION] = 22;
		statArray[StatPrefix.TOUGHNESS] = 22;
		statArray[StatPrefix.VITALITY] = 22;
		statArray[StatPrefix.FEROCITY] = 22;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 22;
		statArray[StatPrefix.HEALING] = 22;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);
		
		//Quad stat sets - Majors get 40, Minors get 22
		prefixName = "Commander's";
		statArray[StatPrefix.POWER] = 40;
		statArray[StatPrefix.PRECISION] = 40;
		statArray[StatPrefix.TOUGHNESS] = 22;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 22;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);
		
		prefixName = "Marauder";
		statArray[StatPrefix.POWER] = 40;
		statArray[StatPrefix.PRECISION] = 40;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 22;
		statArray[StatPrefix.FEROCITY] = 22;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);				
		
		prefixName = "Vigilant";
		statArray[StatPrefix.POWER] = 40;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 40;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 22;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 22;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);				
		
		prefixName = "Crusader";
		statArray[StatPrefix.POWER] = 40;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 40;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 22;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 22;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);				
		
		prefixName = "Wanderer's";
		statArray[StatPrefix.POWER] = 40;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 22;
		statArray[StatPrefix.VITALITY] = 40;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 22;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);				
		
		prefixName = "Viper's";
		statArray[StatPrefix.POWER] = 40;
		statArray[StatPrefix.PRECISION] = 22;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 22;
		statArray[StatPrefix.CONDITION] = 40;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);				
		
		prefixName = "Trailblazer's";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 40;
		statArray[StatPrefix.VITALITY] = 22;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 22;
		statArray[StatPrefix.CONDITION] = 40;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);				
		
		prefixName = "Minstrel's";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 40;
		statArray[StatPrefix.VITALITY] = 22;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 40;
		statArray[StatPrefix.CONCENTRATION] = 22;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Seraph's";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 40;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 40;
		statArray[StatPrefix.HEALING] = 22;
		statArray[StatPrefix.CONCENTRATION] = 22;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		// Normal tristat prefixes - Majors get 47, minors get 34
		prefixName = "Berserker's";
		statArray[StatPrefix.POWER] = 47;
		statArray[StatPrefix.PRECISION] = 34;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 34;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);
		
		prefixName = "Zealot's";
		statArray[StatPrefix.POWER] = 47;
		statArray[StatPrefix.PRECISION] = 34;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 34;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Soldier's";
		statArray[StatPrefix.POWER] = 47;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 34;
		statArray[StatPrefix.VITALITY] = 34;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Valkyrie";
		statArray[StatPrefix.POWER] = 47;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 34;
		statArray[StatPrefix.FEROCITY] = 34;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Captain's";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 47;
		statArray[StatPrefix.TOUGHNESS] = 34;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Rampager's";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 47;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 34;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Assassin's";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 47;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 34;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Knight's";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 34;
		statArray[StatPrefix.TOUGHNESS] = 47;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Cavalier's";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 47;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 34;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Nomad's";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 47;
		statArray[StatPrefix.VITALITY] = 34;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 34;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Settler's";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 47;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 34;
		statArray[StatPrefix.HEALING] = 34;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Sentinel's";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 34;
		statArray[StatPrefix.VITALITY] = 47;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Shaman's";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 47;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 34;
		statArray[StatPrefix.HEALING] = 34;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);		

		prefixName = "Sinister";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 34;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 47;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);

		prefixName = "Carrion";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 34;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 47;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Rabid";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 34;
		statArray[StatPrefix.TOUGHNESS] = 34;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 47;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Dire";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 34;
		statArray[StatPrefix.VITALITY] = 34;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 47;
		statArray[StatPrefix.HEALING] = 0;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	

		prefixName = "Cleric's";
		statArray[StatPrefix.POWER] = 34;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 34;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 47;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);
		
		prefixName = "Magi";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 34;
		statArray[StatPrefix.TOUGHNESS] = 0;
		statArray[StatPrefix.VITALITY] = 34;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 0;
		statArray[StatPrefix.HEALING] = 47;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
		
		prefixName = "Apothecary's";
		statArray[StatPrefix.POWER] = 0;
		statArray[StatPrefix.PRECISION] = 0;
		statArray[StatPrefix.TOUGHNESS] = 34;
		statArray[StatPrefix.VITALITY] = 0;
		statArray[StatPrefix.FEROCITY] = 0;
		statArray[StatPrefix.EXPERTISE] = 0;
		statArray[StatPrefix.CONDITION] = 34;
		statArray[StatPrefix.HEALING] = 47;
		statArray[StatPrefix.CONCENTRATION] = 0;
		newStat = new StatPrefix(prefixName, statArray);
		prefixList.addPrefix(newStat);	
	}

}
