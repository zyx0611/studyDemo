package com.hmall.order;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.hmall.order.convert.OrderConvert;
import com.hmall.order.pojo.Order;
import com.hmall.order.pojo.OrderVO;
import org.junit.Test;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = OrderApplication.class)
public class MapStructTest {

    @Test
    public void test() {
        OrderConvert assemble = OrderConvert.ASSEMBLE;
        OrderVO orderVO = assemble.OrderAssemble(new Order() {{
            setStatus(6);
        }});
        System.out.println(JSONUtil.parse(orderVO));
    }
}
