package programs;

public class Stringbuffer
{
    public static void main(String[] args)
    {
    	StringBuffer sb=new StringBuffer("india is my country");
    	
    	System.out.println(sb.delete(12, 19).insert(0, "country ").length());
    	
    	
    	}
}
