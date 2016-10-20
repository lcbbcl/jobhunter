package us.codecraft.jobhunter.model;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.AfterExtractor;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * @author code4crafer@gmail.com
 *         Date: 13-6-23
 *         Time: 下午4:28
 */
@TargetUrl("http://blog.csdn.net/u011513853/article/details/\\d+")
@HelpUrl("http://blog.csdn.net/u011513853/article/list/*")
public class UserBlog implements AfterExtractor {
    @ExtractBy("//div[@id=blog_userface]//span/a/text()")
    private String userName="";
    @ExtractBy("//h1//span[@class=link_title]//a/text()")
    private String blogTitle;
    @ExtractBy("//div[@class=article_r]//span[@class=link_postdate]/text()")
    private String date;
           
    @ExtractBy("//div[@class=article_r]//span[@class=link_view]/text()")
    private String readCount;

    
    
    
	public String getReadCount() {
		return readCount;
	}

	public void setReadCount(String readCount) {
		this.readCount = readCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserBlog [userName=" + userName + ", blogTitle=" + blogTitle + ", date=" + date + "]";
	}

	@Override
    public void afterProcess(Page page) {
		page.addTargetRequest("http://my.csdn.net/service/main/getSorce?username=u014042146");
		System.out.println(page);
		System.out.println("-------userName--------  "+userName);
		System.out.println("-------blogTitle-------  "+blogTitle);
		System.out.println("-------date------------  "+date);
    }
}
