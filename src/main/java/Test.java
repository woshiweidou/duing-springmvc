import com.lu.entity.User;
import com.lu.springLearn.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.rmi.StubNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springLearn.xml");
//        TestController testController = (TestController) context.getBean("con");
//        testController.test();
        JdbcTemplate template = (JdbcTemplate) context.getBean("springTemplate");
        String sql = "insert into user values (?,?,?,?,?)";
//        //增
//        template.update(sql,4,"reretr","18545","廉卿",88655);
        //删
//        String deleteSql = "delete from user where id = ?";
//        template.update(deleteSql,4);
//        //改
//        String updateSql = "update user set realname = ? where id = ?";
//        template.update(updateSql,"李青",1);
        //查一个列
        String queryRow = "select * from user ";
        RowMapper rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                User user =  new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setRealname(resultSet.getString("realname"));
                user.setPassword(resultSet.getString("password"));
                user.setPhone(resultSet.getInt("phone"));
                return user;
            }
        };
        List list = template.query(queryRow,rowMapper);
        System.out.println(list);

    }
}
