package newone.oo;

public class Source {

	public static void main(String args[])
    {
        Customer b=new Customer(101,"raj@gmail.com","xxxxxx","Krithick","Rajan","Chennai","Male",9001018761L,new Address("chennai", "TamilNadu", 600075, "India"));
//        Address a=new Address();
//        a.setCity("Chennai");
//         a.setState("TamilNadu");
//         a.setZip(600075);
//         a.setCountry("India");
//        a.setCustomer(b);
        Address address =new Address("chennai", "TamilNadu", 600075, "India");
        System.out.println(b);
        
    }
}
