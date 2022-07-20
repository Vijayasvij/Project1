package org.com;

public class Employee {
	private void EmpeDetails() {
     System.out.println("emp details");
	}
	private void EmpeDetails(String name) {
	System.out.println("emp Name:"+name);
	}
	private void EmpeDetail(int age) {
    System.out.println("emp age:+age");
    }
//	private void empDetail(int id,float weight) {
//    System.out.println("emp ID:"+id+"\n"+emp weight:"wight");
//	}
//	private void empDetail(float height,int pin) {
//	System.out.println("emp Height:"+height+"\n"+emp pin:"pin");
//   }
	public static void main(String[] args) {
	Employee e =new Employee();
	e.EmpeDetails("vijay");
	e.EmpeDetail(23);
//	e.empDetail(2333, 68.5f);
//	e.empDetail(5.8f,600041);
	}

}
