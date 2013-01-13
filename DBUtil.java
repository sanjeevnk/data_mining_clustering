package util;

public class DBUtil{

  
	private static final String sid = "mydm";
	private static final String port = "1521";
	private static final String hostname = "localhost";
	private static final String name = "sys as sysdba";
	private static final String password = "sys";
    
	
	public static String formedURI(){
		return hostname+":"+port+":"+sid;
	}

	public static String getUsername() {
		return name;
	}

	public static String getPassword() {
		return password;
	} 
}
