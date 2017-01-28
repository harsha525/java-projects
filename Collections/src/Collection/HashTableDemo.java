package Collection;
import java.util.*;
public class HashTableDemo
{
	public static void main(String[] args) 
	{
		
    Hashtable h = new Hashtable();
    h.put(new Temp(5),"A");
    h.put(new Temp(4), "d");
    System.out.println(h);
	}
}
class Temp
{
	int i;
	Temp(int i)
	{
		this.i = i;	
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+" ";
	}
}

