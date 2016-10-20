package us.codecraft.jobhunter.dao;

import org.apache.ibatis.annotations.Insert;

import us.codecraft.jobhunter.model.SiliconExpert;

public interface SiliconExpertDAO {
	
	
	@Insert("insert into SiliconExpert (`bigCategory`,`smallCategory`) values (#{bigCategory},#{smallCategory})")
	public void insert(SiliconExpert siliconExpert);

}
