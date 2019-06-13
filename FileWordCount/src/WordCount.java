import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordCount 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub 
		List<String> element = new ArrayList<>();
		HashMap<String, Integer> mapEle = new HashMap<String, Integer>();
		File file = new File("C:\\Users\\amit\\Desktop\\readFile.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st=null; 
		  while ((st = br.readLine()) != null) 
		  {
			  element.addAll(Arrays.asList(st.split(" ")));
		  }
		  
		  Set<String> ocr = new HashSet<String>(element);
		  for(String oc : ocr) {
			  System.out.println(oc+":"+Collections.frequency(element, oc));
		  }
//		  for(int i=0;i<element.size();i++)
//		  {
//			  //System.out.println(element.get(i).toString());
//			  if(mapEle.containsKey(element.get(i)))
//		         {
//			    	  int count=mapEle.get(element.get(i))+1;
//			    	  mapEle.put(element.get(i),count);
//			    	  count=0;
//		         }
//			      else
//			      {
//			    	  mapEle.put(element.get(i),1);
//			      }
//	      
//	      //System.out.println(element.get(i));
//		  }
//		  
//	   Iterator trav=mapEle.entrySet().iterator();
//   	   while(trav.hasNext())
//   	   {
//   	      Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
//   	 
//   	      System.out.println(record.getKey()+"->"+record.getValue());
//   	   }
//		  
		  
	}
}
