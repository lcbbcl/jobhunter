package us.codecraft.jobhunter.pipeline;

import org.springframework.stereotype.Component;
import us.codecraft.jobhunter.dao.UserBlogDAO;
import us.codecraft.jobhunter.model.UserBlog;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;

/**
 * @author code4crafer@gmail.com
 *         Date: 13-6-23
 *         Time: 下午8:56
 */
@Component("UserBlogDaoPipeline")
public class UserBlogDaoPipeline implements PageModelPipeline<UserBlog> {

    @Resource
    private UserBlogDAO jobInfoDAO;

    @Override
    public void process(UserBlog lieTouJobInfo, Task task) {
        jobInfoDAO.add(lieTouJobInfo);
    }
}
