package com.ds.linkedlist;

public class Link <T extends Object>{
	
	public T data;
	
	public Link next;
	
	public Link (T data){
		this.data = data;
	}
	
	public void  displayLink(){
		System.out.println("data  "  + data);
	}

}
