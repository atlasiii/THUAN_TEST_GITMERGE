package com.gunosy.android.model.repository;

import com.gunosy.android.model.repository.dao.ArticleRepository;

public class ActionRepositoryd {

	// --------fields----------------------//

	private Action action;
	private ArticleRepository article;

	//-------getter, setter----------------//
	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	

	public ArticleRepository getArticle() {
		return article;
	}

	public void setArticle(ArticleRepository article) {
		this.article = article;
	}



	// -------class action----------//
	public class Action {
		
		//---------fields------------------//
		private int action_type;

		private Long article_id;
		private String body;
		private String count;
		private String created_at;
		private Long id;
		private String updated_at;
		private Long user_id;

		//-------getter, setter----------------//
		public int getAction_type() {
			return action_type;
		}

		public void setAction_type(int action_type) {
			this.action_type = action_type;
		}

		public Long getArticle_id() {
			return article_id;
		}

		public void setArticle_id(Long article_id) {
			this.article_id = article_id;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getCount() {
			return count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		public String getCreated_at() {
			return created_at;
		}

		public void setCreated_at(String created_at) {
			this.created_at = created_at;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUpdated_at() {
			return updated_at;
		}

		public void setUpdated_at(String updated_at) {
			this.updated_at = updated_at;
		}

		public Long getUser_id() {
			return user_id;
		}

		public void setUser_id(Long user_id) {
			this.user_id = user_id;
		}
	}

}
