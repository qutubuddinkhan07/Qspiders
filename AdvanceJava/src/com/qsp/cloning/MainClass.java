package com.qsp.cloning;

public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address(764523, "JIO mart 2nd floor");
		Student s1 = new Student(1, "MAX", add);
		System.out.println(s1); // Student [id=1, name=MAX, add=Address [pincode=764523, location=JIO mart 2nd
								// floor

		Student s2 = s1.clone();
		s2.add.location = "Petrol Pump";
		System.out.println(s2); // Student [id=1, name=MAX, add=Address [pincode=764523, location=Petrol Pump]]

		System.out.println(s1.hashCode()); // 603742814
		System.out.println(s2.hashCode()); // 1067040082

		System.out.println(s1.add.hashCode()); // 1325547227
		System.out.println(s2.add.hashCode()); // 980546781
	}
}
