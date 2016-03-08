package com.webientsoft.esykart.common.model.common;

import java.io.Serializable;
import java.util.Map;


public class FilterModel implements Serializable {

  private static final long serialVersionUID = 8884763577640735245L;
  
  private Integer limit;
  private Integer offset;

  private String sort;
  private String direction;

  private Map<String,String> filter;

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public Map<String, String> getFilter() {
    return filter;
  }

  public void setFilter(Map<String, String> filter) {
    this.filter = filter;
  }
  
}
