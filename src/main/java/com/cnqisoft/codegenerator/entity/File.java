package com.cnqisoft.codegenerator.entity;

import java.util.Date;

/**
 * @author Binary
 */
public class File {

    public File() {

    }

    private Integer id;

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    private String owner;

    private String path;

    private String suffix;

    private Integer parent;

    private String name;

    private String identity;

    private Date createTime;

    private Date updateTime;

    private Long length;

}
