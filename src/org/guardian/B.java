package org.guardian;

public class B  extends A {
	public void salary() {
		System.out.println("5%");
		}

		public void current() {
		System.out.println("10%");
		}

		public static void main(String[] args)
		{
		B b1 = new B();
		b1.salary();
		b1.current();
		b1.branchDetails();
		}
		}


