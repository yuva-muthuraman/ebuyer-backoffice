package com.ebuyer.backoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="media")
public class Media {
	
	@Id
	private long id;
	
	@Column (name="directory_path")
	private String directoryPath;
	
	@Column (name="video_flag")
	private boolean videoFlag;
}
