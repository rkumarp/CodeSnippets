public static void anag(String s1, String s2)
{
	if(s1.length() == 0)
	{
		System.out.println(s2);
	}
	for(int i = 0; i < s1.length(); i++)
	{
		anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s2 + s1.charAt(i));
	}
}
public static void main(String[] args)
{
	anag("tie", "");
}
