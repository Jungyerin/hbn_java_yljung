/*
 * SystemSpeaker.java
 * 
 * version 1.0
 *
 * 2017-11-28
 *
 * Copyright 1996 - 2017 hibrain.net All rights rerserved.
 */

package singleton;

/**
 * 시스템의 스피커 설정을 관리하는 클래스.
 * 시스템에서 하나의 설정값만 가져야 되기때문에 싱글톤 패턴으로 구현.
 *
 * <pre>
 * </pre>
 *
 * <pre>
 * <b>History</b>
 * 정예린, 1.0, 2017.11.28 초기작성
 * </pre>
 *
 * @author 정예린
 * @version 1.0
 * @see None
 */

public class SystemSpeaker {

	/**
	 */ 

	private static SystemSpeaker instance;
	private int volume;

	private SystemSpeaker() {
		volume = 5;
	}

	public static SystemSpeaker getInstance() {
		if(instance == null) {
			instance = new SystemSpeaker();
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public SystemSpeaker setVolume(int volume) {
		this.volume = volume;
		return this;
	}
}
