package practiceCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateAndTime {
	public static void main(String[] args) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));  
	}
	 
}
