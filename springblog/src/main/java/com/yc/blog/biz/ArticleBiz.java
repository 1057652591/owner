package com.yc.blog.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.yc.blog.bean.Article;
import com.yc.blog.bean.ArticleExample;
import com.yc.blog.dao.ArticleMapper;
@Service
public class ArticleBiz {
	
	@Autowired
	private ArticleMapper am;
	
	
	/**
	 *
	 */	
	public List<Article> queryNewArticle(int page){
		ArticleExample example = new ArticleExample();
		example.setOrderByClause("createTime desc");
		PageHelper.startPage(page,5);
		return am.selectByExampleWithBLOBs(example);
	}
	
	public List<Article> querByCategory(int id,int page){
		ArticleExample example = new ArticleExample();
		example.createCriteria().andCategoryidEqualTo(id);
		example.setOrderByClause("createTime desc");
		PageHelper.startPage(page,5);
		return am.selectByExampleWithBLOBs(example);
	}
	
}
