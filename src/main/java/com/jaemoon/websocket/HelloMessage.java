package com.jaemoon.websocket;

public class HelloMessage {

	private String tid;
	private String name;

	public HelloMessage() {
	}

	public HelloMessage(String name, String tid) {
		this.name = name;
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getMsg() {
		return "name :" + name + ", tid :"+ tid ; 
	}
	
}
