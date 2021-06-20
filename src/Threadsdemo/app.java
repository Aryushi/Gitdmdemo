package Threadsdemo;

class MyTask{
	void executeTask() {
		for(int doc=1;doc<=10;doc++) {
		System.out.println("Printing Document #"+doc);
	}
}
}
public class app {
	//main method represents main thread
public static void main(String args[]) {
	//whatever we write in here will be executed by main method
	//threads always execute the jobs in a sequence
	//job1
	System.out.println("Application started");
	
	//some code to printthe documents
	//job2
	for(int doc=1;doc<=10;doc++) {
		System.out.println("Printing documents #"+doc);
	}
	
	//job3
	System.out.println("Application finished");
}
}
