public class StringBuilderFun
{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("John Baugh");   // String Builder alters the stored object, withought replacing its reference. (The string stores reference of object, when we try to modify string, it creates new object and assign its address, leaving original object as it is in memory. ) 
		
		sb.append(" is awesome");
		System.out.println(sb);
		
		sb.insert(5,"Philips ");
		System.out.println(sb);
		
		sb.replace(22,29,"amazing");
		System.out.println(sb);
		
		sb.delete(5,13);
		System.out.println(sb);
		
		sb.replace(0,4,"Dr. ");
		System.out.println(sb);
		
	}
}
