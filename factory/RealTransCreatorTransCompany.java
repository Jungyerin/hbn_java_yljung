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

public class RealTransCreatorTransCompany implements TransCreator {
	
	@Override
	public TransProduct transCreate(String trans) {
		if(trans.equals("taxi")) {
			return new TransProductTaxi();
		} else {
			return new TransProductBicycle();
		}
	}

}

