package Collection;
import java.util.*;
public class TreeSetDemo
{

	public static void main(String[] args)
	{
       TreeSet t = new TreeSet(new Mycomparator());
       t.add(10);
       t.add(0);
       t.add(15);
       t.add(20);
       System.out.println(t);
	}
}
class Mycomparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		return I1.compareTo(I2);
	}
}