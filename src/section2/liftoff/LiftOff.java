package section2.liftoff;

/**
 * 火箭发射 </br> Java编程思想（第4版）.第21章并发.第2节基本的线程机制.P654
 * 
 * @author WANGTUO-PC
 * @since 2016.04.10
 */
public class LiftOff implements Runnable {

	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++; // id是final的，常量，不会taskCount++

	public LiftOff() {
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Lift off !")
				+ "), ThreadId==" + Thread.currentThread().getId();
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(status());
			// 暂停当前正在执行的线程对象，并执行其他线程。
			Thread.yield();
		}
	}

}
