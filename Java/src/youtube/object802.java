package youtube;
//Ŭ������ �ν��Ͻ�ȭ �ϴ� ���� 

class Accounting1{
	public double valueOfSupply; //�ν��Ͻ�ȭ�������� static�� �������� �׳� Ŭ������ ������ static�� ��� 
	public static double vatRate = 0.1;
	//� �ν��Ͻ����� �����ϱ⶧���� �ν��Ͻ� �ҼӺ��ٴ� class�� �Ҽ��� static���� ������ �δ°� �� ����. 
	//�������ʱ⶧���� ��� �ν��Ͻ��� �����ϰ� �����ϴ� ������ static���� ����ϴ°� ������ 

	public Accounting1(double valueOfSupply) {
		this.valueOfSupply=valueOfSupply;
	}
	
	
	public  double getVAT() {
        return valueOfSupply * vatRate;
    } // static�� Ŭ�����Ҽ��̰� valueOfSupply�� �ν��Ͻ� �Ҽ��̱� ������ valueof suply *vatRate�� ���� �������� 
	//�� public static double getVAT()�� static�������� 
    public  double getTotal() {
    	
        return valueOfSupply + getVAT();
    }	
}

public class object802 {

	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0; //���ް��� /
		//�ѹ� ������ �Ǹ� �� �������� ���´� �������ʴ´�. 
		//�����̶�� ���¸� �������� ������ ���õ� ������ �ٳ����� ������ �̸��� ¥���� �ȾҴ��ϸ� 
		
		//System.out.println("Value of supply :"+Accounting1.valueOfSupply);

		//System.out.println("VAT: "+Accounting1.getVAT()); //10�ۼ�Ʈ �ݾ� 
		
		//System.out.println("Total :"+Accounting1.getTotal()); //���ް���+ �ΰ���ġ�� 
		//Accounting. �̶�� Ŭ������ ���鼭 ȸ��� ���õ�
		//�޼ҵ��°��� ��Ȯ�ϰ� �˼��ִ�. 
		//���δٸ� Ŭ�������� �����Ҽ��ִٴ� ���̴�. 
		//���� Ŭ�������������� �տ� Ŭ����.�޼ҵ带 ��������ʾƵ�������
		//�ٸ� Ŭ�������������� ��ø��������!!!�߿��߿�!!
	
		// Accounting.valueOfSupply = 20000.0; //���ް��� //�̿Ͱ��� �ٽ� �����ϸ�� 
		//���ο� �������� ������ ��ȯ Ŭ������ �ν��Ͻ�ȭ ��ų �ʿ�� ����. 
		
		//System.out.println("Value of supply :"+Accounting1.valueOfSupply);

		//System.out.println("VAT: "+Accounting1.getVAT()); //10�ۼ�Ʈ �ݾ� 
		
	//	System.out.println("Total :"+Accounting1.getTotal()); 
		
		//Ŭ������ ������� ��ȭ�� �ʿ��ϴٻ����ϸ�  Ŭ������ �ν��Ͻ�ȭ �ؾ��� 
		//�ν��Ͻ� �Ҽ��� ������ static�� �������� stati�� ���� ����Ǿ��ֱ⶧���̴�. 
		
		Accounting1 a1= new Accounting1(10000.0);
		Accounting1 a2= new Accounting1(20000.0);
		
		
		
		
		
		
		
		
	}
}