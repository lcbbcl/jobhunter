package us.codecraft.jobhunter.pipeline;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import us.codecraft.jobhunter.dao.SiliconExpertDAO;
import us.codecraft.jobhunter.model.SiliconExpert;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;
@Component("SiliconExpertDAOpipeline")
public class SiliconExpertDAOpipeline implements PageModelPipeline<SiliconExpert>{

	@Resource
	private SiliconExpertDAO siliconExpertDAO;
	
	@Override
	public void process(SiliconExpert siliconExpert, Task task) {
		List<String> smallCategoryList = siliconExpert.getSmallCategoryList();
		

			
			for (String smallCategory : smallCategoryList) {
				siliconExpert.setSmallCategory(smallCategory);
				siliconExpertDAO.insert(siliconExpert);
			}
			

		
					
	}

}
