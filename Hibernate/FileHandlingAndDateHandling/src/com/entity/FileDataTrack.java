package com.entity;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FileDataTrack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fname;
	
	@Lob
	private byte[] fdata;

	private String uploadDate;
	
	private LocalDateTime updatedDate;
	
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public byte[] getFdata() {
		return fdata;
	}

	public void setFdata(byte[] fdata) {
		this.fdata = fdata;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

	@Override
	public String toString() {
		return "FileDataTrack [id=" + id + ", fname=" + fname + ", fdata=" + Arrays.toString(fdata) + ", uploadDate="
				+ uploadDate + ", updatedDate=" + updatedDate + "]";
	}
	
	
	
}