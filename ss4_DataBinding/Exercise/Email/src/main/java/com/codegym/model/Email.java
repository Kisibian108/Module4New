package com.codegym.model;

public class Email {

    private Integer id;
    private String language;
    private int pageSize;
    private Boolean spamFilter;
    private String signature;

    public Email() {
    }

    public Email(Integer id, String language, int pageSize, Boolean spamFilter, String signature) {
        this.id = id;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(Boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Email{" +
                "language='" + language + '\'' +
                ", pageSize=" + pageSize +
                ", spamFilter='" + spamFilter + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
