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
package com.github.fansy.loader;

import com.github.fansy.model.Project;
import com.github.fansy.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Component
public class DataProjectLoader implements CommandLineRunner {

	private  final ProjectRepository repository ;

	@Autowired
	public DataProjectLoader(ProjectRepository repository){this.repository = repository;}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Project(1,"示例项目","demo",
				"/Users/fanzhe/projects/fansy_githubs/tut-react-and-spring-data-rest",
				"http://localhost:8081/index.html"));
	}
}
// end::code[]