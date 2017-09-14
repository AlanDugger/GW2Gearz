package common;

import java.util.ArrayList;

public class PrefixList {
	
	public static ArrayList<StatPrefix> prefixList;
	
	public PrefixList() {
		prefixList = new ArrayList<StatPrefix>();
	}
	
	public void addPrefix(StatPrefix newstat) {
		prefixList.add(newstat);
	}
	
	public static String[] getPrefixList() {		
		int counter = 0;
		
		for (StatPrefix s : prefixList)
			counter++;
		
		int i = 0;
		if (counter <= 0)
			counter = 1;
		String[] stringList = new String[counter];
		stringList[0] = "";
		for (StatPrefix s : prefixList)
		{			
			stringList[i] = s.getName();
			i++;
		}
		
		return stringList;
	}
	
	public static int[] findArray(String name) {
		
		int[] x = { 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int multiplier = 1;
		for (int i = 0; i < prefixList.size(); i++)
		{
			if (prefixList.get(i).getName().equals(name))
			{
				x = prefixList.get(i).getStatPrefixArray();
			}
		}
		
		switch(Main.slotModifying) 
		{
			case Main.CHEST:
				multiplier = 305;
				break;
			case Main.BACK:
				multiplier = 128;
				break;
			case Main.HEAD:
				multiplier = 135;
				break;
			case Main.LEGS:
				multiplier = 200;
				break;
			case Main.HANDS:
			case Main.SHOULDER:
			case Main.FEET:
				multiplier = 100;
				break;
			case Main.AMULET:
				multiplier = 328;
				break;
			case Main.ACCESSORY1:
			case Main.ACCESSORY2:
				multiplier = 228;
				break;
			case Main.RING1:
			case Main.RING2:
				multiplier = 260;
				break;
			case Main.MAINHAND:
			case Main.OFFHAND:
				multiplier = 269;
				break;
			case Main.TWOHAND:			
				multiplier = 538;
				break;
			default:
				multiplier = 1;
				break;
		}
		
		for (int i = 0; i < 9; i++)
			x[i] = (x[i] * multiplier) / 100;
		return x;
	}
	

}
