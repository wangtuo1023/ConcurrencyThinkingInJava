package section2.liftoff;

/**
 * 火箭发射 </br> Java编程思想（第4版）.第21章并发.第2节基本的线程机制.P655
 * 
 * @author WANGTUO-PC
 * @since 2016.04.10
 */
public class MoreBasicThreads {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new Thread(new LiftOff()).start();
		System.out.println("Waiting for LiftOff");
	}

}
