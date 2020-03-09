package epam.com.design_patterns;



public class App 
{

 
    private static App myObj;
     
    static{
        myObj = new App();
    }
     
    private App(){
     
    }
     
    public static App getInstance(){
        return myObj;
    }
     
    public void display(){
        System.out.println("\n ********************************* THIS IS A EXAMPLE OF SINGLETON CLASS *****************************");
		System.out.println("\n \t HELLO I AM A  PART OF SINGLETON CLASS");
		System.out.println("\n \t Hey.... it is working!!!");
		System.out.println("\n =================================== THE END =======================================================");
		
    }
     
    public static void main( String[] args )
	{
        App ms = getInstance();
        ms.display();
    }
}
