package dao;

import java.sql.Date;

public class AccompanyBoardDto {
	
	private int post_num; //게시물 번호
	private String email;	//작성자 이메일
	private String nickname;  // 작성자 닉네임
	private String title;	//게시물 제목
	private String image_url; //대표 이미지 url
	private String content; //게시물 내용
	private String tag; //해시태그
	private int vote_count; //추천수
	private int view_count; //조회수
	private int minimum_num; //최소인원
	private int current_num; //현재인원
	private Date reg_date; //작성일
	private Date closing_date; //마감일
	private int is_closed; //마감 여부
	
<<<<<<< HEAD
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
=======
	
<<<<<<< HEAD
=======
	
>>>>>>> de2b761c1bbc24a8a1036d85b0fed8a5a4264407
	public int getMinimum_num() {
		return minimum_num;
	}
	public void setMinimum_num(int minimum_num) {
		this.minimum_num = minimum_num;
	}
	public int getCurrent_num() {
		return current_num;
	}
	public void setCurrent_num(int current_num) {
		this.current_num = current_num;
	}
>>>>>>> 0f3e9f40a2ac7baeb13ff4ca5843c2097336f59a
	public int getPost_num() {
		return post_num;
	}
	public void setPost_num(int post_num) {
		this.post_num = post_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getVote_count() {
		return vote_count;
	}
	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getClosing_date() {
		return closing_date;
	}
	public void setClosing_date(Date closing_date) {
		this.closing_date = closing_date;
	}
	public int getIs_closed() {
		return is_closed;
	}
	public void setIs_closed(int is_closed) {
		this.is_closed = is_closed;
	}

}
