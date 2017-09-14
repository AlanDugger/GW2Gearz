package common;

public class StatPrefix {
	
	public static final int POWER = 0;
	public static final int PRECISION = 1;
	public static final int TOUGHNESS = 2;
	public static final int VITALITY = 3;
	public static final int CONCENTRATION = 4;
	public static final int CONDITION = 5;
	public static final int EXPERTISE = 6;
	public static final int FEROCITY = 7;
	public static final int HEALING = 8;
	public static final int MAXSTATS = 9;
	public String prefixName;
	public int[] prefixMods = new int[MAXSTATS];
		
	public StatPrefix(String name, int[] stats){
		this.prefixName = name;		
		for (int i = 0; i < MAXSTATS; i ++)
			prefixMods[i] = stats[i];
	}	
	
	public String getName() {
		return prefixName;
	}
	
	public int getStatMod(int stat) {
		
		if (stat < 0 || stat >= MAXSTATS)
			return 0;		
		else
			return prefixMods[stat];
	}
	
	public int[] getStatPrefixArray() {
		return prefixMods;
	}
	
}
