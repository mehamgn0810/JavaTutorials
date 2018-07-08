package exercises;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateTime {

	public static void main(String[] args) {

		Date date = new Date();
		long time = date.getTime();
		
		System.out.println("Date ==> " + date.toString());	
		
		//Timestamp ts = new Timestamp(time);
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println("Timestamp ==> " + ts.toString());
		
		
//		Date date1 = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
//		String formattedDate = sdf.format(date1);
//		System.out.println(formattedDate);

	}

}
