/*
 * TransCreator.java
 *
 * version 1.0
 *
 * 2017-11-24
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package factory;

/**
 * Main에서 객체 생성을 할 때 호출하는 인터페이스.
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

public interface TransCreator {

	/**
	 * 객체 생성을 할 메소드 정의ㅑ
	 */
 
	public abstract TransProduct transCreate(String trans);

}

