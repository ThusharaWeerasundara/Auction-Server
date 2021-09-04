

public class Begin extends ClientGui
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
			ClientGui frame = new ClientGui();
			frame.setVisible(true);
			

			//HandleClient connect = new HandleClient(this.socket);
			//Thread t = new Thread(connect);
			//t.start();
			//System.out.print("work1");
			while(true)
			{		
					
					//System.out.println("work2");
					String newvalue = frame.getClient().getStockValue();
					
					
					System.out.print("");
					if(newvalue != null )
					{
						frame.setHighestBid(newvalue);
					}
					
				
				
			}
	}
} 