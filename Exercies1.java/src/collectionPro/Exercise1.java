package collectionPro;
import java.util.*;

public class Exercise1 {
	
	public static void main(String arg[])
	{
	  HashSet<String> hs = new HashSet<String>();
	  hs.add("Fahim");
	  hs.add("Narendra");
	  hs.add("Panday");
	  hs.add("Ganesh");
	  hs.add("Purushottam");
	  
	  Iterator<String> itr = hs.iterator();
 	  while(itr.hasNext()) 
 	  {
		System.out.println(itr.next());  
	  }

	}

}
