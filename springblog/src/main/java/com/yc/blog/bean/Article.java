package com.yc.blog.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Article implements Serializable {
	//文章分类对象
	private Category category;
	
	
    public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

	private List<Comment> comments;
		

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	private Integer id;

    private String author;

    private String title;

    private String keywords;

    private String description;

    private Integer categoryid;

    private String label;

    private String titleimgs;

    private String status;

    private Date createtime;

    private Integer readcnt;

    private Integer agreecnt;

    private Integer commcnt;

    private String content;
    
    

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getTitleimgs() {
        return titleimgs;
    }

    public void setTitleimgs(String titleimgs) {
        this.titleimgs = titleimgs == null ? null : titleimgs.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getReadcnt() {
        return readcnt;
    }

    public void setReadcnt(Integer readcnt) {
        this.readcnt = readcnt;
    }

    public Integer getAgreecnt() {
        return agreecnt;
    }

    public void setAgreecnt(Integer agreecnt) {
        this.agreecnt = agreecnt;
    }

    public Integer getCommcnt() {
        return commcnt;
    }

    public void setCommcnt(Integer commcnt) {
        this.commcnt = commcnt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}