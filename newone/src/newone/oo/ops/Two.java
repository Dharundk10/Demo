package newone.oo.ops;

public class Two extends One {
	private String city;
    private String state;
    
	public Two() {
	}
	public Two(String city, String state,int b,String n) {
		super(b,n);
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		System.out.print(super.toString()+"  ");
		return "Two [city=" + city + ", state=" + state + "]";
	}
	@Override
	public void Print()
	{
		super.Print();
		System.out.println("His city is "+city+" and state is "+state);
		
	}
	
	public int id(){
		return 24;
	}
    
	

}
