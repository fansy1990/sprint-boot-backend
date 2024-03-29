/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.fansy.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Entity
@Data
public class Project {

	private @Id Long id;
	private String name;
	private String hideName;
	private String hidePath;
	private String url;

	private Project() {}

	public Project( long id,String name, String hideName, String hidePath, String url){
		this.id = id ;
		this.name = name;
		this.hideName = hideName;
		this.hidePath = hidePath;
		this.url = url;
	}

}
// end::code[]