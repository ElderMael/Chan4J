package org.mael.chan4j.utils;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

public class HttpUtils {

	public static String getContentFromUrl(String url) throws IOException {
		return Request.Get(url).execute().returnContent().asString();
	}

}
