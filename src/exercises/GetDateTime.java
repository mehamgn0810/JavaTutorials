package exercises;

import java.sql.Timestamp;
import java.util.Date;

public class GetDateTime {

	public static void main(String[] args) {

		Date date = new Date();
		long time = date.getTime();
		
		System.out.println("Date ==> " + date.toString());	
		
		Timestamp ts = new Timestamp(time);
		System.out.println("Timestamp ==> " + ts.toString());

	}

}