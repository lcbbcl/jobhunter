package us.codecraft.jobhunter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import us.codecraft.jobhunter.model.SiliconExpert;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

/**
 * @author code4crafer@gmail.com
 *         Date: 13-6-23
 *         Time: 下午4:19
 */
@Component
public class JobCrawler {

    @Qualifier("UserBlogDaoPipeline")
    @Autowired
    private PageModelPipeline jobInfoDaoPipeline;
    
    @Qualifier("SiliconExpertDAOpipeline")
    @Autowired
    private PageModelPipeline SiliconExpertDAOpipeline;

    public void crawl() {
       /* OOSpider.create(Site.me().setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36"),
        							jobInfoDaoPipeline, UserBlog.class)
        						.addUrl("http://blog.csdn.net/u011513853")
        						.thread(5)
        						.run();*/
        
        OOSpider.create(Site.me().setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36"),
        		SiliconExpertDAOpipeline, SiliconExpert.class)
			.addUrl("http://app.siliconexpert.com/parts/products.jsp")
			.thread(5)
			.run();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext*.xml");
        final JobCrawler jobCrawler = applicationContext.getBean(JobCrawler.class);
        jobCrawler.crawl();
        System.out.println("------结束-------");
    }
}
