package com.jeke.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedResource<T> {
	private long page;
	@JsonProperty("total_pages") private long totalPages;
	private List<T> items;
	
	public long getPage() {
		return page;
	}
	
	public void setPage(long page) {
		this.page = page;
	}
	
	public long getTotalPages() {
		return totalPages;
	}
	
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
	
	public List<T> getItems() {
		return items;
	}
	
	public void setItems(List<T> items) {
		this.items = items;
	}
}
