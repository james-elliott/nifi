/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.processors.kafka.pubsub;

import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.processor.Relationship;

public class KafkaProcessor {
    /**
     * NIFI-11259 provide ability to reference package-private references.
     */
    public static final PropertyDescriptor OUTPUT_STRATEGY = ConsumeKafkaRecord_2_6.OUTPUT_STRATEGY;
    public static final PropertyDescriptor KEY_FORMAT = ConsumeKafkaRecord_2_6.KEY_FORMAT;

    public static final Relationship REL_SUCCESS = ConsumeKafkaRecord_2_6.REL_SUCCESS;
    public static final Relationship REL_PARSE_FAILURE = ConsumeKafkaRecord_2_6.REL_PARSE_FAILURE;
}
