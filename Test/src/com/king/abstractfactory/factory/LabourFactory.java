package com.king.abstractfactory.factory;

import com.king.abstractfactory.model.Clothes;
import com.king.abstractfactory.model.Shoes;

public interface LabourFactory {
    Shoes produceShoes();
    Clothes produceClothes();
}