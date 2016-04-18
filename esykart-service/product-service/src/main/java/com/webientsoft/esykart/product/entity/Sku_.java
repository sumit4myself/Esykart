package com.webientsoft.esykart.product.entity;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.webientsoft.esykart.common.model.Status;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sku.class)
public abstract class Sku_ {

	public static volatile SingularAttribute<Sku, Timestamp> activeStartDate;
	public static volatile SingularAttribute<Sku, Integer> quantityAvailable;
	public static volatile ListAttribute<Sku, SkuAvailability> skuAvailabilities;
	public static volatile SingularAttribute<Sku, String> isDiscountable;
	public static volatile SingularAttribute<Sku, Float> salePrice;
	public static volatile SingularAttribute<Sku, ProductDetail> productDetail;
	public static volatile SingularAttribute<Sku, String> availableFlag;
	public static volatile SingularAttribute<Sku, String> uuid;
	public static volatile SingularAttribute<Sku, Integer> merchantId;
	public static volatile SingularAttribute<Sku, Integer> id;
	public static volatile SingularAttribute<Sku, Timestamp> activeEndDate;
	public static volatile SingularAttribute<Sku, Float> retailPrice;
	public static volatile SingularAttribute<Sku, Status> status;

}

