package youtube;
//클래스를 인스턴스화 하는 과정 

class Accounting1{
	public double valueOfSupply; //인스턴스화했을때는 static을 지워야함 그냥 클래스를 쓸때는 static을 사용 
	public static double vatRate = 0.1;
	//어떤 인스턴스간에 동일하기때문에 인스턴스 소속보다는 class의 소속이 static으로 내버려 두는게 더 좋다. 
	//변하지않기때문에 모든 인스턴스가 동일하게 공유하는 변수는 static으로 사용하는게 더낫다 

	public Accounting1(double valueOfSupply) {
		this.valueOfSupply=valueOfSupply;
	}
	
	
	public  double getVAT() {
        return valueOfSupply * vatRate;
    } // static은 클래스소속이고 valueOfSupply는 인스턴스 소속이기 때문에 valueof suply *vatRate로 쓰면 오류가뜸 
	//즉 public static double getVAT()에 static을지워줌 
    public  double getTotal() {
    	
        return valueOfSupply + getVAT();
    }	
}

public class object802 {

	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0; //공급가액 /
		//한번 세팅이 되면 이 내부적인 상태는 변하지않는다. 
		//만원이라는 상태를 세팅한후 만원과 관련된 행위를 다끝낸후 물건을 이만원 짜리를 팔았다하면 
		
		//System.out.println("Value of supply :"+Accounting1.valueOfSupply);

		//System.out.println("VAT: "+Accounting1.getVAT()); //10퍼센트 금액 
		
		//System.out.println("Total :"+Accounting1.getTotal()); //공급가액+ 부가가치세 
		//Accounting. 이라는 클래스를 쓰면서 회계와 관련된
		//메소드라는것을 정확하게 알수있다. 
		//서로다른 클래스에서 공존할수있다는 것이다. 
		//같은 클래스에있을때는 앞에 클래스.메소드를 사용하지않아도되지만
		//다른 클래스에있을때는 명시를해줘야함!!!중요중요!!
	
		// Accounting.valueOfSupply = 20000.0; //공급가액 //이와같이 다시 세팅하면됨 
		//새로운 내부적인 상태의 변환 클래스를 인스턴스화 시킬 필요는 없다. 
		
		//System.out.println("Value of supply :"+Accounting1.valueOfSupply);

		//System.out.println("VAT: "+Accounting1.getVAT()); //10퍼센트 금액 
		
	//	System.out.println("Total :"+Accounting1.getTotal()); 
		
		//클래스의 계속적인 변화가 필요하다생각하면  클래스를 인스턴스화 해야함 
		//인스턴스 소속의 변수는 static이 빠져야함 stati은 서로 연결되어있기때문이다. 
		
		Accounting1 a1= new Accounting1(10000.0);
		Accounting1 a2= new Accounting1(20000.0);
		
		
		
		
		
		
		
		
	}
}