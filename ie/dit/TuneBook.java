package ie.dit;

import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	public tunes()
	{
		loadtunes();
	}

	public String toString();
	{
		
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
}