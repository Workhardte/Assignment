package java_assignment;
import java.util.Scanner;
public class second {
                 static String Name1;
     static   String Name2;
     static   String Name3; 
static int nbrOfBook;
    public static void main(String[] args) {
        
        
     Scanner getUserInput=new Scanner(System.in);  
        System.out.println("Enter the number of books");
        nbrOfBook=getUserInput.nextInt();
           if(nbrOfBook<=3){
        for(int j=1;j<=nbrOfBook;j++)
        {
        System.out.println("Enter "+ " "+nbrOfBook+" "+"the book ");
        Name1=getUserInput.next();
            Name2=getUserInput.next();
            Name3=getUserInput.next();
            System.out.println("the book you are allowed :"+"\n"+Name1+"\n"+Name2+"\n"+Name3);
        }
        
            }
           else{
            if(nbrOfBook>3)
                for(;;){
            System.out.println("maximum number of books must be 3");
            System.out.println("Re-nter the  number of books");
            nbrOfBook=getUserInput.nextInt();
            if(nbrOfBook<=3)
                break;
                } 
              
            for(int j=1;j<=nbrOfBook;j++)
        {
            System.out.println("Enter "+ " "+nbrOfBook+" "+"the book ");
        Name1=getUserInput.next();
            Name2=getUserInput.next();
            Name3=getUserInput.next();
            System.out.println("the book you are allowed :"+Name3);
            }
           }
       
               }
        }
         
           
        
        
    


