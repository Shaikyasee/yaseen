package sample.doc;

 class First {
	
	int x = 20;
	static int y = 30;
	
	public static void StaticMethod() {
		System.out.println(++y);
	}
	public void regularmethod() {
		System.out.println(++x);
		System.out.println(++y);
	}

}
 
public class  StaticEg {
	
	public static void main(String[] args) {
		First.StaticMethod();
		First.StaticMethod();
		//StaticEg s1 = new StaticEg();
				//StaticEg s2 = new StaticEg();
		First s1 = new First();
		First s2 = new First();
		
		s1.regularmethod();
		s2.regularmethod();
		
		
		
	}
}
