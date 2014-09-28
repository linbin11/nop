package bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.Resource;

public class LoaclConfig extends PropertyPlaceholderConfigurer{

	public LoaclConfig() {
	}
	
	public void setMaps(Map<Object, Object> map)
	{
		for (Iterator<Entry<Object, Object>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Object, Object> entry = iterator.next();
			String key = entry.getKey().toString();
			if (System.getProperty(key)!=null) {
				entry.setValue(System.getProperty(key));
			}
		}
		Properties pp = new Properties();
		pp.putAll(map);
		setProperties(pp);
	}
	
	@Override
	public void setLocations(Resource[] locations) {
		
	}
	

}
