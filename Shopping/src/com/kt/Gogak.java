package com.kt;

import com.kt.entity.Computer;
import com.kt.entity.Product;
import com.kt.entity.Refrigerator;
import com.kt.entity.TV;

public class Gogak implements IGogak{
	int money;
	private Product[] basket = new Product[5];
	private int count;
	public Gogak(int money) {
		this.money=money;
	}
	
	public void addProduct(Product product) {
		if(money<product.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		
		// 바구니가 꽉 찬 경우
		if (basket.length<=count) {
			Product[] newBasket = new Product[basket.length*2];
			System.arraycopy(basket, 0, newBasket, 0, basket.length);
			basket = newBasket;
		}
		
		basket[count++]=product;
		money-= product.getPrice();
		
		System.out.println(product.getName()+" 제품을 구매했습니다. 잔액 : "+money+"원");
		
	}
	
	public void printBasket() {
		// 구매 목록과 잔액을 출력
		// Computer : 1대
		// TV : 2개
		// 잔액 : 5000원
		
		int tvCount=0;
		int comCount=0;
		int refCount=0;
		int wallet=money;
		
		for (int i=0; i<count; i++)
		{
			if (basket[i] instanceof TV) {
				tvCount++;
				
//				wallet-= basket[i].getPrice();
			}
			
			else if (basket[i] instanceof Computer) {
				comCount++;
				
//				wallet-= basket[i].getPrice();
			}
			
			else if (basket[i] instanceof Refrigerator) {
				refCount++;
				
//				wallet-= basket[i].getPrice();
			}
		}
		System.out.println("[구매내역 및 잔액]");
		if(comCount>0) System.out.println("Computer : "+comCount+"개");
		if(tvCount>0) System.out.println("TV : "+tvCount+"개");
		if(refCount>0) System.out.println("Refrigerator : "+refCount+"개");
		
//		System.out.println("사용금액 : 5000원\n" );
		System.out.println("잔액 : "+money+"원");
		
	}
	
	public void saleProductList(Product[] proList) {
		 System.out.println();
		 System.out.println("[제품목록 및 가격]");
		 for(int i=0; i<proList.length; i++) {
			 System.out.println(proList[i].getName()+"\t"+proList[i].getPrice()+"원");
		 }
		 System.out.println("-------------------------");
		 System.out.println("잔액 : "+money+"원");
		 System.out.println("-------------------------");
		 System.out.println();
	}

}
