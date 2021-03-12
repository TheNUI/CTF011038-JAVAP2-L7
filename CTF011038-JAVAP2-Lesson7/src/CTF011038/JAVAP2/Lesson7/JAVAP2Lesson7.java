package CTF011038.JAVAP2.Lesson7;

public class JAVAP2Lesson7 {
public static void main(String[] args) {
	String String1="You and Me";
	String String2=" you and me ";
//1
	if(String1.equals(String2))
		System.out.println("เหมือนกันจ้า");
	else
		System.out.println("ไม่เหมือนกัน");
//2
	String finDing = "and";
	if(String1.contains(finDing))
		System.out.println("มีคำว่า "+finDing);
	else
		System.out.println("ไม่มีคำว่า "+finDing);
//3
	System.out.println("ความยาวของ "+ String1+"เท่ากับ "+ String1.length());
	System.out.println("ความยาวของ "+ String2+"เท่ากับ "+ String2.length());
//4
	System.out.println(String1.substring(0, 4));
	System.out.println(String2.substring(0, 4));
//5
	System.out.println(String1.trim());
	System.out.println(String2.trim());
//6
	System.out.println(String1.toUpperCase());
//7
	System.out.println(String2.trim().toUpperCase());
}
}
