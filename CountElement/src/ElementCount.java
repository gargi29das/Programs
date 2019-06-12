import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class ElementCount {
	private static int[] anArray;
	
	public static int getRandomIntegerBetweenRange(int min, int max){
		int x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		for(int i = 0; i <100; i++)
		{
			int element=getRandomIntegerBetweenRange(2,6);
			arr[i]=element;
			System.out.println(arr[i]);
		}
		
		
		
		
		HashMap<Integer, Integer> mapEle = new HashMap<Integer, Integer>();
		    
		    	//Random rd = new Random();
		    	//int[] arr = new int[5];
		    	for (int i = 0; i < arr.length; i++) 
		    	{
			         //arr[i] = rd.nextInt(); 
			         System.out.println(arr[i]);
		      
			         if(mapEle.containsKey(arr[i]))
			         {
				    	  int count=mapEle.get(arr[i])+1;
				    	  mapEle.put(arr[i],count);
				    	  count=0;
			         }
				      else
				      {
				    	  mapEle.put(arr[i],1);
				      }
		      
		      System.out.println(arr[i]);
		    }
		    	 Iterator trav=mapEle.entrySet().iterator();
		    	   while(trav.hasNext())
		    	   {
		    	      Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
		    	 
		    	      System.out.println(record.getKey()+"->"+record.getValue());
		    	   }
		  
	}

}
