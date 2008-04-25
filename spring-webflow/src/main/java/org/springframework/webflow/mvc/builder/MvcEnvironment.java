/*
 * Copyright 2004-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.webflow.mvc.builder;

import org.springframework.core.enums.StaticLabeledEnum;

/**
 * Supported Spring Web MVC environments.
 * 
 * @author Keith Donald
 */
public class MvcEnvironment extends StaticLabeledEnum {

	/**
	 * Spring Web Servlet MVC.
	 */
	public static final MvcEnvironment SERVLET = new MvcEnvironment(0, "servlet");

	/**
	 * Spring Web Portlet MVC.
	 */
	public static final MvcEnvironment PORTLET = new MvcEnvironment(1, "portlet");

	private MvcEnvironment(int code, String label) {
		super(code, label);
	}

}