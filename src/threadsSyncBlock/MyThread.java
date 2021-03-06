package threadsSyncBlock;

public class MyThread extends Thread {

	Person person;

	public MyThread(Person person) {
		super();
		this.person = person;
	}

	public void run() {
		try {
			Thread.sleep(7000);
			synchronized (person) {
				person.count = person.count + 5;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Person {
	int count;
	public Person(int count) {
		super();
		this.count = count;
	}
}