package ie.dit;

import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	public tunes()
	{
		loadtunes();
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for(String tune:tunes)
		{
			sb.append(x + title + altTitle);
		}

		return sb.toString();
	}

	public Tune findTune(String title)
	{
		for(String tune:tunes)
		{
			if(tune.contains(title))
			{
				return title;
			}
		}
	}

	public void loadtunes();
	{
		BufferedReader inputStream = null;

		try 
		{
	    	inputStream = new BufferedReader(new FileReader("hnj0.abc.txt"));
	    
		    String l;
		    while ((l = inputStream.readLine()) != null) 
		    {
		        System.out.println(l);
		    }
		}

		catch (IOException e)
		{
		    e.printStackTrace();
		} 

		finally 
		{	
	    	if (inputStream != null) 
	    	{
	       		try
	        	{
	            	inputStream.close();
	        	}
	        	catch(Exception e)
	        	{
	           	 e.printStackTrace();
	        	}
    		}
		}	    
	}

	public static void main(String[] args)
	{
		TuneBook tb = new TuneBook("hnj0.abc");
		System.out.println(yb);

		Tune t = tb.findTune("Scotsman over the Border");
		t.play();
	}
}
