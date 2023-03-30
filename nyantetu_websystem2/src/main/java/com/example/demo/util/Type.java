package com.example.demo.util;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Type {

  public static final Map<Integer,String> GENDERS;
  static {
	  Map<Integer,String>genders=new LinkedHashMap<>();
	  genders.put(1, "選択しない");
	  genders.put(2, "男性");
	  genders.put(3,"女性");
	  genders.put(4, "その他");
	  GENDERS=Collections.unmodifiableMap(genders);
  }
	
}
