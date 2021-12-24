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
		System.out.println(instanceVar); //가능함 
		
	}



}


public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //static 이기 때문에 ok
		/*
		 * System.out.println(Foo.instanceVar);
		 */	 //instance 소속이라 에러가뜬다.
		
		Foo.classMethod();
		//Foo.instanceMethod()';
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);//I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar="change by f1";
		
		System.out.println(Foo.classVar);//"change by f1" //static 소속이라 연결되어있어서 새로 치환되서 출력됨 
		System.out.println(f2.classVar); // "change by f1 // f2 classvar도 static 임으로 클래스를 가리킴 
		
		f1.instanceVar = "change by f1";
		
		System.out.println(f1.instanceVar);//"change by f1"
		System.out.println(f2.instanceVar); // I instance var static 소속이 아니기때문에 변하지않는다 
		
		//static은 class 소속   그래서 f1에는실제 값은 없고 foo라는 클래스를 가리키는 것이다. 
		//instance 바는  foo에서 f1이라는  인스턴스가 생성될때 인스턴스안에 instanceVar라는 변수가 복제되는 것임 여기서 이 변수가 변해도 foo라는 인스턴스에
		// 영향을끼치지않음 서로 소속이되어있지않은 관계
		//static classMethod는 클래스를 참소 instance Mehtod는 class foo의 instancefmf 복제한것이다. 
	}

}
