

import java.util.Date;

public class BidRequest 
{
	private String symbol;
	private String user;
	private Double price;
	private String time;	
			
	// public String getSymbol() {
	// 	return symbol;
	// }
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	// public String getUser() {
	// 	return user;
	// }
	public void setUser(String user) {
		this.user = user;
	}
	
	// public Double getPrice() {
	// 	return price;
	// }
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// public String getTime() {
	// 	return time;
	// }
	public void setTime() {
		this.time = (new Date()).toString();
	}
	
	public String getBid()
	{
		return user + "," + symbol + "," + time + "," + price;
	}		
}
