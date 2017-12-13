package com.petri.net;

public class Location {

	private String tag;
	private Integer tokens;

	public Location(String tag, Integer tokens) {
		super();
		this.tag = tag;
		this.tokens = tokens;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getTokens() {
		return tokens;
	}

	public void setTokens(Integer tokens) {
		this.tokens = tokens;
	}

	public void addTokens(Integer tokens) {
		this.tokens = tokens;
	}

	public void substractTokens(Integer tokens) {
		this.tokens -= tokens;
	}

}
