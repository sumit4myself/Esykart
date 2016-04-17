package com.webientsoft.esykart.product.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CategoryAttribute.class)
public abstract class CategoryAttribute_ {

	public static volatile SingularAttribute<CategoryAttribute, String> isRequired;
	public static volatile SingularAttribute<CategoryAttribute, AttributeDisplayType> attributeDisplayType;
	public static volatile SingularAttribute<CategoryAttribute, String> validationRule;
	public static volatile SingularAttribute<CategoryAttribute, String> validationType;
	public static volatile SingularAttribute<CategoryAttribute, Integer> displayOrder;
	public static volatile SingularAttribute<CategoryAttribute, String> label;
	public static volatile ListAttribute<CategoryAttribute, CategoryAttributeValue> categoryAttributeValues;
	public static volatile SingularAttribute<CategoryAttribute, String> validationErrorCode;
	public static volatile SingularAttribute<CategoryAttribute, AttributeType> attributeType;
	public static volatile SingularAttribute<CategoryAttribute, String> name;
	public static volatile SingularAttribute<CategoryAttribute, String> validationErrorMsg;
	public static volatile SingularAttribute<CategoryAttribute, Integer> id;
	public static volatile SingularAttribute<CategoryAttribute, String> isSearchable;
	public static volatile ListAttribute<CategoryAttribute, Category> categories;

}

