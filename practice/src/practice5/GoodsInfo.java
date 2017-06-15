package practice5;

public class GoodsInfo {
	
	private String Goods;
	private int clickCnt;
	private int price;
	
	public GoodsInfo(String Goods, int clickCnt, int price) {
		this.Goods = Goods;
		this.clickCnt = clickCnt;
		this.price = price;
	}

	public String getGoods() {
		return Goods;
	}

	public void setGoods(String goods) {
		Goods = goods;
	}

	public int getClickCnt() {
		return clickCnt;
	}

	public void setClickCnt(int clickCnt) {
		this.clickCnt = clickCnt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
