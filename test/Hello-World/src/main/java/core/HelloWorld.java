package core;

public class HelloWorld {
	
	public String helloMethod(){
		String a = "Hello";
		String b = "How are you";
		
		return a + b + this.getClass().getName();
	}
	
	public String answerMethod(){
		String c = "Hi";
		String d = "Good";
		
		return c + d + this.getClass().getName();
	}
	
	public String worldMethod(){
		return "HelloWorld from " +  this.getClass().getName();
	}
}
