package me.codz.drools.model;

/**
 * <p>Created with IDEA
 * <p>Author: dukang.liu
 * <p>Date: 2017/10/27
 * <p>Time: 17:55
 * <p>Version: 1.0
 */
public class User {
    private Integer id;
    private String name;
    private String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
