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

		solarSystem.put("�¾�", 109.0);
		solarSystem.put("����", 0.4);
		solarSystem.put("�ݼ�", 0.9);
		solarSystem.put("����", 1.0);
		solarSystem.put("ȭ��", 0.5);
		solarSystem.put("��", 11.2);
		solarSystem.put("�伺", 9.4);
		solarSystem.put("õ�ռ�", 4.0);
		solarSystem.put("�ؿռ�", 3.9);

		double earthR = solarSystem.get("����");

		for (String key : solarSystem.keySet()) {
			double data = solarSystem.get(key);
			if (earthR < data) {
				System.out.println("�༺: " + key + ", ������ : " + data);
			}
		}

		double min = 9999;
		String planet = null;

		for (String key : solarSystem.keySet()) {
			double data = solarSystem.get(key);
			if (!key.equals("����")) {
				double cal = Math.abs(earthR - data);
				if (cal < min) {
					planet = key;
					min = cal;
				}
			}
		}
		System.out.println("ũ�Ⱑ ������ ���� ����� �༺�� �̸� : " + planet + ", ������ : " + solarSystem.get(planet));

	}

	public static void exam02() {
		HashMap<Integer, String> mart = new HashMap<Integer, String>();

		mart.put(1000, "����");
		mart.put(2000, "�츮����");
		mart.put(1500, "��������");
		mart.put(800, "������");
		mart.put(1200, "����");
		mart.put(900, "������Ʈ");
		mart.put(2000, "���踶Ʈ");

		// (a) ������ �̸��� �ݶ� �ǸŰ��� ���
		for (Integer key : mart.keySet()) {
			System.out.println("������ �̸� : " + mart.get(key) + ", �ݶ󰡰� : " + key);
		}
		// (b) �ݶ� ���� ��ΰ��Ĵ� ������ �̸��� ���������
		int maxPrice = 0;
		for (Integer key : mart.keySet()) {
			if (maxPrice < key) {
				maxPrice = key;
			}
		}
		System.out.println("�ݶ� ���� ��ΰ� �Ĵ� ������ �̸� : " + mart.get(maxPrice) + ", �ݶ󰡰� : " + maxPrice);

		int minPrice = maxPrice;
		for (Integer key : mart.keySet()) {
			if (key < minPrice) {
				minPrice = key;
			}
		}
		System.out.println("�ݶ� ���� �ΰ� �Ĵ� ������ �̸� : " + mart.get(minPrice) + ", �ݶ󰡰� : " + minPrice);

	}

	public static void exam03() {

		GoodsInfo[] info = new GoodsInfo[] { new GoodsInfo("���� �ƺ�", 22, 130), new GoodsInfo("�Ｚ��Ʈ��", 89, 89),
				new GoodsInfo("LG��Ʈ��", 45, 99), new GoodsInfo("���ùٳ�Ʈ��", 12, 129), new GoodsInfo("�Ҵϳ�Ʈ", 56, 88) };
		
		print(info);
		popularGoods(info);
		minPriceGoods(info);
	}
	
	public static void print(GoodsInfo[] info) {
		
		System.out.println("�˻���\tŬ��Ƚ��\t����(����)");
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
		System.out.println("Ŭ�� Ƚ���� �������� ���� �α��ִ� ��ǰ ���� : " + goods.getGoods() + " " + goods.getClickCnt() + " " + goods.getPrice());
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
		System.out.println("������ ��ǰ ���� : " + goods.getGoods() + " " + goods.getClickCnt() + " " + goods.getPrice());
	}

}
