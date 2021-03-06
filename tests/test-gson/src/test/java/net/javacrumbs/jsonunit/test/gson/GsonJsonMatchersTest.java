/**
 * Copyright 2009-2018 the original author or authors.
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
package net.javacrumbs.jsonunit.test.gson;

import net.javacrumbs.jsonunit.test.base.AbstractJsonMatchersTest;
import net.javacrumbs.jsonunit.test.base.JsonTestUtils;

public class GsonJsonMatchersTest extends AbstractJsonMatchersTest {
    protected Object readValue(String value) {
        return JsonTestUtils.readByGson(value);
    }
}
