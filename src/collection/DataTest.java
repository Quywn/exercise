package collection;

import oop.Order;
import oop.Review;
import oop.Status;
import oop.product.Product;
import oop.user.User;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class DataTest {
    public List<Product> products;
    public List<Order> orders;
    public List<User> users;
    public List<Review> reviews;
    Product hamburger = new Product("Hamburger","BO1", 3, "Fast Food", 1);
    Product lemon = new Product("Lemon juice", "BO2",1, "Drink", 1);
    Product bread = new Product("Bread","BO3", 1, "Fast Food", 1);
    Product meat = new Product("Meat","BO4", 5, "Food", 1);
    User user1 = new User("user1","quyenvtn","pass", Arrays.asList("BUY_PRODUCTS", "WRITE_REVIEWS"));
    User user2 = new User("user2","thanhnt","pass",Arrays.asList("BUY_PRODUCTS", "WRITE_REVIEW"));
    User user3 = new User("user2","hoant","pass",Arrays.asList("BUY_PRODUCTS", "WRITE_REVIEW"));
    Review review1 = new Review(user1, lemon, 4, "Good", LocalDateTime.of(2025, Month.FEBRUARY, 20, 11, 20, 15));
    Review review2 = new Review(user2, hamburger, 3, "Not bad", LocalDateTime.of(2025, Month.FEBRUARY, 20, 11, 20, 17));
    Review review3 = new Review(user3, bread, 5, "Perfect",LocalDateTime.of(2025, Month.FEBRUARY, 20, 11, 20, 20));

    public List<Product> initProducts() {
        products = Arrays.asList(hamburger, lemon, bread, meat);
        return products;
    }

    public List<Order> initCompletedOrders() {
        initProducts();
        Order order1 = new Order("O1","user1", products,12312, Status.COMPLETED, LocalDateTime.of(2025, Month.FEBRUARY, 20, 11, 20, 15));
        Order order2 = new Order("O2","user2", products,12312, Status.COMPLETED, LocalDateTime.of(2025, Month.FEBRUARY, 20, 11, 20, 17));
        Order order3 = new Order("O3","user2", products,12312, Status.COMPLETED, LocalDateTime.of(2025, Month.FEBRUARY, 20, 11, 20, 20));
        Order order4 = new Order("O4","user3", products,12312, Status.COMPLETED, LocalDateTime.of(2025, Month.FEBRUARY, 20, 11, 20, 22));

        orders = Arrays.asList(order1, order2, order3, order4);
        return orders;
    }

    public List<User> initUsers() {
        users = Arrays.asList(user1, user2, user3);
        return users;
    }

    public List<Review> initReviews() {
        reviews = Arrays.asList(review1, review2, review3);
        return reviews;
    }



}
