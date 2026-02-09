package com.practice.beans;

import java.util.ArrayList;
import java.util.List;

public class Subjects {
	List<String> subj;
	
	public Subjects() {
		subj=new ArrayList<>();
	}

	public Subjects(List<String> subj) {
		this.subj = subj;
	}

	@Override
	public String toString() {
		return "Subjects " + subj + "";
	}
	
}
