package com.xcjaas.mediation.entity;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Mediator {
    private int id;//调解员id
    private String name;//调解员姓名
    private String phone_num;//电话
    private String field;//擅长领域
    private String introduce;//个人简介
    private String organization;//所在机构
    private String sex;//性别
    private int mediating_count;//调解中案件
    private int prepare_mediate_count;//待受理案件
    private int success_mediated_count;//调解成功案件
    private int failed_ediated_count;//调解失败案件
    private int state;//启用/停用

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getMediating_count() {
        return mediating_count;
    }

    public void setMediating_count(int mediating_count) {
        this.mediating_count = mediating_count;
    }

    public int getPrepare_mediate_count() {
        return prepare_mediate_count;
    }

    public void setPrepare_mediate_count(int prepare_mediate_count) {
        this.prepare_mediate_count = prepare_mediate_count;
    }

    public int getSuccess_mediated_count() {
        return success_mediated_count;
    }

    public void setSuccess_mediated_count(int success_mediated_count) {
        this.success_mediated_count = success_mediated_count;
    }

    public int getFailed_ediated_count() {
        return failed_ediated_count;
    }

    public void setFailed_ediated_count(int failed_ediated_count) {
        this.failed_ediated_count = failed_ediated_count;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Mediator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", field='" + field + '\'' +
                ", introduce='" + introduce + '\'' +
                ", organization='" + organization + '\'' +
                ", sex='" + sex + '\'' +
                ", mediating_count=" + mediating_count +
                ", prepare_mediate_count=" + prepare_mediate_count +
                ", success_mediated_count=" + success_mediated_count +
                ", failed_ediated_count=" + failed_ediated_count +
                ", state=" + state +
                '}';
    }
}
