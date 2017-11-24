/*
 * TransProductTaxi.java
 *
 * version 1.0
 *
 * 2017-11-24
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package factory;

public class TransProductTaxi extends TransProduct {

	@Override
	void useTrans() {
		System.out.println("Using Taxi");
	}

}