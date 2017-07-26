package com.tunnel.qydev.mifeng.pattern.PatternLearning;

import java.util.ArrayList;
import java.util.List;

public class CertainSubject implements Subject {
	private List<Observer> weixinUserList = new ArrayList<Observer>();

	public void attach(Observer observer) {
		weixinUserList.add(observer);
	}

	public void detach(Observer observer) {
		weixinUserList.remove(observer);
	}

	public void notify(String message) {
		for(Observer observer:weixinUserList){
			observer.update(message);
		}
	}
	public static void main(String[] args){
		CertainSubject subject = new CertainSubject();
		WeixinUser user1=new WeixinUser("杨影枫");
        WeixinUser user2=new WeixinUser("月眉儿");
        WeixinUser user3=new WeixinUser("紫轩");
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);
        subject.notify("刘望舒的专栏更新了");
	}

}
