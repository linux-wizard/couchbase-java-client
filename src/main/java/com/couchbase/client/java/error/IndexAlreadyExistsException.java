/*
 * Copyright (c) 2016 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.couchbase.client.java.error;

import java.util.List;

import com.couchbase.client.core.CouchbaseException;
import com.couchbase.client.core.annotations.InterfaceAudience;
import com.couchbase.client.core.annotations.InterfaceStability;
import com.couchbase.client.java.bucket.BucketManager;
import com.couchbase.client.java.query.dsl.Expression;

/**
 * An exception indicating that an index already exists, for instance
 * when trying to create one using {@link BucketManager#createN1qlIndex(String, List, Expression, boolean, boolean)}.
 *
 * @author Simon Baslé
 * @since 2.2
 */
@InterfaceStability.Committed
@InterfaceAudience.Public
public class IndexAlreadyExistsException extends CouchbaseException {

    public IndexAlreadyExistsException() {
        super();
    }

    public IndexAlreadyExistsException(String message) {
        super(message);
    }

    public IndexAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
