package com.sivalabs.bookmarker_api.domain;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "bookmarks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bookmark {
	@Id
	@SequenceGenerator(name = "bm_id_seq_gen", sequenceName = "bm_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq_gen")
	private Long id;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String url;
	private Instant createdAt;

}
