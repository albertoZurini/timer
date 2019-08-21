package main;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main
{
	private static final int TIMEOUT = 20; // mins
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		int count = 0;
		while(true) {
			Interaction.Alert("Focus", "Focus - time elapsed: "+count);
			TimeUnit.SECONDS.sleep(20);
			Interaction.Alert("Focus", "20s elapsed");
			Toolkit.getDefaultToolkit().beep();
			count+=TIMEOUT;
			TimeUnit.MINUTES.sleep(TIMEOUT);
		}
	}
}