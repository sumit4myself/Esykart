package com.webientsoft.esykart.product.entity;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SkuAvailability.class)
public abstract class SkuAvailability_ {

	public static volatile SingularAttribute<SkuAvailability, Long> locationId;
	public static volatile SingularAttribute<SkuAvailability, Timestamp> availabilityDate;
	public static volatile SingularAttribute<SkuAvailability, Integer> qtyOnHand;
	public static volatile SingularAttribute<SkuAvailability, Integer> id;
	public static volatile SingularAttribute<SkuAvailability, String> availabilityStatus;
	public static volatile SingularAttribute<SkuAvailability, Sku> sku;
	public static volatile SingularAttribute<SkuAvailability, Integer> reserveQty;

}

