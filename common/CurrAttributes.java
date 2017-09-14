package common;

import java.util.HashMap;
import java.util.Map;

public class CurrAttributes {

	public Map<String, Integer> currAttributes;
	
	public CurrAttributes() {
		 this.currAttributes = new HashMap<String, Integer>();
	}
	
	public Integer getCurrAttributes(String key) {
		return currAttributes.get(key);
	}
	
	public String getConvertedAttributes(String key) 
	{				
		if (!currAttributes.containsKey(key))
			return "";
		
		String msg = "";
		int value = currAttributes.get(key);	
		switch(key.toLowerCase()) {
		
		case "power":
			msg = value + "";
			break;
		case "precision":
			msg = (value/21) + "%";
			break;
		case "toughness":
			msg = value + "";
			break;
		case "vitality":
			msg = (value*10) + "";
			break;
		case "concentration":
			msg = (value/15) + "%";
			break;
		case "condition":
			msg = value + "";
			break;
		case "expertise":
			msg = (value/15) + "%";
			break;
		case "ferocity":
			msg = (value/15) + "%";
			break;
		case "healing":
			msg = value + "";
			break;
		default:
			msg = "";
			break;
		}
		
		return msg;
	}
	
	public void setAttribute(String key, int value) {
		this.currAttributes.put(key,  value);
		return;
	}
	
	public void modifyAttribute(String key, int mod) {
		
		if (!currAttributes.containsKey(key))
			return;
		
		int currValue = currAttributes.get(key);
		currAttributes.put(key,  (currValue+mod));
		return;		
	}
	
	
	public void modifyAttribute(int element, int mod) {
		
		String key;
		
		switch (element) 
		{
		case StatPrefix.POWER:
			key = "Power";
			break;
		case StatPrefix.PRECISION:
			key = "Precision";
			break;
		case StatPrefix.VITALITY:
			key = "Vitality";
			break;
		case StatPrefix.TOUGHNESS:
			key = "Toughness";
			break;
		case StatPrefix.FEROCITY:
			key = "Ferocity";
			break;
		case StatPrefix.EXPERTISE:
			key = "Expertise";
			break;
		case StatPrefix.CONDITION:
			key = "Condition";
			break;
		case StatPrefix.HEALING:
			key = "Healing";
			break;
		default:
			key = "";
			break;
		}
		
		if (!currAttributes.containsKey(key))
			return;
		
		int currValue = currAttributes.get(key);
		currAttributes.put(key,  (currValue+mod));
		return;		
	}
}
