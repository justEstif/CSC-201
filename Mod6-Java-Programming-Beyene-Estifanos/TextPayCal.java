
public class TextPayCal {
	public static void main(String[] args) {
		RegularPay reg = new RegularPay(1.5);//1.5 is the payrate
		HazardPay haz = new HazardPay(1.5);//1.5 is the payrate
		System.out.println(reg.computePay(4));//4 is the hours worked
		System.out.println(haz.computePay(4));//4 is the hours worked
	}
}
//the answer will be different because hazard pay multiplies by 1.5
