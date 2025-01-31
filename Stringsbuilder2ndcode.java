public class Stringsbuilder2ndcode {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);
    
         
    
        //insert(0,'s')
        sb.insert(0,'s');   
        System.out.println(sb);
sb.insert(3,'n');
System.out.println(sb);

// delete (0,exclusive no.)     we can go from 0 lenght to any no. for delete exclusivly like
sb.delete(3,4);
System.out.println(sb);

    }
}
