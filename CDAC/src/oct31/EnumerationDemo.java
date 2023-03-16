package oct31;

public class EnumerationDemo {
	enum Day{
		MON(60),TUES,WED,THURS,FRI,SATUR,SUN(45);
		Day(){}
		int dayNum;
		Day(int dayNum){
			this.dayNum=dayNum;
		}
		int getDayNum() {
			return dayNum;
		}
	}
	public static void main(String[] args) {
		Day d = Day.MON;
		System.out.println(d.getDayNum());
		d = Day.SUN;
		System.out.println(d.getDayNum());
		//for(Day da :d.values()) {
		//	System.out.println(da);
		//}

	}

}
