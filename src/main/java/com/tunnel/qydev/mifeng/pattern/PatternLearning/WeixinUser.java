package com.tunnel.qydev.mifeng.pattern.PatternLearning;

public class WeixinUser implements Observer {
	private String name;
    public WeixinUser(String name){
    	this.name = name;
    }
	public void update(String message) {
		System.out.println(name +"-"+message);
	}

}
