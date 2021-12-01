import com.tw.dao.StaffMapper;
import com.tw.pojo.Staff;
import com.tw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {

    SqlSession session = MybatisUtils.getSession();
    StaffMapper mapper = session.getMapper(StaffMapper.class);

    @Test
    public void testSelectAllStaff() {

        List<Staff> staff = mapper.queryAllStaff();
        for (Staff staff1 : staff) {
            System.out.println(staff1);
        }
        session.close();
    }

}
