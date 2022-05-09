package com.abhisheksah.question7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spel {

	@Value("#{56+65+12}")
	private int x;
	@Value("#{'Abhishek kumar sah'}")
	private String y;
@Value("#{T(java.lang.Math).PI}")	
	private float z;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "SPEL example [-- int x=" + x + ",String  y=" + y + ",  double z=" + z + "]";
	}
	
}
