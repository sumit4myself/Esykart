
package com.webientsoft.esykart.common.model.store;

import java.util.List;

public class BannerItemModel {

	private Integer id;
	private String title;
	private String desc;
	private String actionUrl;
	private String imageUrl;
	private List<String> bannerPageImages;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getActionUrl() {
		return actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<String> getBannerPageImages() {
		return bannerPageImages;
	}

	public void setBannerPageImages(List<String> bannerPageImages) {
		this.bannerPageImages = bannerPageImages;
	}

}
