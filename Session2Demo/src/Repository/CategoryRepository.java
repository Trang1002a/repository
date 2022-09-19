package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.ConnectDB;
import Entity.CategoryEntity;

public class CategoryRepository implements IGenericRepository<CategoryEntity, Integer> {

	@Override
	public List<CategoryEntity> find() {
		List<CategoryEntity> list = new ArrayList<>();
		Connection conn = ConnectDB.openDB();
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Categories");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CategoryEntity cat = new CategoryEntity();
				cat.setCatId(rs.getInt("catId"));
				cat.setCatname(rs.getString("catname"));
				cat.setCounts(rs.getInt("counts"));
				list.add(cat);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public CategoryEntity findById(Integer id) {
		CategoryEntity cat = new CategoryEntity();
		Connection conn = ConnectDB.openDB();
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Categories WHERE catId = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				cat.setCatId(rs.getInt("catId"));
				cat.setCatname(rs.getString("catname"));
				cat.setCounts(rs.getInt("counts"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cat;
	}

	@Override
	public CategoryEntity add(CategoryEntity entity) {
		Connection conn = ConnectDB.openDB();
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Categories VALUES(?, ?, ?)");
			ps.setInt(1, entity.getCatId());
			ps.setString(2, entity.getCatname());
			ps.setInt(3, entity.getCounts());
			ps.executeUpdate();
			return entity;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CategoryEntity update(CategoryEntity entity) {
		Connection conn = ConnectDB.openDB();
		try {
			PreparedStatement ps = conn.prepareStatement("UPDATE Categories SET catname=?, counts=? WHERE catId=?");
			ps.setString(1, entity.getCatname());
			ps.setInt(2, entity.getCounts());
			ps.setInt(3, entity.getCatId());
			ps.executeUpdate();
			return entity;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean remove(Integer id) {
		Connection conn = ConnectDB.openDB();
		try {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM Categories WHERE catId = ?");
			ps.setInt(1, id);
			int rs = ps.executeUpdate();
			return rs > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
