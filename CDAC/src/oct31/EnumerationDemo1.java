package oct31;

public class EnumerationDemo1 {
	enum Day{
		MON,TUES,WED,THURS,FRI,SATUR,SUN
	}
	public static void main(String[] args) {
		Day d = Day.MON;
		System.out.println(d);
		d = Day.SUN;
		System.out.println(d);
		//for(Day da :d.values()) {
		//	System.out.println(da);
		//}

	}

}
