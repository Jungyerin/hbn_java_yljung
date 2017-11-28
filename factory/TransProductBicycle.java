/*
 * TransProductBicycle.java
 *
 * version 1.0
 *
 * 2017-11-24
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package factory;

/**
 * RealTransCreatorTransCompany에 의해 생성되는 자전거.
 * <pre>
 * </pre>
 * 
 * <pre>
 * <b>History:</b>
 *  작성자, 1.0, 2017.11.28 초기작성
 * </pre>
 *
 * @author 정예린
 * @version 1.0, 2017.11.28 
 * @see None
 */

public class TransProductBicycle extends TransProduct {

	/**
	 * 자전거의 기능 정의.
	 */

	@Override
	void useTrans() {
		System.out.println("Using Bicycle");
	}

}
