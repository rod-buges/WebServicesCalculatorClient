import com.service.client.Calculator;
import jakarta.xml.ws.Service;
import com.service.client.ServerUtil;

public class Main {
    public static void main(String[] args) {
        Service service = ServerUtil.getConnection();
        if (service != null) {
            Calculator calculator = service.getPort(Calculator.class);
            double a = 5, b = 4, result = 0;
            result = calculator.add(5, 3);
            System.out.println("O resultado de: A:" + a + " B:" + b);
            result = calculator.add(5, 3);
            System.out.println("Add: " + result);


        }
    }
}
