import java.util.*;
class map
	{
	public static void main(String args[])
	    	{
        	HashMap<String, Integer> hm = new HashMap<String, Integer>();
  
       	hm.put("a",Integer(100));
        	hm.put("b", Integer(200));
        	hm.put("c", Integer(300));
        	hm.put("d", Integer(400));
  
        // Traversing through the map, the insertion order is not retained in the hashmap.
		System.out.print("initial map contents:");
       		for (HashMap.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
		System.out.print("map contents after updation:");
		hm.put("c",new Integer(500));
		for (HashMap.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
		hm.remove("a");
		System.out.print("map contents after removal:");
		for (HashMap.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
    		}
	}