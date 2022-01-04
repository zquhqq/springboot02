package org.com.controller;//package org.com.controller;
//
//import com.github.pagehelper.PageInfo;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiOperation;
//import org.com.po.User;
//import org.com.po.UserQuery;
//import org.com.service.UserService;
//import org.com.util.ResultInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//import javax.validation.Valid;
//
//@Api(tags = "用户模块",value = "用户模块接口")
//@RestController
//public class UserController {
//
//    @Resource
//    private UserService userService;
//
//    @Autowired
//    private RedisTemplate<String,String> redisTemplate;
//
//    /**
//     * 登录
//     */
//
//    /**
//     * 通过用户名查询用户对象
//     * @param username
//     * @return
//     */
//    @GetMapping("user/name")
//    @ApiOperation(value = "根据用户名查询用户对象",notes = "用户名称不能为空")
//    @ApiImplicitParam(name = "username",value = "用户名称",required = true,dataType = "String",paramType = "路径参数")
//    public User queryUserByName( @PathVariable  String username){
//        User user = userService.queryUserByName(username);
//        return user;
//    }
//    /**
//     * 通过用户Id查询用户对象
//     * @param id
//     * @return
//     */
//    @GetMapping("user/{id}")
//    @ApiOperation(value = "根据用户id查找用户对象",notes = "用户Id不能为空")
//    @ApiImplicitParam(name = "id",value = "用户ID" ,required = true,paramType = "path")
//    public User queryUserById(@PathVariable  Integer id){
//        User user = userService.queryUserById(id);
//        return user;
//    }
//    /**
//     * 添加用户操作
//     * @param user
//     * @return
//     */
//    @PostMapping("user")
//    @ApiOperation(value = "用户添加",notes = "参数为实体类User")
//    @ApiImplicitParam(name = "user",value = "用户实体类")
//    public ResultInfo saveUser(@RequestBody User user){
//        ResultInfo resultInfo = new ResultInfo();
//        userService.saveUser(user);
//        return resultInfo;
//    }
//    /**
//     * 添加用户操作，数据校验-Validation
//     * @param user
//     * @return
//     */
//    @PostMapping("user02")
//    @ApiOperation(value = "用户添加",notes = "参数为实体类User")
//    @ApiImplicitParam(name = "user",value = "用户实体类")
//    public ResultInfo saveUser02(@Valid User user){
//        ResultInfo resultInfo = new ResultInfo();
//        userService.saveUser(user);
//        return resultInfo;
//    }
//    /**
//     * 更新用户
//     *    1. 非空校验（用户名、密码）
//     *    2. 验证用户名的唯一性（通过用户名查询用户）
//     *          如果用户名不存在，表示可用
//     *          如果用户名存在，
//     *               判断存在的记录是否是当前要修改的记录（通过id）
//     *    3. 更新用户记录，判断受影响的行数
//     * @param user
//     */
//    @PutMapping("user")
//    @ApiOperation(value = "用户更新",notes = "参数为实体类User")
//    @ApiImplicitParam(name = "user",value = "用户实体类")
//    public ResultInfo updateUser(@RequestBody User user){
//        ResultInfo resultInfo = new ResultInfo();
//        userService.updateUser(user);
//
//        return resultInfo;
//    }
//
//    /**
//     * 删除用户
//     *    1. 非空校验（用户名、密码）
//     *    2. 验证用户名的唯一性（通过用户名查询用户）
//     *          如果用户名不存在，表示可用
//     *          如果用户名存在，
//     *               判断存在的记录是否是当前要修改的记录（通过id）
//     *    3. 更新用户记录，判断受影响的行数
//     * @param id
//     */
//    @DeleteMapping("user/{id}")
//    @ApiOperation(value = "用户删除",notes = "用户Id不能为空")
//    @ApiImplicitParam(name = "id",value = "用户实体类",required = true,paramType = "path")
//    public ResultInfo deleteUser(@PathVariable Integer id) {
//        ResultInfo resultInfo = new ResultInfo();
//        userService.deleteUser(id);
//
//        return resultInfo;
//    }
//
//    /**
//     * 分页条件查询用户集合
//     * @param userQuery
//     * @return
//     */
//    @GetMapping("user/list")
//    @ApiOperation(value="多条件分页查询用户列表",notes = "支持多条件及单条件、没有条件默认查询全部")
//    @ApiImplicitParam(name = "userQuery",value = "用户查询对象")
//    public PageInfo<User> queryUserList(UserQuery userQuery){
//        return userService.queryUserByParams(userQuery);
//    }
//
//    @GetMapping("/list")
//    @ResponseBody
//    public String test(){
//        redisTemplate.opsForValue().set("student","sendi");
//        return "hello";
//    }
//
//}

import com.alibaba.fastjson.JSONObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller //设置为@Controller层
@RequestMapping("user") //设置类路径
public class UserController {
    //注入jedis缓存数据库
    Jedis jedis = new Jedis();

    @PostMapping("login")
    //设置返回类型为json格式
    @ResponseBody
    //用code获取前端post请求的参数，注：@RequestParam("value"),value的值要和前端的参数保持一致
    public  Map<String, Object> login(@RequestParam("code") String code){
        System.out.println(code);
        /**
         * 微信小程序授权登录步骤
         *    0. 先检验本地缓存中是否存在token，直接请求后端服务器，获取用户信息
         *    1. wx.login(),获取到一个code
         *    2. 把code传给后端，后端获取openid和session_key,本地缓存数据库redis存档一份
         *    3. 把openid存在于数据库当中，直接根据openid查询用户的信息，返回信息和token
         *    4. 如果openid不存在于数据库当中，把openid存到数据库当中，相当于插入了user用户，只不过昵称、头像都是空的，依然返回用户信息
         *    5. 前端肯定获取到用户信息和token，如果用户信息是空，说明没有授权过，就要显示授权按钮，等待用户授权
         *    6. 用户同意授权后，可以通过wx.getUserInfo()拿到用户信息，把信息传给后端，请求头携带token
         *    7. 后端接收到请求之后，根据token获取对应的user表记录、用户，将信息更新到数据库
         */
        Map<String, Object> result = new HashMap<String, Object>();
//        //微信小程序Appid
        String appid = "wxb6cde36368a7150b";
        //微信小程序secret
        String secret = "1807258ccb5558eb82b8532bef06f8a3";
        //拼接第三方url地址，使用get请求
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="
                +appid+"&secret="
                +secret+"&js_code="
                +code+"&grant_type=authorization_code";
        try {
            //实例化一个okhttp3对象
            OkHttpClient client = new OkHttpClient();
            //获取第三方Request请求
            Request request = new Request.Builder().url(url).build();
            // 响应第三方请求
            Response response = client.newCall(request).execute();
            // 判断请求是否成功
            if(response.isSuccessful()) {
                // 请求成功，获取用户openid和session_key
                String body = response.body().string();
                //将String格式转换成json格式
                Map<String, String> map = JSONObject.parseObject(body, Map.class);
                //获取openid
                String openid = map.get("openid");
                System.out.println(openid);
                //获取session_key
                String session_key = map.get("session_key");

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}