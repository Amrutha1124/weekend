package basics;

import java.time.LocalDateTime;

public class A1 {
public static void main(String[]args){
//	driver.get("https://google.com");
//	System.out.println(driver.getTitle());
//	driver.close();
//	Random r = new Random();
//	double a = r.nextDouble();
//	System.out.println(a);
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.out.println(timeStamp);
	}
}
