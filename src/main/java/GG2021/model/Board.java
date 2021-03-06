package GG2021.model;

import java.util.Date;

public class Board {
	private int B_NUM;
	private String B_TITLE;
	private String B_CONTENT;
	private String B_IMG;
	private String B_VIEW;
	private int B_GOOD;
	private int B_BAD;
	private Date B_DATE;
	private String B_NOTICE1;
	private String M_ID;
	private String G_NAME;
	private String G_TYPE;
	
	private String GO_TYPE;
	private int page;
	
	private int startRow; 
	private int endRow;  
		
	private String search;
	private String keyword;
	
	public int getB_NUM() {
		return B_NUM;
	}
	public void setB_NUM(int b_NUM) {
		B_NUM = b_NUM;
	}
	public String getB_TITLE() {
		return B_TITLE;
	}
	public void setB_TITLE(String b_TITLE) {
		B_TITLE = b_TITLE;
	}
	public String getB_CONTENT() {
		return B_CONTENT;
	}
	public void setB_CONTENT(String b_CONTENT) {
		B_CONTENT = b_CONTENT;
	}
	public String getB_IMG() {
		return B_IMG;
	}
	public void setB_IMG(String b_IMG) {
		B_IMG = b_IMG;
	}
	public String getB_VIEW() {
		return B_VIEW;
	}
	public void setB_VIEW(String b_VIEW) {
		B_VIEW = b_VIEW;
	}
	public int getB_GOOD() {
		return B_GOOD;
	}
	public void setB_GOOD(int b_GOOD) {
		B_GOOD = b_GOOD;
	}
	public int getB_BAD() {
		return B_BAD;
	}
	public void setB_BAD(int b_BAD) {
		B_BAD = b_BAD;
	}
	public Date getB_DATE() {
		return B_DATE;
	}
	public void setB_DATE(Date b_DATE) {
		B_DATE = b_DATE;
	}
	public String getB_NOTICE1() {
		return B_NOTICE1;
	}
	public void setB_NOTICE1(String b_NOTICE1) {
		B_NOTICE1 = b_NOTICE1;
	}
	public String getM_ID() {
		return M_ID;
	}
	public void setM_ID(String m_ID) {
		M_ID = m_ID;
	}
	public String getG_NAME() {
		return G_NAME;
	}
	public void setG_NAME(String g_NAME) {
		G_NAME = g_NAME;
	}
	public String getG_TYPE() {
		return G_TYPE;
	}
	public void setG_TYPE(String g_TYPE) {
		G_TYPE = g_TYPE;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getGO_TYPE() {
		return GO_TYPE;
	}
	public void setGO_TYPE(String gO_TYPE) {
		GO_TYPE = gO_TYPE;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}	