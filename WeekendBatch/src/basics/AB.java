package basics;

public class AB {
public static void main(String[] args) throws InterruptedException {
	new AB().testA();
}
public void testA() throws InterruptedException {
	testB();
}
public void testB() throws InterruptedException {
	Thread.sleep(0);
}
}
