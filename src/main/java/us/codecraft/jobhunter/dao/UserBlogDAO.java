package us.codecraft.jobhunter.dao;

import org.apache.ibatis.annotations.Insert;
import us.codecraft.jobhunter.model.UserBlog;

/**
 * @author code4crafer@gmail.com
 *         Date: 13-6-23
 *         Time: 下午4:27
 */
public interface UserBlogDAO {

    @Insert("insert into UserBlog (`userName`,`blogTitle`,`date`,`readCount`) values (#{userName},#{blogTitle},#{date},#{readCount})")
    public int add(UserBlog jobInfo);
}
