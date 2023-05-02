package durga;

public class ConstructorOfStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1[]= {'J','a','v','a'};
		String s1=new String(ch1);
		System.out.println(s1);
		
		
		byte[]b= {97,98,99,100};
		String s=new String(b);
		System.out.println(s);
	}

}
