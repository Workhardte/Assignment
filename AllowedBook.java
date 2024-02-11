package java_assignment;
import java.util.Scanner;
public class AllowedBook {
    public static void main(String[] args) {
        int nbrOfBook;
       String Name;
     Scanner getUserInput=new Scanner(System.in);  
        System.out.println("Enter the number of books");
        nbrOfBook=getUserInput.nextInt();
           if(nbrOfBook<=3){
        for(int j=1;j<=nbrOfBook;j++)
        {
        System.out.println("Enter "+ " "+j+ " "+"the book ");
        Name=getUserInput.next();
        System.out.println("the book you are allowed to:"+Name);
            }
           }
           else{
            if(nbrOfBook>3)
                for(;;){
            System.out.println("maximum number of books must be 3");
            System.out.println("Re-nter the  number of books");
            nbrOfBook=getUserInput.nextInt(); 
            if(nbrOfBook<=3){
            for(int j=1;j<=nbrOfBook;j++)
        {
        System.out.println("Enter "+ " "+j+ " "+"the book ");
        Name=getUserInput.next();
            System.out.println("the book you entered is:"+Name);
         }
            }
           }    }
        }
         }
           
        
        
    


