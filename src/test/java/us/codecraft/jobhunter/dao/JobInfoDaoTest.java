/*package us.codecraft.jobhunter.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import us.codecraft.jobhunter.model.UserBlog;

import javax.annotation.Resource;

*//**
 * User: cairne
 * Date: 13-5-13
 * Time: 下午8:33
 *//*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-*.xml"})
public class JobInfoDaoTest {
    @Resource
    private UserBlogDAO jobInfoDAO;

    @Ignore
    @Test
    public void test() {
        UserBlog jobInfo = new UserBlog();
        jobInfo.setSource("a");
        try {
            final int add = jobInfoDAO.add(jobInfo);
            System.out.println(add);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/