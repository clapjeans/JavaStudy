package youtube;

class Foo{
	public static String classVar = "I class Var";
	public String instanceVar="I instance var";
	public static void classMethod() {
		System.out.println(classVar);
	//	System.out.println(instanceVar); //error
	}
	public void instanceMetod() {
		System.out.println(classVar);
		System.out.println(instanceVar); //������ 
		
	}



}


public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //static �̱� ������ ok
		/*
		 * System.out.println(Foo.instanceVar);
		 */	 //instance �Ҽ��̶� ���������.
		
		Foo.classMethod();
		//Foo.instanceMethod()';
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);//I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar="change by f1";
		
		System.out.println(Foo.classVar);//"change by f1" //static �Ҽ��̶� ����Ǿ��־ ���� ġȯ�Ǽ� ��µ� 
		System.out.println(f2.classVar); // "change by f1 // f2 classvar�� static ������ Ŭ������ ����Ŵ 
		
		f1.instanceVar = "change by f1";
		
		System.out.println(f1.instanceVar);//"change by f1"
		System.out.println(f2.instanceVar); // I instance var static �Ҽ��� �ƴϱ⶧���� �������ʴ´� 
		
		//static�� class �Ҽ�   �׷��� f1���½��� ���� ���� foo��� Ŭ������ ����Ű�� ���̴�. 
		//instance �ٴ�  foo���� f1�̶��  �ν��Ͻ��� �����ɶ� �ν��Ͻ��ȿ� instanceVar��� ������ �����Ǵ� ���� ���⼭ �� ������ ���ص� foo��� �ν��Ͻ���
		// ��������ġ������ ���� �Ҽ��̵Ǿ��������� ����
		//static classMethod�� Ŭ������ ���� instance Mehtod�� class foo�� instancefmf �����Ѱ��̴�. 
	}

}
