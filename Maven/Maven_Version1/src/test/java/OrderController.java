import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class OrderController {

    @Test
    public void createOrder(HttpServletRequest request) throws SQLException {
        // 编译成功：provided 依赖在编译期可见
        String clientIP = request.getRemoteAddr();

        // 编译报错：runtime 依赖不可见
        Driver driver = new Driver();

    }
}