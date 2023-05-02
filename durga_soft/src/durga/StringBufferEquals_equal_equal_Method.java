package durga;

public class StringBufferEquals_equal_equal_Method {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Durga");
		StringBuilder sb2=new StringBuilder("Durga");
		
		
		System.out.println(sb1==sb2);
		
		System.out.println(sb1.equals(sb2));
	}

}
