import java.util.*;
public class BitsmanupGetBits {
    public static void main (String args[]){
int n=5;//0101.we give the decimal no. & computer take it binary .
int position=2;
//step 1                                    //  1.bitmask:1<<i;
int bitmask=1<<position;
//step 2.                                            // 2.operation:AND 
if((bitmask & n)==0){
    System.out.println("bit was zero ");}
    else {System.out.println("bit was one ");}
 

    }}
