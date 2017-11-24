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


public class Main {

	public static void main(String[] args) {
		TransCreator tc = new RealTransCreatorTransCompany();
		TransProduct tp;
		tp = tc.transCreate("Bicycle");
		tp.useTrans();
		tp = tc.transCreate("taxi");
                tp.useTrans();
	}
}
