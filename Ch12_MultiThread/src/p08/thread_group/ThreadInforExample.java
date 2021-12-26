package p08.thread_group;

import java.util.Map;
import java.util.Set;

import p07.daemon_thread.AutoSaveThread;

public class ThreadInforExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread= new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		
		Map<Thread, StackTraceElement[]> map= Thread.getAllStackTraces(); //프로세스에서 실행하는 모든 Thread를 가져오는 코드
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name: " + thread.getName()+((thread.isDaemon())?"(데몬)": "(주)"));
			System.out.println("\t"+"소속그룹: "+thread.getThreadGroup().getName());
			System.out.println();
		}

	}

}
