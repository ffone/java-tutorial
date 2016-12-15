import java.util.Scanner;

import ocean.Fish;
import ocean.plants.Alge;
import ocean.plants.Seeweed;

class Something{
	private String name;
	
	public Something(){
		System.out.println("constructor WORKS");		
	}
	
	public Something(int i){
		this();
		
		System.out.println("SECOND constructor WORKS and i="+i);
	}
	
	void someInfo(){
		System.out.println("this something is > "+this.name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Something object toString name >").append(" ").append(name);
		
		return sb.toString();
	}
}

class Nothing{
	public final static int SOME_NUM=666;
	public String name;
	public static String description;
	// great for id
	public static int count=0;
	public int id;

	
	public Nothing(){
		id = count;
		count++;
	}
	
	void myNameIs(){
		System.out.println("my id is <"+id+"> my name is "+name+" my description is <"+description+">");
	}
	
	public static void showDescription(){
		// this will ever work
		// System.out.println("my name is "+name);
		System.out.println("description is <"+description+">");
	} 
	
}


public class Application {

	static int showBasics=1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// one line comment
		/*
		multi line comment
		multi line comment
		multi line comment
		multi line comment
		*/
		
		System.out.println("hello hello");
		System.out.println("");		

		if(showBasics == 1){
			System.out.println("basics");	
			System.out.println("");		

//			tutorialVariable();
//			tutorialStrings();
//			tutorialLoops();
//			tutorialGetinput();
//          tutorialEnter5();
//			tutorialArray();
//			tutorialClasses();
//			tutorialStatic();
//			tutorialStringBuilder();
//			tutorialToString();
//			tutorialInheritance();
			tutorialPackage();
//			tutorial();
//			tutorial();
//			tutorial();
//			tutorial();
//			tutorial();
//			tutorial();
//			tutorial();
//			tutorial();
//			
			
		}else if(showBasics == 2){
			System.out.println("to show basics change showBasics to 1");		
			System.out.println("");				
		}else if(showBasics == 3){
			System.out.println("option nr > "+showBasics);		
			System.out.println("");				
		}else{
			System.out.println("number does not have any option");		
			System.out.println("");						
		}
		
	}
	
	private static void tutorialPackage() {
		Fish fish1 = new Fish();
		Seeweed weed = new Seeweed();
		Alge alge = new Alge();
	}

	private static void tutorialInheritance() {
		Machine mach1 = new Machine();
		mach1.start();
		mach1.machineInfo();
		mach1.stop();
		System.out.println("");						
		
		Car car1 = new Car();
		car1.start();
		car1.machineInfo();
		car1.machineCarInfo();
		car1.carInfo();
		car1.wipeWindShild();
		car1.stop();
		System.out.println("");						
		
		
	}

	private static void tutorialToString() {
		Something some = new Something();
		some.setName("whatever");
		System.out.println(some);		
		System.out.println("");		
	}

	private static void tutorialStringBuilder() {
		// INEFICIENT
		String someStr = "";
		someStr += "this is";
		someStr += " ";
		someStr += "some string";
		someStr += " ";
		someStr += "and it is ineficient";
		System.out.println(someStr);
		
		StringBuilder sb = new StringBuilder(""); 
		sb.append("this is");
		sb.append(" ");
		sb .append("string builder");
		System.out.println(sb.toString());

		StringBuilder sb1 = new StringBuilder();
		sb1.append("string builder")
		   .append(" ")
		   .append("method chainin");
		System.out.println(sb1.toString());
		System.out.println("");		

		
		for(int i=0; i<16; i++){
			System.out.printf("%-2d > some number \n", i+10);
		}
		System.out.println("");		

		
		System.out.printf("some float > %f \n", 15.2425324);
		System.out.printf("some float > %.2f \n", 15.2425324);
		System.out.printf("some float > %6.1f \n", 15.2425324);
		// align to left
		System.out.printf("some float > %-6.1f \n", 15.2425324);
	
	}

	private static void tutorialStatic() {
		Nothing.description = "norhing to describe";
		Nothing.showDescription();
		System.out.println("");		
		
		Nothing.description = "clon norhing to describe";
		Nothing.showDescription();
		System.out.println("");	
		
		System.out.println("count is "+ Nothing.count);	
		System.out.println("");	
		
		Nothing no1 = new Nothing();
		no1.name = "no1";
		no1.myNameIs();
		System.out.println("");	
		
		System.out.println("count is "+ Nothing.count);	
		System.out.println("");	
		
		Nothing no2 = new Nothing();
		no2.name = "no2";
		no2.myNameIs();
		System.out.println("");		
		
		System.out.println("count is "+ Nothing.count);	
		System.out.println("");	
		
		System.out.println("Math.PI >>> "+Math.PI);
		System.out.println("");		
		
		// error cannot reassign final value
		// Nothing.SOME_NUM=9;
	}

	private static void tutorialClasses() {
		Something som = new Something();
//		som.name = "whatever";
		som.setName("whatever");
		som.someInfo();
		System.out.println("");						
		
		Something som2 = new Something(67);
		som2.setName("who cares");
		som2.someInfo();
		
		System.out.println("");	
	}

	private static void tutorialArray() {
		
		System.out.println("Array of ints");

		int[] values = new int[3];
		values[0]=3;
		values[1]=2;
		values[2]=1;
		
		for(int i=0; i<values.length; i++){
			System.out.println("value["+i+"]"+"="+values[i]);
		}
		System.out.println("");
		
		System.out.println("Array of strings");
		String[] words = {"what", "is", "life"};
		
		for(String word: words){
			System.out.println(word);
		}
		System.out.println("");
		
		System.out.println("multi dimensional Array");
		int[][] wall ={
			{3},	
			{2,3,4},
			{4,6,8,12},
			{6,9},
			{3}
		};
		
		for (int row = 0; row < wall.length; row++) {
			for (int val = 0; val < wall[row].length; val++) {
				System.out.print(wall[row][val]+", ");
			}
			System.out.println("");
		}
		System.out.println("");
		

	}

	private static void tutorialEnter5() {
		Scanner scanner = new Scanner(System.in);
		
		int entered;
		do{
			System.out.println("enter 5 please");			
			entered = scanner.nextInt();
		}while(entered != 5);
		
		System.out.println("got > "+entered);
		System.out.println("");
	}

	private static void tutorialGetinput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter text");
		
		String enteredText = input.nextLine();

		System.out.println("you enteret > "+enteredText);
		
		input.close();
	}

	private static void tutorialLoops() {
		int limit = 6;
	
		System.out.println("while loop");

		int value = 0;
		while(value<limit){
			System.out.println("value is > "+value);
			value++;
		}
		
		System.out.println("end of while loop");
		System.out.println("");

		System.out.println("for loop");
		
		for(int i=0; i<limit; i++){
			System.out.printf("i is > %d \n", i);
			
		}

		System.out.println("end of for loop");
	}

	private static void tutorialStrings() {
		String who = "me";
		String activity = "coding";
		String what = "Java";
		
		System.out.println(who+" is "+activity+" "+what);
	}

	private static void tutorialVariable() {
		int i = 7;
		short s = 324;
		long l = 234234;
		double d =4.86085;
		float f = 55.6f;
		char ch = 'd';
		boolean b = true;
		byte by = 123;
		
		System.out.println("int"+" > "+i);
		System.out.println("short"+" > "+s);
		System.out.println("long"+" > "+l);
		System.out.println("double"+" > "+d);
		System.out.println("float"+" > "+f);
		System.out.println("char"+" > "+ch);
		System.out.println("boolean"+" > "+b);
		System.out.println("byte"+" > "+by);
	}

}
