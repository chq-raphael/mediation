package com.xcjaas.mediation.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */
public class MediatorsResult {
    private List<Mediator> mediators;
    private int pageNo;//当前页
    private int pageSize;//一页显示条数
    private int totalSize;//总条数
    private int pages;//总页数

    public List<Mediator> getMediators() {
        return mediators;
    }

    public void setMediators(List<Mediator> mediators) {
        this.mediators = mediators;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "MediatorsResult{" +
                "mediators=" + mediators +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", totalSize=" + totalSize +
                ", pages=" + pages +
                '}';
    }
}
