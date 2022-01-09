package com.nogul9x.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="publisher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherEntity extends BaseEntity implements Serializable  {
	private String name;
	private String location;
	private String des;
	private String image;
	@OneToMany(mappedBy = "publisher")
	private List<BookEntity> books= new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public List<BookEntity> getBooks() {
		return books;
	}
	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}
	public PublisherEntity(long id, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate,
			String name, String location, String des) {
		super(id, createdBy, createdDate, modifiedBy, modifiedDate);
		this.name = name;
		this.location = location;
		this.des = des;

	}
	
}
