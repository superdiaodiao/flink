/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.api.java.typeutils;

import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.api.common.typeutils.TypeInformationTestBase;

/** Test for {@link SetTypeInfo}. */
class SetTypeInfoTest extends TypeInformationTestBase<SetTypeInfo<?>> {

    @Override
    protected SetTypeInfo<?>[] getTestData() {
        return new SetTypeInfo<?>[] {
            new SetTypeInfo<>(BasicTypeInfo.STRING_TYPE_INFO),
            new SetTypeInfo<>(BasicTypeInfo.BOOLEAN_TYPE_INFO),
            new SetTypeInfo<>(Object.class),
        };
    }
}
