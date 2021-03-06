package GG2021.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import GG2021.model.Board;
import GG2021.model.Comments;
import GG2021.model.Member;

@Repository
public class AdminDao {
	@Autowired
	private SqlSession session;
	
	public List<Member> getAdminMemberList(int page)	{
		return session.selectList("admin.getAdminMemberList", page);
	}
	public int getAdminMemberCount() {
		return session.selectOne("admin.getAdminMemberCount");
	}
	
	public int  adminDel(String id) {
		return session.delete("admin.adminDel", id);
	}
	
	public int getAdminBoardCount() {
		return session.selectOne("getAdminBoardCount");
	}
	
	public List<Board>getAdminBoardList(int page){
		return session.selectList("getAdminBoardList", page);
	}
	public int getAdminCommentsCount() {
		return session.selectOne("getAdminCommentsCount");
	}
	
	public List<Comments> getAdminCommentsList(int page) {
		return session.selectList("getAdminCommentsList", page);
	}
	
	public int insertLink(String link) {
		return session.update("insertLink", link);
	}
	
	public String getlink() {
		return session.selectOne("getlink");
	}
}
