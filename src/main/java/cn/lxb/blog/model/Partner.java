package cn.lxb.blog.model;

import java.io.Serializable;
import java.util.Date;

public class Partner implements Serializable {
    /**
     * 主键编号
     */
    private Integer id;

    /**
     * 站点名
     */
    private String siteName;

    /**
     * 站点地址
     */
    private String siteUrl;

    /**
     * 站点描述  简单备注 
     */
    private String siteDesc;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建的时间戳
     */
    private Date createTime;

    /**
     * partner
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     * @return id 主键编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键编号
     * @param id 主键编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 站点名
     * @return site_name 站点名
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * 站点名
     * @param siteName 站点名
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * 站点地址
     * @return site_url 站点地址
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * 站点地址
     * @param siteUrl 站点地址
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl == null ? null : siteUrl.trim();
    }

    /**
     * 站点描述  简单备注 
     * @return site_desc 站点描述  简单备注 
     */
    public String getSiteDesc() {
        return siteDesc;
    }

    /**
     * 站点描述  简单备注 
     * @param siteDesc 站点描述  简单备注 
     */
    public void setSiteDesc(String siteDesc) {
        this.siteDesc = siteDesc == null ? null : siteDesc.trim();
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 创建的时间戳
     * @return create_time 创建的时间戳
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建的时间戳
     * @param createTime 创建的时间戳
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}