package com.example.spring.form.model;

import java.util.List;

public class SelectModel {
	private String selectedIsbn;

	private List<String> selectedIsbns;

	public String getSelectedIsbn() {
		return selectedIsbn;
	}

	public void setSelectedIsbn(String selectedIsbn) {
		this.selectedIsbn = selectedIsbn;
	}

	public List<String> getSelectedIsbns() {
		return selectedIsbns;
	}

	public void setSelectedIsbns(List<String> selectedIsbns) {
		this.selectedIsbns = selectedIsbns;
	}
}
