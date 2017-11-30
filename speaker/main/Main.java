/*
 * main.java
 *
 * version 1.0
 *
 * 2017-11-28
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package main;

import system.SystemSpeaker;

/**
 * Main 클래스
 * <pre>
 * </pre>
 * 
 * <pre>
 * <b>History:</b>
 *	정예린, 1.0, 2017.11.28 초기작성
 * </pre>
 *
 * @author 정예린
 * @version 1.0, 2017.11.28 
 * @see None
 */

public class Main {

	public static void main(String[] args) {
		SystemSpeaker speaker1 = new SystemSpeaker();
		SystemSpeaker speaker2 = new SystemSpeaker();

		System.out.println("speaker1 : "+speaker1.getVolume());
		speaker2.setVolume(10);
		System.out.println("speaker2 : "+speaker2.getVolume());
		System.out.println("speaker1 : "+speaker1.getVolume());
		System.out.println("speaker1 : "+speaker1);
		System.out.println("speaker2 : "+speaker2);
	}
}


