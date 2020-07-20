import java.util.Scanner;

public class App 
{
    public static void main(String[] args )
    {   Scanner scan = new Scanner(System.in);
    	Integer[] array= {23,45,78,12,90,34,7,3,1,9};
    	MyList<Integer> list = new MyList<Integer>(array);
    	System.out.println(list);
    	System.out.println("Enter the action to be performed");
    	int i=1;
    	while(i==1) {
    	System.out.println("1.Add element to list /n 2.Remove element from list 3.find the element in a index/n 4.exit ");
    	int choice = scan.nextInt();
    	switch(choice) {
    	case 1:
    		System.out.println("enter the element to add");
    		int add = scan.nextInt();
    		list.add(add);
    		System.out.println(list);
    		break;
    		
    	case 2: int size=list.size();
    	   System.out.println("enter the index of element to be deleted");
    	   int delete = scan.nextInt();
    	   if(delete<size)
    	         list.remove(delete);
    	   else {
    		   break;
           	   }
    	   System.out.println(list);
    		break;
    	case 3:System.out.println("enter the index");
    	    int search = scan.nextInt();
    	    System.out.println(list.get(search));
    	 	break;
    	default:i=0; 
    		break;
    	}
      }
   }
}