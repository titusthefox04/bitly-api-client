/*
 * Copyright (c) Patrick Huber (gmail: stackmagic)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.swisstech.bitly.builder;

import java.lang.reflect.Type;

import net.swisstech.bitly.model.Response;
import net.swisstech.bitly.model.v3.UserInfo;

import com.google.gson.reflect.TypeToken;

public class UserInfoRequestBuilder extends RequestBuilder<UserInfo> {

	public UserInfoRequestBuilder(String accessToken) {
		super(accessToken);
	}

	@Override
	public String getEndpoint() {
		return "https://api-ssl.bitly.com/v3/user/info";
	}

	@Override
	protected Type getTypeForGson() {
		return new TypeToken<Response<UserInfo>>() {
		}.getType();
	}

	public UserInfoRequestBuilder setLogin(String login) {
		addQueryParameter("login", login);
		return this;
	}

	public UserInfoRequestBuilder setFullName(String full_name) {
		addQueryParameter("full_name", full_name);
		return this;
	}
}
