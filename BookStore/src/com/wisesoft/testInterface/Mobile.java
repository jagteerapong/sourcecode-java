package com.wisesoft.testInterface;

public interface Mobile {
	void call();
	void playMusic();
}

interface Mobile2018{
	void takePhoto();
}

class Samsung implements Mobile,Mobile2018{
	@Override
	public void call() {
	}

	@Override
	public void playMusic() {
	}

	@Override
	public void takePhoto() {
	}
}
