package com.Util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.entity.Student;

public class hibernateUtil {
	
	private static StandardServiceRegistry registry=null;
	private static SessionFactory sf=null;
	public static SessionFactory getsFactory() {
		
		if(sf==null) {
			Map<String , Object>map=new HashMap<String,Object>();
			map.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			map.put(Environment.URL, "jdbc:mysql://localhost:3306/SecondLevelCacheExample");
			map.put(Environment.USER, "root");
			map.put(Environment.PASS, "root");
			map.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
			map.put(Environment.HBM2DDL_AUTO, "update");
			map.put(Environment.SHOW_SQL, true);
			
			
			// for second level cache
			map.put(Environment.USE_SECOND_LEVEL_CACHE, true);
			map.put(Environment.CACHE_REGION_FACTORY, "org.hibernate.cache.ehcache.internal.EhcacheRegionFactory");
			
			registry=new StandardServiceRegistryBuilder().applySettings(map).build();
			MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(Student.class);
			Metadata md=mds.getMetadataBuilder().build();
			sf=md.getSessionFactoryBuilder().build();
			
		
			
		}
		return sf;
		
	}

}
