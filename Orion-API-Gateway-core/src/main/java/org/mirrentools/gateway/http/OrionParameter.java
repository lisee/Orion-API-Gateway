package org.mirrentools.gateway.http;

import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.CaseInsensitiveHeaders;

/**
 * http1.x请求或响应的数据
 * 
 * @author <a href="https://mirrentools.org/">Mirren</a>
 * @version 创建时间：2019年8月2日 下午1:43:00
 *
 */
public class OrionParameter {
	/** handler的数据 */
	private MultiMap header = new CaseInsensitiveHeaders();
	/** path的数据 */
	private MultiMap path = new CaseInsensitiveHeaders();
	/** query的数据 */
	private MultiMap query = new CaseInsensitiveHeaders();
	/** body的数据 */
	private MultiMap body = new CaseInsensitiveHeaders();
	/** body的二进制数据 */
	private Buffer buffer;

	/**
	 * 获取header数据
	 * 
	 * @return
	 */
	public MultiMap getHeader() {
		return header;
	}
	/**
	 * 添加header数据
	 * 
	 * @param header
	 * @return
	 */
	public OrionParameter addHeader(String name, String value) {
		getHeader().add(name, value);
		return this;
	}
	/**
	 * 设置header数据
	 * 
	 * @param header
	 * @return
	 */
	public OrionParameter setHeader(MultiMap header) {
		this.header = header;
		return this;
	}
	/**
	 * 获取path数据
	 * 
	 * @return
	 */
	public MultiMap getPath() {
		return path;
	}

	/**
	 * 添加path数据
	 * 
	 * @param path
	 * @return
	 */
	public OrionParameter addPath(String name, String value) {
		getPath().add(name, value);
		return this;
	}

	/**
	 * 设置path数据
	 * 
	 * @param path
	 * @return
	 */
	public OrionParameter setPath(MultiMap path) {
		this.path = path;
		return this;
	}
	/**
	 * 获取query数据
	 * 
	 * @return
	 */
	public MultiMap getQuery() {
		return query;
	}
	/**
	 * 添加query数据
	 * 
	 * @param query
	 * @return
	 */
	public OrionParameter addQuery(String name, String value) {
		getQuery().add(name, value);
		return this;
	}
	/**
	 * 设置query数据
	 * 
	 * @param query
	 * @return
	 */
	public OrionParameter setQuery(MultiMap query) {
		this.query = query;
		return this;
	}
	/**
	 * 获取body数据
	 * 
	 * @return
	 */
	public MultiMap getBody() {
		return body;
	}
	/**
	 * 添加body的数据
	 * 
	 * @param body
	 * @return
	 */
	public OrionParameter addBody(String name, String value) {
		getBody().add(name, value);
		return this;
	}
	/**
	 * 设置body的数据
	 * 
	 * @param body
	 * @return
	 */
	public OrionParameter setBody(MultiMap body) {
		this.body = body;
		return this;
	}
	/**
	 * 获取body的buffer
	 * 
	 * @return
	 */
	public Buffer getBuffer() {
		return buffer;
	}

	/**
	 * 追加body的buffer
	 * 
	 * @param buffer
	 */
	public OrionParameter appendBuffer(Buffer buffer) {
		if (getBuffer() == null) {
			setBuffer(buffer);
		} else {
			getBuffer().appendBuffer(buffer);
		}
		return this;
	}

	/**
	 * 设置body的buffer
	 * 
	 * @param buffer
	 */
	public OrionParameter setBuffer(Buffer buffer) {
		this.buffer = buffer;
		return this;
	}

}
