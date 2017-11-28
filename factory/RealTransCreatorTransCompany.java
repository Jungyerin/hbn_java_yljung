/*
 * RealTransCreatorTransCompany .java
 *
 * version 1.0
 *
 * 2017-11-24
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package factory;

/**
 * TrnasCreator를 상속받아 어떤 클래스를 생성할지 정의
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

public class RealTransCreatorTransCompany implements TransCreator {
	
	/**
	 * 인자값을 받아 클래스를 생성
	 * 
	 * @trans	생성할 클래스를 결정하는 인자값
	 * @return	생성할 클래스
	 * @see    None
	 */
	@Override
	public TransProduct transCreate(String trans) {
		if(trans.equals("taxi")) {
			return new TransProductTaxi();
		} else {
			return new TransProductBicycle();
		}
	}

}

