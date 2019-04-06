package src.prob2B;

public class Order {
	private int orderNumber;
	private List<OrderLine> orderline;
	
	Order(List<OrderLine> orderline){
		this.orderline = orderline;
	}
	public void setOrderNumber(int number) {
		this.orderNumber = number;
	}
	public void setOrderLine(List<OrderLine> list){
		this.orderline = list;
	}
	public int getOrderNumber() {
		return this.orderNumber;
	}
	public List<OrderLine> getOrderLine(){
		return this.orderline;
	}
}
