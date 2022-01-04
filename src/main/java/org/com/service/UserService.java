//package org.com.service;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.apache.commons.lang3.StringUtils;
//import org.com.dao.UserDao;
//import org.com.po.User;
//import org.com.po.UserQuery;
//import org.com.util.AssertUtil;
//import org.com.util.MD5Until;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.SetOperations;
//import org.springframework.stereotype.Service;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//import java.util.Set;
//import java.util.jar.JarOutputStream;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Resource
//    //private UserDao userDao;
//    /**
//     * 登录操作
//     */
//
//    /**
//     * 通过用户名查询用户对象
//     * @param username
//     * @return
//     */
//    //@Cacheable(value = "users", key = "#username") // 缓存
//    public User queryUserByName(String username){
//        // 1. 通过redisTemplate设置值
//        redisTemplate.boundValueOps("name").set("黄启钦");
//        // 2. 通过redisTemplate获取值
//        String str1 = (String) redisTemplate.boundValueOps("name").get();
//        System.out.println(str1);
//        //字符串相关操作
//        redisTemplate.opsForValue().set("name1", "kljlkj");
//        Object k = redisTemplate.opsForValue().get("name1");
//        System.out.println(k);
//        //User user = userDao.queryuserByName(username);
//        redisTemplate.boundSetOps("setKey").add("setValue1", "setValue2", "setValue3");
//
//        redisTemplate.opsForSet().add("huangqiqin",1,2,3,4);
//        // 计算set集合中的变量个数
//        long setLength = redisTemplate.opsForSet().size("huangqiqin");
//        System.out.println(setLength);
//        // 从集合key中移除value变量值
//        redisTemplate.opsForSet().remove("huangqiqin",1);
//        long setLength1 = redisTemplate.opsForSet().size("huangqiqin");
//        System.out.println(setLength1);
//        // 检查集合中是否包含value
//        Boolean flag  = redisTemplate.opsForSet().isMember("huangqiqin",4);
//        System.out.println(flag);
//        // 获取集合列表
//        Set set2  = redisTemplate.opsForSet().members("huangqiqin");
//        System.out.println(set2);
//
//        User user = null;
//        return user;
//    }
//    /**
//     * 通过用户Id查询用户对象
//     * @param id
//     * @return
//     */
//    @Cacheable(value = "users", key = "#id")
//    public User queryUserById(Integer id){
//        //User user = userDao.queryUserById(id);
//        return user;
//    }
//    /**
//     * 添加用户
//     *    1. 非空校验（用户名、密码）
//     *         StringUtils.isBlank("字符串")
//     *           如果返回true，则表示为空
//     *    2. 验证用户名唯一性（通过用户名查询用户记录）
//     *           如果用户对象存在，则用户名不可用
//     *    3. 添加用户记录，判断受影响的行数，如果受影响的行数小于1，则失败
//     * @param user
//     */
//    @Transactional(propagation = Propagation.REQUIRED) // 添加 事务控制， 防止出现脏数据
//    public void saveUser(User user){
//        // 非空校验（用户名、密码）
//        AssertUtil.isTure(StringUtils.isBlank(user.getUserName()),"用户名不能为空");
//        AssertUtil.isTure(StringUtils.isBlank(user.getUserPwd()),"用户密码不能为空");
//        // 验证用户名唯一性（通过用户名查询用户记录）
//        User temp = userDao.queryuserByName(user.getUserName());
//        // 用户已经存在，提示用户换个账号
//        AssertUtil.isTure(null != temp,"该用户已存在，请重试！");
//        // 使用JDK自带的MD5加密算法对敏感数据进行加密
//        user.setUserPwd(MD5Until.md5Jdk(user.getUserPwd()));
//        // 添加用户记录，判断受影响的行数，如果受影响的行数小于1，则失败
//        AssertUtil.isTure(userDao.save(user) < 1,"添加用户失败");
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
//    @Transactional(propagation = Propagation.REQUIRED) // 添加 事务控制， 防止出现脏数据
//    @CachePut(value = "users", key = "#user.id")
//    public User updateUser(User user){
//        // 非空校验（用户名、密码）
//        AssertUtil.isTure(StringUtils.isBlank(user.getUserName()),"用户名不能为空");
//        AssertUtil.isTure(StringUtils.isBlank(user.getUserPwd()),"用户密码不能为空");
//        // 系统出现异常
//        AssertUtil.isTure(user.getId() == null,"系统异常，请重试！");
//        // 验证用户名唯一性（通过用户名查询用户记录）
//        User temp = userDao.queryuserByName(user.getUserName());
//        AssertUtil.isTure(temp != null && !(user.getId().equals(temp.getId())),"用户名已存在，请重试！");
//        // 使用JDK自带的MD5加密算法进行加密
//        user.setUserPwd(MD5Until.md5Jdk(user.getUserPwd()));
//        // 更新操作
//        AssertUtil.isTure(userDao.updateUser(user) < 1,"用户更新失败！");
//
//        return user;
//    }
//    /**
//     * 删除用户
//     *     1. 判断 Id 是否为空
//     *     2. 查询的用户对象是否存在
//     *     3. 执行删除操作，判断受影响的行数
//     * @param id
//     */
//    @Transactional(propagation = Propagation.REQUIRED) // 添加 事务控制， 防止出现脏数据
//    @CacheEvict(value = "users", key = "#id")
//    public void deleteUser(Integer id){
//        // 判断 Id 是否为空，查询的用户对象是否存在
//        AssertUtil.isTure(id == null || userDao.queryUserById(id) == null,"待删除记录不存在！");
//        // 执行删除操作，判断受影响的行数
//        AssertUtil.isTure(userDao.deleteUser(id) < 1,"用户删除失败");
//    }
//
//    /**
//     * 通过指定参数，分页查询用户列表
//     * @param userQuery
//     * @return
//     */
//    @Cacheable(value="users",key = "#userQuery.userName+'-'+#userQuery.pageNum+'-'+#userQuery.pageSize")
//    public PageInfo<User> queryUserByParams(UserQuery userQuery){
//
//        userQuery.setUserName(MD5Until.md5Jdk(userQuery.getUserName()));
//        // 开启分页
//        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
//        // 返回分页对象
//        return new PageInfo<User>(userDao.selectByParams(userQuery));
//    }
//
//}
