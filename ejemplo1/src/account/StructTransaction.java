package account;

public class StructTransaction {
	private String type;
	private String date;
	private Double moveMoney;
	public StructTransaction() {
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getMoveMoney() {
		return moveMoney;
	}
	public void setMoveMoney(Double moveMoney) {
		this.moveMoney = moveMoney;
	}
	
}
