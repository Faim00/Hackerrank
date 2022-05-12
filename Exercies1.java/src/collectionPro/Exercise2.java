package collectionPro;

import java.util.*;

public class Exercise2 {

	public static void main(String arg[])
	{
	  
		HashSet<emp> ksj = new HashSet<emp>();
	    emp employee1 = new emp(1020332,"fahim", "Aurangabad");
	    
	    ksj.add(employee1);
	    ksj.add(new emp(1022993, "Anand", "pune"));
	    ksj.add(new emp(192373, "Narendra", "Pune"));
	    ksj.add(new emp(10283, "Fahim", "Aurangabad"));
	    
	    Iterator<emp> itr = ksj.iterator();
//	    while(itr.hasNext()) 
//	    {
//	      System.out.println(itr.next());
//	    }
	    System.out.println(ksj);
//	    for(emp s : ksj) {
//	    	System.out.println(s);
//	    }
	}
}

class emp
{
	private int emp_id;
	private String name;
	private String address;
	
	public emp(int id, String name, String Add)
	{
		 this.emp_id = id;
		 this.name = name;
		 this.address = Add;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
}
