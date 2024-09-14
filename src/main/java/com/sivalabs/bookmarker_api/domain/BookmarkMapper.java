package com.sivalabs.bookmarker_api.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {
	public BookmarkDTO toDto(Bookmark bookmark) {
		BookmarkDTO bDto = new BookmarkDTO();
		bDto.setCreatedAt(bookmark.getCreatedAt());
		bDto.setId(bookmark.getId());
		bDto.setTitle(bookmark.getTitle());
		bDto.setUrl(bookmark.getUrl());
		return bDto;
	}
}
