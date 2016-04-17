package com.webientsoft.esykart.product.entity;

import com.webientsoft.esykart.common.model.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProductDetail.class)
public abstract class ProductDetail_ {

	public static volatile SingularAttribute<ProductDetail, String> longDescription;
	public static volatile SingularAttribute<ProductDetail, Product> product;
	public static volatile SingularAttribute<ProductDetail, Boolean> isDiscountable;
	public static volatile ListAttribute<ProductDetail, Sku> skus;
	public static volatile SingularAttribute<ProductDetail, Boolean> useProductMedia;
	public static volatile SingularAttribute<ProductDetail, Float> length;
	public static volatile ListAttribute<ProductDetail, ProductDetailAttributeValueMap> productDetailAttrValueMaps;
	public static volatile SingularAttribute<ProductDetail, String> description;
	public static volatile SingularAttribute<ProductDetail, Float> weight;
	public static volatile ListAttribute<ProductDetail, ProductDetailMediaMap> productDetailMediaMaps;
	public static volatile SingularAttribute<ProductDetail, String> weightUnitOfMeasure;
	public static volatile SingularAttribute<ProductDetail, Float> width;
	public static volatile SingularAttribute<ProductDetail, Integer> id;
	public static volatile SingularAttribute<ProductDetail, Boolean> isFeaturedProduct;
	public static volatile SingularAttribute<ProductDetail, String> dimensionUnitOfMeasure;
	public static volatile SingularAttribute<ProductDetail, Float> height;
	public static volatile SingularAttribute<ProductDetail, Status> status;

}

