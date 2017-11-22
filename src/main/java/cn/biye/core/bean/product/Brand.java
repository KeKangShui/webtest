package cn.biye.core.bean.product;

import cn.biye.core.web.Constants;

//品牌
public class Brand {

    private Integer id;
    private String name;
    private String description;
    private String imgUrl;
    private String webSite;
    private Integer sort;
    private Integer isDisplay;



    //获取全路径
    public String getAllUrl(){
        return Constants.IMAGE_URL + imgUrl;
    }

    // 页号
    private Integer pageNo = 1;

    // 开始行
    private Integer startRow;

    // 每页数
    private Integer pageSize = 10;

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.startRow = (pageNo - 1) * pageSize;
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.startRow = (pageNo - 1) * pageSize;

        this.pageNo = pageNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    @Override
    public String toString() {
        return "Brand [id=" + id + ", name=" + name + ", description="
                + description + ", imgUrl=" + imgUrl + ", webSite=" + webSite
                + ", sort=" + sort + ", isDisplay=" + isDisplay + "]";
    }

}
