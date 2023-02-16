package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
@Entity
@DynamicUpdate
public class AdharDetails {
	@Override
	public String toString() {
		return "AdharDetails [aid=" + aid + ", ano=" + ano + "]";
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public long getAno() {
		return ano;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private long ano;

}
