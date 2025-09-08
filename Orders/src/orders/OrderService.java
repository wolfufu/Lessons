package orders;

import java.time.LocalDate;

public class OrderService {

    public interface OrderService {

        Order[] getOrderByClient(long clientId);

        // Order[] getOrderByClient(long clientId, LocalDate date);

        default  Order[] getOrderByClient(long clientId, LocalDate date) {
            Order[] allOrders = getOrdersByClient(clientId);
            return Orders.filterByDate(allOrders, date);
        }

    }

    public class OrderServiceImpl extends ServiceBase implements OrderService {
        public Order[] getOrderByClient(long clientId) {
            // ...
        }
    }
}
