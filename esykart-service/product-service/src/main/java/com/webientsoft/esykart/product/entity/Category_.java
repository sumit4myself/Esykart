package com.webientsoft.esykart.product.entity;

import com.webientsoft.esykart.common.model.Status;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile SingularAttribute<Category, Integer> iconId;
	public static volatile SingularAttribute<Category, String> template;
	public static volatile SingularAttribute<Category, Date> activeStartDate;
	public static volatile SingularAttribute<Category, InventoryType> inventoryType;
	public static volatile SingularAttribute<Category, Integer> bannerId;
	public static volatile ListAttribute<Category, CategoryAttribute> categoryAttributes;
	public static volatile SingularAttribute<Category, String> description;
	public static volatile SingularAttribute<Category, Boolean> isTaxable;
	public static volatile SingularAttribute<Category, FulfillmentType> fulfillmentType;
	public static volatile SingularAttribute<Category, String> url;
	public static volatile ListAttribute<Category, Product> products;
	public static volatile SingularAttribute<Category, String> name;
	public static volatile SingularAttribute<Category, Category> parentCategory;
	public static volatile SingularAttribute<Category, Integer> id;
	public static volatile ListAttribute<Category, Category> categories;
	public static volatile SingularAttribute<Category, Date> activeEndDate;
	public static volatile SingularAttribute<Category, Integer> taxDetailId;
	public static volatile SingularAttribute<Category, Status> status;

}

