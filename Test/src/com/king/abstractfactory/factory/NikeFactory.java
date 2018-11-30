package com.king.abstractfactory.factory;

import com.king.abstractfactory.model.Clothes;
import com.king.abstractfactory.model.NikeClothes;
import com.king.abstractfactory.model.NikeShoes;
import com.king.abstractfactory.model.Shoes;

public class NikeFactory implements LabourFactory{

    @Override
    public Shoes produceShoes() {
        System.out.println("Produce Nike Shoes");
        return new NikeShoes();
    }

    @Override
    public Clothes produceClothes() {
        System.out.println("Produce Nike Clothes");
        return new NikeClothes();
    }

}