package com.webientsoft.esykart.product.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, String> manufacture;
	public static volatile SingularAttribute<Product, InventoryType> inventoryType;
	public static volatile ListAttribute<Product, ProductMediaMap> productMediaMaps;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, Boolean> isTaxable;
	public static volatile SingularAttribute<Product, String> model;
	public static volatile ListAttribute<Product, ProductDetail> details;
	public static volatile SingularAttribute<Product, Integer> id;
	public static volatile SingularAttribute<Product, Category> category;
	public static volatile SingularAttribute<Product, FulfillmentType> fulfillmentType;
	public static volatile SingularAttribute<Product, Integer> taxDetailId;

}

