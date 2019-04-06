package prob2B;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		List<OrderLine> list = new LinkedList<OrderLine>();
		OrderLine orderline1 = new OrderLine();
		OrderLine orderline2 = new OrderLine();
		OrderLine orderline3 = new OrderLine();
		OrderLine orderline4 = new OrderLine();
		list = Arrays.asList(orderline1,orderline2,orderline3,orderline4);		
		Order order = new Order(list);
	}

}
