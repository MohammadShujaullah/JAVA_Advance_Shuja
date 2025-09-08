import java.util.*;

public class Practice_Accenture_Question {
    // public static int solve(int r, int unit, int arr[]) {

    // if(arr.length==0){
    // return -1;
    // }
    // int total = r * unit;
    // int count = 0;
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {

    // sum=sum+arr[i];
    // count++;
    // if(count>=total)

    // }
    // if(sum<total){
    // return 0;
    // }

    // return count;

    // }

    // public static void main(String args[]){

    // Scanner sc =new Scanner(System.in);

    // int r=sc.nextInt();
    // int unit=sc.nextInt();
    // int n=sc.nextInt();

    // int arr[]= new int [n];

    // for(int i=0;i<n;i++){
    // arr[i]=sc.nextInt();
    // }

    // System.out.println(solve(r,unit,arr));

    // }

    // public static int solve(String s) {

    // if (s.length() == 0)
    // return -1;
    // int result = s.charAt(0) - '0';
    // int i = 1;
    // while (i <= s.length() - 2) {
    // if (s.charAt(i) == 'C') {
    // result = result ^ (s.charAt(i + 1) - '0');
    // i = i + 2;

    // } else if (s.charAt(i) == 'B') {
    // result = result | (s.charAt(i + 1) - '0');
    // i = i + 2;

    // } else if (s.charAt(i) == 'A') {
    // result = result & (s.charAt(i + 1) - '0');
    // i = i + 2;

    // }
    // }

    // return result;

    // }

    // public static void main(String[] args) {
    // String s = "1C0C1C1A0A1";// given :String must be odd in length

    // System.out.println(solve(s));

    // }

    // password validation--------------------------------------
    // public static int CheckPassword(String s) {

    // int num = 0;
    // int upper = 0;
    // // 1st condition
    // if (s.length() < 4)
    // return 0;
    // // 2nd condition
    // if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
    // return 0;

    // // 3rd condition and so on conditions are checking inside the for loop
    // for (int i = 0; i < s.length(); i++) {
    // if (s.charAt(i) == ' ' && s.charAt(i) == '/') {
    // return 0;

    // }

    // else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
    // upper++;
    // } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    // num++;
    // }

    // }
    // if (upper < 1 || num < 1) {
    // return 0;
    // }
    // return 1;

    // // you are thinking how we put condition of greater than and smaller than on
    // a
    // // charecter of alphabet and number , is because all charecter are also a
    // number
    // // so when we writr condition on it , it takes its ASCII values and do the
    // // condition , see chatgpt to better explaination
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String s = sc.next();
    // System.out.println(CheckPassword(s));

    // }

    // count of numbers in an array which are within the given difference from a
    // given number--------------------------------------
    // public static int solve(int arr[], int num, int diff) {
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {
    // if (Math.abs(arr[i] - num) <= diff) {
    // count++;
    // }
    // }

    // if (count == 0)
    // return -1;

    // return count;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int arr[] = new int[n];

    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();

    // }

    // int num = sc.nextInt();
    // int diff = sc.nextInt();

    // System.out.println(solve(arr, num, diff));

    // }

    // sum of numbers from 1 to m which are divisible by n and not divisible by n
    // and return absolute difference------------------------------
    // public static int solve(int n, int m) {
    // int sumdiv = 0;
    // int sumnotdiv = 0;

    // for (int i = 1; i <= m; i++) {
    // if (i % n == 0) {
    // sumdiv += i;

    // } else {
    // sumnotdiv += i;
    // }
    // }

    // return Math.abs(sumnotdiv - sumdiv);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // System.out.println(solve(n, m));

    // }

    // product of two smallest number in an array such that their sum is less than
    // equal to given sum--------------------------------------
    // public static int solve(int arr[], int sum) {

    // if (arr.length == 0 || arr.length < 2) {
    // return -1;
    // }

    // int small = Integer.MAX_VALUE;
    // int secondsmall = Integer.MAX_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] < small) {
    // secondsmall = small;
    // small = arr[i];
    // } else if (arr[i] < secondsmall && arr[i] != small) {
    // secondsmall = arr[i];
    // }
    // }

    // if (small + secondsmall <= sum) {
    // return small * secondsmall;
    // }
    // return 0;

    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);

    // int sum = sc.nextInt();

    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();

    // }

    // System.out.println(solve(arr, sum));

    // }

    //// convert a number in base n to decimal number
    //// system------------------------------------
    // static char
    //// arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    // public static String solve(int n,int num){
    // StringBuilder sb=new StringBuilder();

    // while(num>0){
    // int r=num%n;
    // sb.append(arr[r]);
    // num=num/n;

    // }

    // return sb.reverse().toString();

    // }
    // public static void main(String[] args) {
    // Scanner sc=new Scanner (System.in);
    // int n=sc.nextInt();
    // int num=sc.nextInt(); // asumption is n[1,36} 36 inclusive

    // System.out.println(solve(n,num));

    // }

    // move all '-' to the begining of the
    // string--------------------------------------
    // public static String solve(String s, int n) {
    // if (n == 0)
    // return null;
    // StringBuilder sb = new StringBuilder(s);

    // for (int i = 0; i < n; i++) {
    // if (sb.charAt(i) == '-') {
    // sb.deleteCharAt(i);
    // i--;
    // sb.insert(0, '-');

    // }
    // }

    // return sb.toString();

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String s = sc.next();
    // System.out.println(solve(s, s.length()));

    // }

    // -- count of carry in addition of two
    // number--------------------------------------
    // public static int solve(int n1,int n2){
    // if(n1==0 || n2==0){
    // return -1;
    // }
    // int count=0;
    // int carry=0;

    // while(n1>0 ||n2 >0){
    // int a=n1%10;
    // int b=n2%10;
    // if(carry==1 && a+b+1>9){
    // count++;
    // carry=1;
    // }
    // else if(a+b>9){
    // count++;
    // carry=1;
    // }
    // else if(carry==1 && a+b+1<=9){
    // carry=0;
    // }
    // n1=n1/10;
    // n2=n2/10;
    // }

    // return count;

    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int num1=sc.nextInt();
    // int num2=sc.nextInt();
    // System.out.println(solve(num1,num2));
    // }

    // convert the string to either uppercase or lowercase based on the count of
    // uppercase and lowercase letters in the
    // string--------------------------------------
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // String s=sc.next();
    // int countcap=0;
    // int countsmall=0;

    // for(int i=0;i<s.length();i++){
    // if(s.charAt(i)-'A'>=0 && s.charAt(i)-'A'<=25){
    // countcap++;

    // }
    // else if(s.charAt(i)-'a'>=0 && s.charAt(i)-'a'<=25){
    // countsmall++;

    // }

    // }

    // if(countcap>countsmall){
    // s=s.toUpperCase();

    // }
    // else if(countsmall>countcap){
    // s=s.toLowerCase();

    // }
    // else{
    // System.out.println(s);;
    // }

    // System.out.println(s);

    // }

    // In a game of Rock, Paper, Scissors, the following rules are applied:
    // Rock defeats Scissors
    // public static void main(String[] args) {
    // Scanner sc=new Scanner (System.in);
    // String A=sc.next();

    // if(A=="Rock"){
    // System.out.println("Paper");
    // }
    // else if(A=="Paper"){
    // System.out.println("Scissor");

    // }
    // else if(A=="Scissor"){
    // System.out.println("Rock");

    // }
    // else{
    // System.out.println("Invalid Input");
    // }

    // }

    // count of numbers in an array which are greater than all the elements to
    // their right side--------------------------------------
    // public static void main(String[] args) {

    // // No use of Prioroty Queue, just for practicing how to define max PQ .
    // //PriorityQueue<Integer>pq=new PriorityQueue<>(); // min pq
    // PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder()); //
    // max pq

    // int count=0 ;
    // int arr[]={8,12,1,3,2};
    // int n=arr.length;

    // int Super=Integer.MIN_VALUE;

    // for(int i=n-1;i>=0;i--){
    // if(arr[i]>Super){
    // count++;
    // Super=arr[i];
    // }

    // }

    // System.out.println(count);
    // }

    // You are given a number n. You need to perform the following operations
    // until n becomes a single-digit number:
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // while (n % 10 != n) { // and the simple condition is**( n>=10).

    // if (n % 2 == 0) {
    // n = (n - 2) / 2;

    // } else {
    // n = n / 2;
    // }
    // }
    // System.out.println(n);
    // }

    // For each element in the array, find the next greater element to its right.
    // If there is no greater element to the right, print -1 for that element.
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();

    // }

    // PriorityQueue<Integer> pq = new PriorityQueue<>();

    // for (int i = n - 1; i >= 0; i--) {
    // if (pq.size() == 0) {
    // System.out.println(-1);
    // pq.add(arr[i]);
    // continue;
    // }
    // if (arr[i] > pq.peek()) {
    // while (arr[i] > pq.peek()) {
    // pq.poll();
    // }

    // }
    // System.out.println(pq.peek());
    // pq.add(arr[i]);
    // }

    // }

    // For each element in the array, find the next greater element to its left.
    // If there is no greater element to the left, print -1 for that element.
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // for (int i = 0; i < n; i++)
    // arr[i] = sc.nextInt();

    // Stack<Integer> st = new Stack<>();
    // int ans[] = new int[n];

    // for (int i = 0; i < n; i++) {
    // while (!st.isEmpty() && st.peek() <= arr[i]) {
    // st.pop();
    // }
    // ans[i] = st.isEmpty() ? -1 : st.peek();
    // st.push(arr[i]);
    // }

    // for (int x : ans) {
    // System.out.print(x + " ");
    // }
    // }



    
    // Given an array of integers, find the maximum sum of a subsequence such that
    // no two elements in the subsequence are adjacent in the original array.
    public static int solve(int arr[], int idx) {
        if (idx >= arr.length) {
            return 0;
        }
        int take = arr[idx] + solve(arr, idx + 1);
        int nottake = solve(arr, idx + 1);

        return Math.max(take, nottake);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(solve(arr, 0));
    }
}
