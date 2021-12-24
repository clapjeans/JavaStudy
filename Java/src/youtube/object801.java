package youtube;

class Accounting{
	public static double valueOfSupply;
	public static double vatRate = 0.1;

	public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    public static double getTotal() {
    	
        return valueOfSupply + getVAT();
    }	
}

public class object801 {

	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0; //공급가액
		
		System.out.println("Value of supply :"+Accounting.valueOfSupply);

		System.out.println("VAT: "+Accounting.getVAT()); //10퍼센트 금액 
		
		System.out.println("Total :"+Accounting.getTotal()); //공급가액+ 부가가치세 
		//Accounting. 이라는 클래스를 쓰면서 회계와 관련된
		//메소드라는것을 정확하게 알수있다. 
		//서로다른 클래스에서 공존할수있다는 것이다. 
		//같은 클래스에있을때는 앞에 클래스.메소드를 사용하지않아도되지만
		//다른 클래스에있을때는 명시를해줘야함!!!중요중요!!
	}
}