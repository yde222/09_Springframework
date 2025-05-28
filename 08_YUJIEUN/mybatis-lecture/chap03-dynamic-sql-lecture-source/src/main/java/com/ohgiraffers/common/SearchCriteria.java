package com.ohgiraffers.common;

public class SearchCriteria {
    private String condition;
    private String value;

    public SearchCriteria() {
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SearchCriteria(String condition, String value) {
        this.condition = condition;
        this.value = value;
    }
}
