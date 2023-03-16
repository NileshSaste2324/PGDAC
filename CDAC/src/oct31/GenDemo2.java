package oct31;
class Gen1<T,U>{
	T t;
	U u;
	void setT(T t) {
		this.t=t;
	}
	T getT() {
		return t;
	}
	void setU(U u) {
		this.u=u;
	}
	U getU() {
		return u;
	}
}
public class GenDemo2 {

	public static void main(String[] args) {
		Gen1<Integer,Double> r = new Gen1<>();
		r.setT(200);
 		System.out.println(r.getT());
		r.setU(3434.43);
 		System.out.println(r.getU());
	}

}
