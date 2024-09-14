package com.sivalabs.bookmarker_api.domain;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonProperty;

@Setter
@Getter
public class BookmarksDTO {
	
	private List<BookmarkDTO> data;
	private long totalElements;
	private int totalPages;
	@Setter
	private int currentPage;
	@JsonProperty("isFirst")
	private boolean isFirst;
	@JsonProperty("isLast")
	private boolean isLast;
	private boolean hasNext;
	private boolean hasPrevious;
	
	public BookmarksDTO(Page<BookmarkDTO> bookmarkPage) {
		this.setData(bookmarkPage.getContent());
		this.setTotalElements(bookmarkPage.getNumberOfElements());
		this.setTotalPages(bookmarkPage.getTotalPages());
		this.setCurrentPage(bookmarkPage.getNumber()+1);
		this.setFirst(bookmarkPage.isFirst());
		this.setLast(bookmarkPage.isLast());
		this.setHasNext(bookmarkPage.hasNext());
		this.setHasPrevious(bookmarkPage.hasPrevious());
	}
	
	
}
