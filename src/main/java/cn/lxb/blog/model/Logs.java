package cn.lxb.blog.model;

import java.io.Serializable;
import java.util.Date;

public class Logs implements Serializable {
    /**
     * 主键编号
     */
    private Integer id;

    /**
     * 事件
     */
    private String action;

    /**
     * 数据
     */
    private String datas;

    /**
     * 操作者编号
     */
    private Integer authorId;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 操作时间戳
     */
    private Date createTime;

    /**
     * logs
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
     * 事件
     * @return action 事件
     */
    public String getAction() {
        return action;
    }

    /**
     * 事件
     * @param action 事件
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * 数据
     * @return datas 数据
     */
    public String getDatas() {
        return datas;
    }

    /**
     * 数据
     * @param datas 数据
     */
    public void setDatas(String datas) {
        this.datas = datas == null ? null : datas.trim();
    }

    /**
     * 操作者编号
     * @return author_id 操作者编号
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 操作者编号
     * @param authorId 操作者编号
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * ip地址
     * @return ip ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * ip地址
     * @param ip ip地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 操作时间戳
     * @return create_time 操作时间戳
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 操作时间戳
     * @param createTime 操作时间戳
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}