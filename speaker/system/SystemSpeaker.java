/*
 * SystemSpeaker.java
 * version 1.0
 * 
 * 2017-11-28
 *
 * Copyright 1996 - 2017 hibrain.net All rights reserved.
 */

package system;

/**
 * 시스템의 스피커 설정을 관리하는 클래스.
 *
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

public class SystemSpeaker {
	private int volume;

	public SystemSpeaker() {
		volume = 5;
	}

	public int getVolume() {
		return volume;
	}

	public SystemSpeaker setVolume(int volume) {
		this.volume = volume;
		return this;
	}
}
