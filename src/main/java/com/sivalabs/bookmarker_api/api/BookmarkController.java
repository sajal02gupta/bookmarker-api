package com.sivalabs.bookmarker_api.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sivalabs.bookmarker_api.domain.BookmarkService;
import com.sivalabs.bookmarker_api.domain.BookmarksDTO;
@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
	@Autowired
	private final BookmarkService bookmarkService;
	@GetMapping
	public BookmarksDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page){
		return bookmarkService.getBookmarks(page);
	}
	
}