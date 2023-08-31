package com.adesh;

public class Hellow {

	public static void main(String[] args) {
		

		System.out.println("hellow world");
	 int a[]= {1,2,4,5,9,6};
	 int evencount=0;
	 int oddcount=0;
	 for(int i=0;i<=a.length;i++) {
	 if(a[i]%2==0) {
		 evencount++;
	 }
	 else {
		 oddcount++;
	 }
	 }
	 
	 int even[]=new int[evencount];
	 int odd[]=new int[oddcount];
	 int evenindex=0;
	 int oddindex=0;
	 for(int i=0;i<a.length;i++) {
		 if(a[i]%2==0) {
			 even[evenindex]=a[i];
			 evenindex++;
		 }
		 else {
			 odd[oddindex]=a[i];
			 oddindex++;
		 }
	 }
	 for(int i=0;i<even.length;i++) {
		 System.out.println(even[i]);
	 }
	 for(int i=0;i<odd.length;i++) {
		 System.out.println(odd[i]);
	 }
	}
		
}
