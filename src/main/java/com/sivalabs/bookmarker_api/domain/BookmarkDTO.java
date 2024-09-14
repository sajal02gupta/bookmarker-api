package com.sivalabs.bookmarker_api.domain;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkDTO {
	private Long id;
	private String title;
	private String url;
	private Instant createdAt;
}
