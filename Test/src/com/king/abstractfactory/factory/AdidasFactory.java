package com.king.abstractfactory.factory;

import com.king.abstractfactory.model.AdidasClothes;
import com.king.abstractfactory.model.AdidasShoes;
import com.king.abstractfactory.model.Clothes;
import com.king.abstractfactory.model.Shoes;

public class AdidasFactory implements LabourFactory{

    @Override
    public Shoes produceShoes() {
        System.out.println("Produce Adidas Shoes");
        return new AdidasShoes();
    }

    @Override
    public Clothes produceClothes() {
        System.out.println("Produce Adidas Clothes");
        return new AdidasClothes();
    }

}