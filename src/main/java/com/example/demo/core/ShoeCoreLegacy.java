package com.example.demo.core;

import com.example.demo.dto.in.ShoeFilter;
import com.example.demo.dto.in.ShoeFilter.Color;
import com.example.demo.dto.out.Shoe;
import com.example.demo.dto.out.Shoes;
import com.example.demo.dto.out.updated.Stock;

import java.math.BigInteger;
import java.util.List;

@Implementation(version = 1)
public class ShoeCoreLegacy extends AbstractShoeCore {

  @Override
  public Shoes search(final ShoeFilter filter) {
    return Shoes.builder()
                .shoes(List.of(Shoe.builder()
                                   .name("Legacy shoe")
                                   .color(Color.BLUE)
                                   .size(BigInteger.ONE)
                                   .build()))
                .build();
  }

  @Override
  public Stock findAllStock() {
    return null;
  }
}
