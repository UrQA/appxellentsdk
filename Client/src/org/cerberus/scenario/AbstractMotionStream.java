package org.cerberus.scenario;

public interface AbstractMotionStream {

	public void sendData(MotionVO data);
	
	public void updateData(MotionVO data);
}
