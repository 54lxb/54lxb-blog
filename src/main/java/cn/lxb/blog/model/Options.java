package cn.lxb.blog.model;

import java.io.Serializable;

public class Options implements Serializable {
    /**
     * 配置名字
     */
    private String name;

    /**
     * 配置值
     */
    private String value;

    /**
     * 配置说明
     */
    private String description;

    /**
     * options
     */
    private static final long serialVersionUID = 1L;

    /**
     * 配置名字
     * @return name 配置名字
     */
    public String getName() {
        return name;
    }

    /**
     * 配置名字
     * @param name 配置名字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 配置值
     * @return value 配置值
     */
    public String getValue() {
        return value;
    }

    /**
     * 配置值
     * @param value 配置值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 配置说明
     * @return description 配置说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 配置说明
     * @param description 配置说明
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}