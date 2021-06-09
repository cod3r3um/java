package co.friend.access;
// FriendAccess.java, FriendList.java

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import co.friend.model.Friend;
import co.friend.util.DAO;

public class FriendDAO extends DAO implements FriendAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	// name, tel 값을 담아주는 컬렉션
	public Map<String, String> getNameTel() {
		Map<String, String> friends = new HashMap<>();
		try {
			psmt = conn.prepareStatement("select name, tel from friend");
			rs = psmt.executeQuery();
			while(rs.next()) {
				friends.put(rs.getString("name"), rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return friends;
	}

	@Override
	public void insert(Friend friend) {
		try {
			psmt = conn.prepareStatement("insert into friend values (?, ? ,?)");
			psmt.setString(1, friend.getSort());
			psmt.setString(2, friend.getName());
			psmt.setString(3, friend.getTel());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Friend friend) {
		try {
			psmt = conn.prepareStatement("update friend set tel = ? where name = ?");
			psmt.setString(1, friend.getTel());
			psmt.setString(2, friend.getName());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(String name) {
		try {
			psmt = conn.prepareStatement("delete from friend where name = ?");
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<Friend> selectAll() {
		ArrayList<Friend> fList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from friend");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Friend friend = new Friend();
				friend.setSort(rs.getString("sort"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
				fList.add(friend); // 데이터 건 수 만큼 ArrayList에 담아서 반환
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fList;
	}

	@Override
	public Friend selectOne(String name) {
		Friend friend = new Friend();
		try {
			psmt = conn.prepareStatement("select * from friend where name = ?");
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if (rs.next()) {
				friend.setSort(rs.getString("sort"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		return friend;
	}

	@Override
	public Friend findTel(String tel) {
		Friend friend = new Friend();
		try {
			psmt = conn.prepareStatement("select * from friend where tel = ?");
			psmt.setString(1, tel);
			rs = psmt.executeQuery();
			if (rs.next()) {
				friend.setSort(rs.getString("sort"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		return friend;
	}

}
