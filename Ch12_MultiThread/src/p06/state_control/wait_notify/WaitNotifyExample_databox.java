package p06.state_control.wait_notify;

public class WaitNotifyExample_databox {

	public static void main(String[] args) {
		DataBox data = new DataBox();
		
		ProducerThread pro = new ProducerThread(data);
		ConsumerThread con = new ConsumerThread(data);
		
		pro.start();
		con.start();

	}

}
