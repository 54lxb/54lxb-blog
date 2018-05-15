package cn.lxb.blog.model;

import java.io.Serializable;

public class Category implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 父分类ID，没有则为0
     */
    private Integer pid;

    /**
     * 分类名称  唯一
     */
    private String categoryName;

    /**
     * 别名,唯一,比如新闻,就用News代替,栏目Id不显示在url中
     */
    private String aliasName;

    /**
     * 排序 （0-10）
     */
    private Integer sort;

    /**
     * category
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 父分类ID，没有则为0
     * @return pid 父分类ID，没有则为0
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 父分类ID，没有则为0
     * @param pid 父分类ID，没有则为0
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 分类名称  唯一
     * @return category_name 分类名称  唯一
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 分类名称  唯一
     * @param categoryName 分类名称  唯一
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 别名,唯一,比如新闻,就用News代替,栏目Id不显示在url中
     * @return alias_name 别名,唯一,比如新闻,就用News代替,栏目Id不显示在url中
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * 别名,唯一,比如新闻,就用News代替,栏目Id不显示在url中
     * @param aliasName 别名,唯一,比如新闻,就用News代替,栏目Id不显示在url中
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    /**
     * 排序 （0-10）
     * @return sort 排序 （0-10）
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序 （0-10）
     * @param sort 排序 （0-10）
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}