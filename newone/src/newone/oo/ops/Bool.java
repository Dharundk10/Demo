package newone.oo.ops;

public class Bool {
	static int j=0;
public int m()
{
	int i=0;
	j++;
	return j;
}
public static void main(String[] args) {
	Bool b1=new Bool();
	b1.m();
//	b1.m();
//	System.out.println(b1.m());
	int k=b1.m();
	System.out.println(k);
	
}


}
