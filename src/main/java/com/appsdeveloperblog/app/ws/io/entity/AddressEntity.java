package com.appsdeveloperblog.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "ADDRESSES")
@Getter
@Setter
public class AddressEntity implements Serializable {

	private static final long serialVersionUID = 7809200551672852690L;

	@Id
	@GeneratedValue
	private long id;

	@Column(length = 30, nullable = false)
	private String addressId;

	@Column(length = 15, nullable = false)
	private String city;

	@Column(length = 15, nullable = false)
	private String country;

	@Column(length = 100, nullable = false)
	private String streetName;

	@Column(length = 7, nullable = false)
	private String postalCode;

	@Column(length = 10, nullable = false)
	private String type;

	@ManyToOne
	@JoinColumn(name = "users_id")
	private UserEntity userDetails;

}
