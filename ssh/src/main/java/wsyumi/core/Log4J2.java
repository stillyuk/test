/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package wsyumi.core;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author jiangyukun
 * @since 2014-02-04 15:04
 */
public class Log4J2 implements Log, Serializable {

	private static final long serialVersionUID = 1L;

	private Logger logger = LogManager.getLogger(Log4J2.class);

	private String name;

	public Log4J2(String name) {
		this.name = name;
	}

	public boolean isDebugEnabled() {
		return true;
	}

	public boolean isErrorEnabled() {
		return false;
	}

	public boolean isFatalEnabled() {
		return false;
	}

	public boolean isInfoEnabled() {
		return true;
	}

	public boolean isTraceEnabled() {
		return false;
	}

	public boolean isWarnEnabled() {
		return false;
	}

	public void trace(Object message) {
	}

	public void trace(Object message, Throwable t) {
	}

	public void debug(Object message) {
		logger.debug(message);
	}

	public void debug(Object message, Throwable t) {
		logger.debug(message);
	}

	public void info(Object message) {
		logger.info(name + ": " + message);
	}

	public void info(Object message, Throwable t) {
		logger.info(name + ": " + message);
	}

	public void warn(Object message) {
	}

	public void warn(Object message, Throwable t) {
	}

	public void error(Object message) {
	}

	public void error(Object message, Throwable t) {
	}

	public void fatal(Object message) {
	}

	public void fatal(Object message, Throwable t) {
	}
}
