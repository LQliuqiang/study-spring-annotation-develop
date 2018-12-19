package lq.ssad.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {

    private static final String sql = "INSERT INTO `tbl_dept`(dept_id,dept_name) VALUES(?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Integer id,String name){
        return jdbcTemplate.update(sql, id,name);
    }

}
