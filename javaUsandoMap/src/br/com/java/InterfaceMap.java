package br.com.java;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InterfaceMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object,String> mp=new HashMap<Object, String>();
		
		mp.put(new Integer(2), "dois");
		mp.put(new Integer(1), "um");
		mp.put(new Integer(3), "três");
		mp.put(new Integer(4), "quatro");
		
		Set s = mp.entrySet();
		
		Iterator it = s.iterator();
		
		while (it.hasNext()) {
			Map.Entry m = (Map.Entry)it.next();
			
			int key = (Integer)m.getKey();
			
			String value = (String) m.getValue();
			
			System.out.println("key :" + key + " Value: " + value);
		}
	}

}
