package Entity;

public class CategoryEntity {
	private int catId;
	private String catname;
	private int counts;
	
	public CategoryEntity() {
		super();
	}
	public CategoryEntity(int catId, String catname, int counts) {
		super();
		this.catId = catId;
		this.catname = catname;
		this.counts = counts;
	}
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	
}
