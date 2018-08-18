package com.entity;

import java.util.HashSet;
import java.util.Set;

public class Clazz {
    private Integer cid;
    private String cname;
    private Set<Student> studen=new HashSet();

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", studen=" + studen +
                '}';
    }

    public Set<Student> getStuden() {
        return studen;
    }

    public void setStuden(Set<Student> studen) {
        this.studen = studen;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
