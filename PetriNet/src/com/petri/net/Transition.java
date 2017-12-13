package com.petri.net;

import java.util.List;

public class Transition {

	private String tag;
	private List<Arc> arcs;

	public Transition(String tag, List<Arc> arcs) {
		super();
		this.tag = tag;
		this.arcs = arcs;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<Arc> getArcs() {
		return arcs;
	}

	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}

	public boolean isValid() {
		for (Arc arc : arcs) {
			if (!arc.isValid()) {
				return false;
			}
		}
		return true;
	}

	public void update() {
//		if (!isValid()) {
//			return;
//		}
		for (Arc arc : arcs) {
			arc.update();
		}
	}
}
