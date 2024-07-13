import com.hmall.user.pojo.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class streamTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User() {{
            this.setUsername("张三");
            this.setPhone("123");
        }});
        list.add(new User() {{
            this.setUsername("李四");
            this.setPhone("567");
        }});
//        list.add(new User() {{
//            this.setUsername("李四");
//            this.setPhone("789");
//        }});
        Map<String, User> collect = list.stream().collect(Collectors.toMap(User::getUsername, Function.identity()));
        log.info("11: {}", collect);
    }
}
