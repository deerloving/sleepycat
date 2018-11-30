package com.king.abstractfactory.client;

import com.king.abstractfactory.XMLUtil;
import com.king.abstractfactory.factory.LabourFactory;
import com.king.abstractfactory.model.Clothes;
import com.king.abstractfactory.model.Shoes;

public class Client {
	
	public static void main(String[] args) {
		try{
            LabourFactory lFactory;
            Shoes shoes;
            Clothes clothes;
            lFactory = (LabourFactory) XMLUtil.getBean();
            shoes = lFactory.produceShoes();
            clothes = lFactory.produceClothes();
            shoes.wear();
            clothes.wear();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

}
