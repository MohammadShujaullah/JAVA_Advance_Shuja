import java.util.Scanner;

public class NameAsInputInArray {
        public static void main (String args []){


        System.out.println("enter the no.s of name");
Scanner sc=new Scanner (System .in);
int size =sc.nextInt();

String name[]=new String[size];
//input 
for (int i=0;i<size ;i++){

 name [i]=sc.next();
     //output
}   for(int i=0;i<name.length ;i++){

    System.out.println("name"+(i+1)+"is"  + name[i]);
}

    }
}
