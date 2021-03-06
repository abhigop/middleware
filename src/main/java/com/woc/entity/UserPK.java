package com.woc.entity;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class UserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	private String phone;

	public UserPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserPK)) {
			return false;
		}
		UserPK castOther = (UserPK)other;
		return 
			(this.id == castOther.id)
			&& this.phone.equals(castOther.phone);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.phone.hashCode();
		
		return hash;
	}
}