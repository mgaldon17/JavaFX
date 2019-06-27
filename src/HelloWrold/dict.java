package HelloWrold;

import java.util.Hashtable;
import java.util.Set;

public class dict {
	
	//This class is meant to stock all the data introduced through the login
	
	static Hashtable<String, String> h = new Hashtable<String, String>();
	
	public static Hashtable<String, String> stock(String user, String pass) {
		
		h.put(user, pass);
		
		return h;
	}
	
	public static void delete(String user) {
		
		Set<String> keys = h.keySet();
		
		@SuppressWarnings("unlikely-arg-type")
		String pass = h.get(keys);
		
		//Delete the pass associated to the user
		
		h.remove(user,pass);
		
		System.out.println("User " + user + " removed");
		
		
	}
	
	public static void readtable(Hashtable<String, String> h) {
	
        // Iterating Map/Hashtable using forEach() in Java 8
		
        h.forEach((key, value)->System.out.println("User : " + key 
                + "\n" + "Password : " + value
                 + "\n"));
        

	}
	
	
	public static void consult(String user, String pass) {
		
		
		if(h.containsValue(pass) && h.containsKey(user)) {
			
			System.out.println("User and pass exist");
			
		}else if(!h.containsValue(pass) && h.containsKey(user)){
			
			
			System.out.println("Pass is not correct");
			
		}else if (h.containsValue(pass) && !h.containsKey(user)) {
			
			System.out.println("User is not correct");
			
		}else {
			
			System.out.println("user and pass does not exist");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		stock("bob","1234");
		stock("alice", "4321");
		readtable(h);
		consult("bob","1234");
		
	}

}
