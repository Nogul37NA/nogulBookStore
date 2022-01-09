package com.nogul9x.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class StatisFavorite {
	@Id
	private Serializable group;
	private Long count;
	public Serializable getGroup() {
		return group;
	}
	public void setGroup(Serializable group) {
		this.group = group;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
}
