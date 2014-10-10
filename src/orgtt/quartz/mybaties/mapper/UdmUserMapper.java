package orgtt.quartz.mybaties.mapper;

import java.util.List;

import orgtt.quartz.mybaties.pojo.UdmUserPojo;

public interface UdmUserMapper {
	
	public Integer insertUdmUser(UdmUserPojo pojo);
	
	public List<UdmUserPojo> findUdmUserPojos();

}
