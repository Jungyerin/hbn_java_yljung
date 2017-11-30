/*
 * main.java
 * version 1.0
 *
 * 2017-11-28
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package main;

import singleton.SystemSpeaker;

/**
 * main 클래스
 * <pre>
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 *	작성자, 1.0, 2017-11-28 초기작성
 * </pre>
 *
 * @author 정예린
 * @version 1.0, 2017.11.28
 * @see None
 */

public class Main {

	/**
	 * main 메소드
	 *
	 * @speaker1	스피커 설정 시스템 접근할 변수 선언
	 * @speaker2 	스피커 설정 시스템 접근할 변수 선언
	 *
	 */

	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		System.out.println("speaker1 : "+speaker1.getVolume());
		speaker2.setVolume(10);
		System.out.println("speaker2 : "+speaker2.getVolume());
		System.out.println("speaker1 : "+speaker1.getVolume());
		System.out.println("speaker1 : "+speaker1);
		System.out.println("speaker2 : "+speaker2);
	}
}


