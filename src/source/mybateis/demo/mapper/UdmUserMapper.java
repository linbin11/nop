package source.mybateis.demo.mapper;

import java.util.List;

import source.mybateis.demo.pojo.UdmUserPojo;

public interface UdmUserMapper {
	
	public Integer insertUdmUser(UdmUserPojo pojo);
	
	public List<UdmUserPojo> findUdmUserPojos();

}
