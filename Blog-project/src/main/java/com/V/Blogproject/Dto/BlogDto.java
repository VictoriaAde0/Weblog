package com.V.Blogproject.Dto;

import java.util.Date;

public class BlogDto {

    private long id;
    private String title;
    private String content;
    private Date datecreated;
    private Date dateupdated;

    public BlogDto() {
    }

    public BlogDto(long id, String title, String content, Date datecreated) {
        this.title = title;
        this.content = content;
        this.datecreated = datecreated;
        this.dateupdated = dateupdated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDateupdated() {
        return dateupdated;
    }
    public void setDateupdated(Date dateupdated) {
        this.dateupdated = dateupdated;
    }

        @Override
        public String toString () {
            return "BlogDto{" +
                    ", title= '" + title + '\'' +
                    ", content= '" + content + '\'' +
                    ", datecreated= '" + datecreated + '\'' +
                    ", dateupdated= '" + dateupdated + '\'' +
                    '}';
        }
    }
