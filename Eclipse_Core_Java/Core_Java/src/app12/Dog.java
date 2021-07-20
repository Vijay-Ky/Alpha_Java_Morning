package app12;

public class Dog {

	//property
	String name;
	int age;
	double weight;
	String breed;
	String color;
	String gender;
	
	
	//behavior 
	public void bark()
	{
		System.out.println("I will bark");
	}
	
	public void bite()
	{
		System.out.println("I will bite");
	}
	
	public void chaseCat()
	{
		System.out.println("I chase cats");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "baby";
		d1.age = 2;
		d1.breed = "indian";
		d1.color = "black";
		d1.gender = "female";
		d1.weight = 1.2;
		System.out.println("Dog baby's properties and behaviours");
		System.out.println(d1.name + "," + d1.age + "," + d1.breed + "," + d1.color + "," + d1.gender + "," + d1.weight);
		d1.bite();
		
		System.out.println("------------------------------------------");
		Dog d2 = new Dog();
		d2.name = "ramu";
		d2.age = 5;
		d2.breed = "GS";
		d2.color = "brown";
		d2.gender = "male";
		d2.weight = 6.2;
		System.out.println("Dog ramu's properties and behaviours");
		System.out.println(d2.name + "," + d2.age + "," + d2.breed + "," + d2.color + "," + d2.gender + "," + d2.weight);
		d2.bite();
		d2.bark();
	}
}
