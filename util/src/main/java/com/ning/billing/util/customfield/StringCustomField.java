/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.util.customfield;

import java.util.UUID;
import com.ning.billing.util.entity.UpdatableEntityBase;
import org.joda.time.DateTime;

public class StringCustomField extends UpdatableEntityBase implements CustomField {
    private String name;
    private String value;

    public StringCustomField(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    public StringCustomField(UUID id, String createdBy, DateTime createdDate,
                             String updatedBy, DateTime updatedDate, String name, String value) {
        super(id, createdBy, createdDate, updatedBy, updatedDate);
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
