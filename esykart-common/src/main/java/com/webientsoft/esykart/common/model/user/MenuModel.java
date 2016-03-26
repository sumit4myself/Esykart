package com.webientsoft.esykart.common.model.user;

import java.util.List;

public class MenuModel {

    private Integer menuId;
    private String title;
    private String icon;
    private String link;
    private List<PrivilegeModel> privileges;
    private List<MenuModel> subMenu;
    
    
    
    public Integer getMenuId() {
        return menuId;
    }
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public List<MenuModel> getSubMenu() {
        return subMenu;
    }
    public void setSubMenu(List<MenuModel> subMenu) {
        this.subMenu = subMenu;
    }
    public List<PrivilegeModel> getPrivileges() {
        return privileges;
    }
    public void setPrivileges(List<PrivilegeModel> privileges) {
        this.privileges = privileges;
    }
}
