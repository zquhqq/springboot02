import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;

import java.util.Set;

public class JedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void Test1(){
        //1、通过redisTemplate设置值
        redisTemplate.boundSetOps("setKey").add("setValue1", "setValue2", "setValue3");
        SetOperations<String, String> set = redisTemplate.opsForSet();
        redisTemplate.opsForSet().add("huangqiqin",1,2,3,4);
        long setLength = redisTemplate.opsForSet().size("setValue");
        System.out.println(setLength);
    }


}
