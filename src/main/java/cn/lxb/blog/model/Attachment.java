package cn.lxb.blog.model;

import java.io.Serializable;
import java.util.Date;

public class Attachment implements Serializable {
    /**
     * 主键编号
     */
    private Integer id;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件类型：1.图片 2.文件
     */
    private String fileType;

    /**
     * 创建人的id
     */
    private Integer authorId;

    /**
     * 创建的时间戳
     */
    private Date createTime;

    /**
     * 文件的地址
     */
    private String fileKey;

    /**
     * attachment
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
     * 文件名称
     * @return file_name 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 文件名称
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 文件类型：1.图片 2.文件
     * @return file_type 文件类型：1.图片 2.文件
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 文件类型：1.图片 2.文件
     * @param fileType 文件类型：1.图片 2.文件
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * 创建人的id
     * @return author_id 创建人的id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 创建人的id
     * @param authorId 创建人的id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
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

    /**
     * 文件的地址
     * @return file_key 文件的地址
     */
    public String getFileKey() {
        return fileKey;
    }

    /**
     * 文件的地址
     * @param fileKey 文件的地址
     */
    public void setFileKey(String fileKey) {
        this.fileKey = fileKey == null ? null : fileKey.trim();
    }
}