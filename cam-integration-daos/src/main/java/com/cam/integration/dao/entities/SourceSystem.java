package com.cam.integration.dao.entities;

import static java.lang.String.format;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SourceSystem implements Serializable {

	private static final long serialVersionUID = -9005134018238208714L;
	@Id
	private String sourceSystemId;
	private String sourceName;
	
	public SourceSystem() {}

	public SourceSystem(String sourceSystemId, String sourceName) {
		super();
		this.sourceSystemId = sourceSystemId;
		this.sourceName = sourceName;
	}

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	
	public String toString() {
		return format("SourceSystem{ sourceSystemId=%s, sourceName=%s}", sourceSystemId, sourceName);
	}
	
}
