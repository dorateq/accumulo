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
package org.apache.accumulo.core.data;

import org.apache.hadoop.io.BinaryComparable;

/**
 * An array of bytes wrapped so as to extend Hadoop's <code>BinaryComparable</code> class.
 *
 * @deprecated since 1.7.0 In an attempt to clean up types in the data package that were not
 *             intended to be in public API this type was deprecated. Technically this method was
 *             not considered part of the public API in 1.6.0 and earlier, therefore it could have
 *             been deleted. However a decision was made to deprecate in order to be cautious and
 *             avoid confusion between 1.6.0 and 1.7.0.
 */
@Deprecated
public class ComparableBytes extends BinaryComparable {

  public byte[] data;

  /**
   * Creates a new byte wrapper. The given byte array is used directly as a backing array, so later
   * changes made to the array reflect into the new object.
   *
   * @param b
   *          bytes to wrap
   */
  public ComparableBytes(byte[] b) {
    this.data = b;
  }

  /**
   * Gets the wrapped bytes in this object.
   *
   * @return bytes
   */
  @Override
  public byte[] getBytes() {
    return data;
  }

  @Override
  public int getLength() {
    return data.length;
  }

}
