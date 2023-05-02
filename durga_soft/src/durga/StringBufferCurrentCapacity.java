package durga;

public class StringBufferCurrentCapacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("durg");
		sb.append("abcdefghijklmnopq");
		sb.append("abcdefghijklmnopq");
		sb.append("rssssssssssssssss");
		sb.append("rsssssssssssssssssss");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		// default StringBuffer capacity is 16 after max capacity reached it will Increased by (current capacity +1)*2;
	}

}
