class GoodMorningRunnable implements Runnable 
{
    public void run() 
	{
        	while (true) 
		{
            		System.out.println("Good Morning");
            	try 
		{
                	Thread.sleep(1000); 
            	} 
		catch (InterruptedException e) 
		{
                	System.out.println(e.getMessage());
            	}
        }
    }
}

class HelloRunnable implements Runnable 
{
    public void run() 
	{
        	while (true) 
	{
            	System.out.println("Hello");
        try 
	{
                Thread.sleep(2000); 
        } 
	catch (InterruptedException e) 
	{
                System.out.println(e.getMessage());
        }

        }
    }
}

class WelcomeRunnable implements Runnable 
{
	public void run() 
	{
        	while (true) 
		{
            		System.out.println("Welcome");
            	try 
		{
                	Thread.sleep(3000);
            	} 
		catch (InterruptedException e) 
		{
                	System.out.println(e.getMessage());
            	}
        }
    }
}

public class RunnableExample 
{
	public static void main(String[] args) 
	{
        	Thread goodMorningThread = new Thread(new GoodMorningRunnable());
        	Thread helloThread = new Thread(new HelloRunnable());
        	Thread welcomeThread = new Thread(new WelcomeRunnable());

        	goodMorningThread.start();
        	helloThread.start();
        	welcomeThread.start();
    	}
}
