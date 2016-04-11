package section2.liftoff;

/**
 * 火箭发射 </br> Java编程思想（第4版）.第21章并发.第2节基本的线程机制.P655
 * 
 * @author WANGTUO-PC
 * @since 2016.04.10
 */
public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
		// start()方法可以迅速返回，因为LiftOff.run()是由不同的线程执行的，因此仍然可以执行main()线程中的其他操作。
	}

}
