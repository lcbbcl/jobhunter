package us.codecraft.jobhunter.model;

import java.util.List;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.AfterExtractor;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * SiliconExpert的初步爬虫(),产品目录
 * http://app.siliconexpert.com/parts/products.jsp
 * @author licaibo
 *
 */
@TargetUrl("http://app.siliconexpert.com/parts/products.jsp")
//@HelpUrl("http://app.siliconexpert.com/parts/products.js\\w+")
@ExtractBy(value  = "//div[@class=subpage-listdiv2]",multi=true)//对于class上面不使用废弃的multi=true任何返回一个List集合的class?
public class SiliconExpert implements AfterExtractor{
	@ExtractBy("//h2/text()")
	private String bigCategory;
	

	private String smallCategory;
	
	@ExtractBy(value = "//ul[@class=list-homepageitem]//li//a/text()")
	private List<String> SmallCategoryList;
	
	
	public String getBigCategory() {
		return bigCategory;
	}

	public void setBigCategory(String bigCategory) {
		this.bigCategory = bigCategory;
	}

	

	public String getSmallCategory() {
		return smallCategory;
	}

	public void setSmallCategory(String smallCategory) {
		this.smallCategory = smallCategory;
	}

	public List<String> getSmallCategoryList() {
		return SmallCategoryList;
	}

	public void setSmallCategoryList(List<String> smallCategoryList) {
		SmallCategoryList = smallCategoryList;
	}

	@Override
	public void afterProcess(Page page) {
		/*System.out.println(page.getHtml().xpath("//ul[@class=list-homepageitem]//li//a/text()").all());
		System.out.println(page.getHtml().all());
		System.out.println(page);*/
		
	}
	
	
	
}
