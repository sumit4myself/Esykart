package com.webientsoft.esykart.common.model.common;

import java.util.List;

public class PaginatedDataModel {

  private int totalCount;
  private int filteredCount;

  private List<?> dataList;

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  public int getFilteredCount() {
    return filteredCount;
  }

  public void setFilteredCount(int filteredCount) {
    this.filteredCount = filteredCount;
  }

  public List<?> getDataList() {
    return dataList;
  }

  public void setDataList(List<?> dataList) {
    this.dataList = dataList;
  }


}
