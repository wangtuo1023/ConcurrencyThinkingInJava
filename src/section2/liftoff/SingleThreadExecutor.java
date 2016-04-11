package section2.liftoff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 火箭发射，通过ExecutorService中的SingleThreadExecutor管理Thread </br>
 * Java编程思想（第4版）.第21章并发.第2节基本的线程机制.P658
 * 
 * @author WANGTUO-PC
 * @since 2016.04.10
 */
public class SingleThreadExecutor {
	public static void main(String[] args) {
		// 线程数量为1的FixedThreadPool，在一个线程中连续执行任务。
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}
