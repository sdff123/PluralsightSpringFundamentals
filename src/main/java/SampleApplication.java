import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class SampleApplication {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
