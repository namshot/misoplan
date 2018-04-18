package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ReplyBoardScheduleDao {

	private static ReplyBoardScheduleDao instance;

	private ReplyBoardScheduleDao() {
	}

	public static ReplyBoardScheduleDao getInstance() {
		if (instance == null) {
			instance = new ReplyBoardScheduleDao();
		}

		return instance;
	}

	private Connection getConnection() {
		Connection conn = null;

		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx
					.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}
	
	public int insertReply(ReplyBoardScheduleDto dto) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO REPLYBOARDSCHEDULE VALUES(RBS_NUM_SEQ.NEXTVAL, ?, ?, ?, ?, SYSDATE, ?)";
		int result = 0;
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getBs_num());
			ps.setString(2, dto.getEmail());
			ps.setString(3, dto.getNickname());
			ps.setString(4, dto.getReply_content());
			ps.setString(5, dto.getProfile_url());
			result = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		}
		
		return result;
	}
	
}
