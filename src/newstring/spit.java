package newstring;

public class spit {
	
	public static void main(String[] args) {
		
	String str=" Hi maniakndan,manikandan kasinathan";
	/*String[] a=str.split(" ");
	for(String b:a)
	System.out.println(b);*/
	String a=str.substring(2,6);
	System.out.println(a);
	
/*	str=str.replace("m", "k");
	System.out.println(str);*/
	
	str=str.replaceFirst("manikandan", "Hello");
	System.out.println(str);

}
}
