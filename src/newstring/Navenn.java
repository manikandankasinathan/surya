package newstring;

public class Navenn {
	public static void main(String[] args) {
		String str="ss and sss and ssss";
		System.out.println(str.length());
		System.out.println(str.charAt(9));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
	/*	System.out.println(str.indexOf(str.indexOf('s'),str.indexOf('s')+1));*/
		String s="  Heelo world java";
		//trim
		System.out.println(s.trim());
		System.out.println(s.replace(" ",""));
		String date="07/11/1982";
		System.out.println(date.replace("/","-"));
		//split
		
		String test="mani-surya-is-a-goodboy";
	String[] val=test.split("-");
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
	}

}
