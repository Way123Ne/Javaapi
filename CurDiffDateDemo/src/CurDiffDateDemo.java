import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.transform.OutputKeys;

public class CurDiffDateDemo {

	static String curDate;

	public static void main(String[] args) throws ParseException {

		// CurDateDemo();

		datediff();

	}

	private static void datediff() throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date now = sdf.parse("2017-9-1");
		java.util.Date date = sdf.parse("2017-2-1");
		long l = now.getTime() - date.getTime();
		long day = l / (24 * 60 * 60 * 1000);

		System.out.println("œ‡≤Ó" + day + "ÃÏ");
	}

	/*
	 * private static void CurDateDemo() { SimpleDateFormat sdf = new
	 * SimpleDateFormat("yyyy-MM-dd"); String curDate = sdf.format(new
	 * java.util.Date());
	 * 
	 * System.out.println(curDate);
	 */
}
