package com.hmall.order;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.hmall.order.convert.OrderConvert;
import com.hmall.order.event.UserProduce;
import com.hmall.order.pojo.Order;
import com.hmall.order.pojo.OrderVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class MapStructTest {
    @Resource
    UserProduce userProduce;
    @Test
    public void test() {
//        OrderConvert assemble = OrderConvert.ASSEMBLE;
//        OrderVO orderVO = assemble.OrderAssemble(new Order() {{
//            setStatus(6);
//        }});
//        System.out.println(JSONUtil.parse(orderVO));
    }

    @Test
    public void produce() {
        System.out.println('1');
        userProduce.sendMessage("my-boot-topic", "user向order发送了一条消息");
    }
}
