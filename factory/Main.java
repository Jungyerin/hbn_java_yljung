/*
 * main.java
 *
 * version 1.8.0_141
 *
 * 2017-11-24
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package factory;

/**
 * Main 클래스
 * <pre>
 * </pre>
 * 
 * <pre>
 * <b>History:</b>
 *	작성자, 1.0, 2017.11.28 초기작성
 * </pre>
 *
 * @author 정예린
 * @version 1.0, 2017.11.28 
 * @see None
 */

public class Main {

	/**
	 * main 메소드.
	 * 
	 * @tc	교통수단을 만들어내는 생산자 선언
	 * @tp	제품을 생성하는변수 선언
	 * 
	 */

	public static void main(String[] args) {
		TransCreator tc = new RealTransCreatorTransCompany();
		TransProduct tp;
		tp = tc.transCreate("Bicycle");
		tp.useTrans();
		tp = tc.transCreate("taxi");
        tp.useTrans();
	}
}
