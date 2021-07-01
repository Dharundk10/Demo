package newone.oo.ops;

public class One {
	private int age;
	private String name;

public One() {
	
}

public One(int age, String name) {
	this.age = age;
	this.name = name;
}

@Override
public String toString() {
	return "One [age=" + age + ", name=" + name + "]";
}

public void Print()
{
	System.out.println("Name is "+name+" his age is "+age);
}

public String fath() {
	return "dool dool";
}

	
}
