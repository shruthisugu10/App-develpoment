package com.creativefusion.suruthiga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="_hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String hotel_name;
	private String location;
	private String address;
	private int rating;

}
