package lq.ssad.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    //添加事物，目的也就让执行的sql语句进行事物回滚
    //也就是在int sum = 10/0语句程序执行出现异常的情况下，让 userDao.insert();插入不成功 而不是出现方法出现异常的情况下还插入成功
    @Transactional
    public int insert(Integer id,String name){
        int insert = userDao.insert(id, name);
        System.out.println("插入数据了");
        int sum = 10/0;
        System.out.println("sum:"+sum);
        return insert;
    }

}
