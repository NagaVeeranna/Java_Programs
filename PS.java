class SharedData
{
	synchronized void produce()
	{
		System.out.println("Producing..");
		try
		{
			Thread.sleep(1000);
			notify();
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	synchronized void consume()
	{
		System.out.println("Consuming..");
		try
		{
			Thread.sleep(3000);
			notify();
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class Producer implements Runnable
{
	private final SharedData sharedData;
	Producer(SharedData sharedData)
	{
	this.sharedData = sharedData;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			sharedData.produce();
		}
	}
}
class Consumer implements Runnable
{
	private final SharedData sharedData;
	Consumer(SharedData sharedData)
	{
	this.sharedData = sharedData;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			sharedData.consume();
		}
	}
}
class PS
{
	public static void main(String[] args)	
	{
		SharedData s = new SharedData();
		Thread pt = new Thread(new Producer(s));
		Thread ct = new Thread(new Consumer(s));
		pt.start();
		ct.start();
	}
}