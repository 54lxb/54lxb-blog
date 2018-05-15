package cn.lxb.blog.model;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    /**
     * 主键编号
     */
    private Integer id;

    /**
     * 分类Id
     */
    private Integer categoryId;

    /**
     * 标题
     */
    private String title;

    /**
     * 标签
     */
    private String tags;

    /**
     * 文章简介  用于列表显示
     */
    private String description;

    /**
     * 状态 1：正常  2：草稿 3.删除
     */
    private Integer state;

    /**
     * 浏览量
     */
    private Integer showCount;

    /**
     * 评论数
     */
    private Integer commentsNum;

    /**
     * 博客类型：1 原创 2 转载
     */
    private Integer blogType;

    /**
     * 是否允许评论：0 不可以 1 可以 
     */
    private Byte allowComment;

    /**
     * 是否允许ping：0 不可以 1 可以 
     */
    private Byte allowPing;

    /**
     * 允许出现在聚合中：0 不可以 1 可以 
     */
    private Byte allowFeed;

    /**
     * 作者ID
     */
    private Integer authorId;

    /**
     * 发表时间戳
     */
    private Date createTime;

    /**
     * 更新时间戳
     */
    private Date updateTime;

    /**
     * 内容
     */
    private String content;

    /**
     * article
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
     * 分类Id
     * @return category_id 分类Id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 分类Id
     * @param categoryId 分类Id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 标签
     * @return tags 标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 标签
     * @param tags 标签
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * 文章简介  用于列表显示
     * @return description 文章简介  用于列表显示
     */
    public String getDescription() {
        return description;
    }

    /**
     * 文章简介  用于列表显示
     * @param description 文章简介  用于列表显示
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 状态 1：正常  2：草稿 3.删除
     * @return state 状态 1：正常  2：草稿 3.删除
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态 1：正常  2：草稿 3.删除
     * @param state 状态 1：正常  2：草稿 3.删除
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 浏览量
     * @return show_count 浏览量
     */
    public Integer getShowCount() {
        return showCount;
    }

    /**
     * 浏览量
     * @param showCount 浏览量
     */
    public void setShowCount(Integer showCount) {
        this.showCount = showCount;
    }

    /**
     * 评论数
     * @return comments_num 评论数
     */
    public Integer getCommentsNum() {
        return commentsNum;
    }

    /**
     * 评论数
     * @param commentsNum 评论数
     */
    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }

    /**
     * 博客类型：1 原创 2 转载
     * @return blog_type 博客类型：1 原创 2 转载
     */
    public Integer getBlogType() {
        return blogType;
    }

    /**
     * 博客类型：1 原创 2 转载
     * @param blogType 博客类型：1 原创 2 转载
     */
    public void setBlogType(Integer blogType) {
        this.blogType = blogType;
    }

    /**
     * 是否允许评论：0 不可以 1 可以 
     * @return allow_comment 是否允许评论：0 不可以 1 可以 
     */
    public Byte getAllowComment() {
        return allowComment;
    }

    /**
     * 是否允许评论：0 不可以 1 可以 
     * @param allowComment 是否允许评论：0 不可以 1 可以 
     */
    public void setAllowComment(Byte allowComment) {
        this.allowComment = allowComment;
    }

    /**
     * 是否允许ping：0 不可以 1 可以 
     * @return allow_ping 是否允许ping：0 不可以 1 可以 
     */
    public Byte getAllowPing() {
        return allowPing;
    }

    /**
     * 是否允许ping：0 不可以 1 可以 
     * @param allowPing 是否允许ping：0 不可以 1 可以 
     */
    public void setAllowPing(Byte allowPing) {
        this.allowPing = allowPing;
    }

    /**
     * 允许出现在聚合中：0 不可以 1 可以 
     * @return allow_feed 允许出现在聚合中：0 不可以 1 可以 
     */
    public Byte getAllowFeed() {
        return allowFeed;
    }

    /**
     * 允许出现在聚合中：0 不可以 1 可以 
     * @param allowFeed 允许出现在聚合中：0 不可以 1 可以 
     */
    public void setAllowFeed(Byte allowFeed) {
        this.allowFeed = allowFeed;
    }

    /**
     * 作者ID
     * @return author_id 作者ID
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 作者ID
     * @param authorId 作者ID
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 发表时间戳
     * @return create_time 发表时间戳
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 发表时间戳
     * @param createTime 发表时间戳
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间戳
     * @return update_time 更新时间戳
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间戳
     * @param updateTime 更新时间戳
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 内容
     * @return content 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}