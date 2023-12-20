package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char korean = '한';
		char ch = '\uD55C';
		System.out.println(korean);
		System.out.println(ch);
		
		char sa = '\uC0AC';
		char rang = '\uB791';
		char hae = '\uD574';
		char so = '\uC18C';
		char young = '\uC601';
		System.out.println(sa);
		System.out.println(rang);
		System.out.println(hae);
		System.out.println(so);
		System.out.println(young);
	}

}
