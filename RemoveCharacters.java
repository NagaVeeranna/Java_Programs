import java.lang.*;
public class RemoveCharacters
{
public static void main(String[] args) 
{
StringBuffer sbf = new StringBuffer("hellojava"); 
System.out.println("Before deletion string buffer: " +sbf);

sbf.delete(6, 8);

System.out.println("After deletion string buffer is: "+ sbf);
}
}
