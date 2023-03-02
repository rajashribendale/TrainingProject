package com.admin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.FileDataTrack;
import com.util.HibernateUtil;

public class MainApp {
	
	public static void main(String[] args) throws IOException {
	
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Path path = Paths.get("D:\\ABC.txt");
		byte[] btype= Files.readAllBytes(path);
		
		Date date = new Date(System.currentTimeMillis());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:sss");
		String uploadDate = simpleDateFormat.format(date);
		
		
		FileDataTrack fileDataTrack = new FileDataTrack();
		fileDataTrack.setFname(path.toAbsolutePath().toString());
		fileDataTrack.setFdata(btype);
		fileDataTrack.setUploadDate(uploadDate);
		
		//LocalDateTime Api used
		LocalDateTime localDateTime = LocalDateTime.now();
		fileDataTrack.setUpdatedDate(localDateTime);
		
		session.save(fileDataTrack);
		session.beginTransaction().commit();
		
		System.out.println("Done");
		
	}

}
