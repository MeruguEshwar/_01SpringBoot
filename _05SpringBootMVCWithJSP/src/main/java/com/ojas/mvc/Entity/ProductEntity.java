package com.ojas.mvc.Entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

	@Id
	@GenericGenerator(name="mygenerator",strategy="AutoIncrement")
	@GeneratedValue
	private int productId;
	private String productName;
	private double productPrice;
	private double productQuantity;
}
