package practice5;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exam01();
		//exam02();
		exam03();
	}

	public static void exam01() {
		HashMap<String, Double> solarSystem = new HashMap<String, Double>();

		solarSystem.put("태양", 109.0);
		solarSystem.put("수성", 0.4);
		solarSystem.put("금성", 0.9);
		solarSystem.put("지구", 1.0);
		solarSystem.put("화성", 0.5);
		solarSystem.put("목성", 11.2);
		solarSystem.put("토성", 9.4);
		solarSystem.put("천왕성", 4.0);
		solarSystem.put("해왕성", 3.9);

		double earthR = solarSystem.get("지구");

		for (String key : solarSystem.keySet()) {
			double data = solarSystem.get(key);
			if (earthR < data) {
				System.out.println("행성: " + key + ", 반지름 : " + data);
			}
		}

		double min = 9999;
		String planet = null;

		for (String key : solarSystem.keySet()) {
			double data = solarSystem.get(key);
			if (!key.equals("지구")) {
				double cal = Math.abs(earthR - data);
				if (cal < min) {
					planet = key;
					min = cal;
				}
			}
		}
		System.out.println("크기가 지구와 가장 비슷한 행성의 이름 : " + planet + ", 반지름 : " + solarSystem.get(planet));

	}

	public static void exam02() {
		HashMap<Integer, String> mart = new HashMap<Integer, String>();

		mart.put(1000, "골목길");
		mart.put(2000, "우리동네");
		mart.put(1500, "아주조은");
		mart.put(800, "씨씨유");
		mart.put(1200, "월드");
		mart.put(900, "대전마트");
		mart.put(2000, "세계마트");

		// (a) 편의점 이름과 콜라 판매가격 출력
		for (Integer key : mart.keySet()) {
			System.out.println("편의점 이름 : " + mart.get(key) + ", 콜라가격 : " + key);
		}
		// (b) 콜라를 가장 비싸게파는 편의점 이름과 가격을출력
		int maxPrice = 0;
		for (Integer key : mart.keySet()) {
			if (maxPrice < key) {
				maxPrice = key;
			}
		}
		System.out.println("콜라를 가장 비싸게 파는 편의점 이름 : " + mart.get(maxPrice) + ", 콜라가격 : " + maxPrice);

		int minPrice = maxPrice;
		for (Integer key : mart.keySet()) {
			if (key < minPrice) {
				minPrice = key;
			}
		}
		System.out.println("콜라를 가장 싸게 파는 편의점 이름 : " + mart.get(minPrice) + ", 콜라가격 : " + minPrice);

	}

	public static void exam03() {

		GoodsInfo[] info = new GoodsInfo[] { new GoodsInfo("애플 맥북", 22, 130), new GoodsInfo("삼성노트북", 89, 89),
				new GoodsInfo("LG노트북", 45, 99), new GoodsInfo("도시바노트북", 12, 129), new GoodsInfo("소니노트", 56, 88) };
		
		print(info);
		popularGoods(info);
		minPriceGoods(info);
	}
	
	public static void print(GoodsInfo[] info) {
		
		System.out.println("검색어\t클릭횟수\t가격(만원)");
		for(GoodsInfo i: info) {
			System.out.println(i.getGoods() + "   " + i.getClickCnt() + "      " + i.getPrice());
		}
		System.out.println();
	}
	
	public static void popularGoods(GoodsInfo[] info) {
		int maxClick = 0;
		GoodsInfo goods = null;
		
		for(GoodsInfo i: info) {
			if(maxClick < i.getClickCnt()) {
				maxClick = i.getClickCnt();
				goods = i;
			}
		}
		System.out.println("클릭 횟수를 기준으로 가장 인기있는 제품 정보 : " + goods.getGoods() + " " + goods.getClickCnt() + " " + goods.getPrice());
	}
	
	public static void minPriceGoods(GoodsInfo[] info) {
		int minPrice = 99999;
		GoodsInfo goods = null;
		
		for(GoodsInfo i: info) {
			if(minPrice > i.getPrice()) {
				minPrice = i.getPrice();
				goods = i;
			}
		}
		System.out.println("최저가 제품 정보 : " + goods.getGoods() + " " + goods.getClickCnt() + " " + goods.getPrice());
	}

}
