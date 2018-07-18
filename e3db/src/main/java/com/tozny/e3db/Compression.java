/*
 * TOZNY NON-COMMERCIAL LICENSE
 *
 * Tozny dual licenses this product. For commercial use, please contact
 * info@tozny.com. For non-commercial use, the contents of this file are
 * subject to the TOZNY NON-COMMERCIAL LICENSE (the "License") which
 * permits use of the software only by government agencies, schools,
 * universities, non-profit organizations or individuals on projects that
 * do not receive external funding other than government research grants
 * and contracts.  Any other use requires a commercial license. You may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at https://tozny.com/legal/non-commercial-license.
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations under
 * the License. Portions of the software are Copyright (c) TOZNY LLC, 2018.
 * All rights reserved.
 *
 */

package com.tozny.e3db;

/**
 * Represents the different types of compression E3DB supports.
 */
public enum Compression {
  /**
   * Plaintext contents were gzip-compressed prior to encryption.
   */
  GZIP("gzip"),
  /**
   * Plaintext contents were not compressed prior to encryption.
   */
  RAW("raw");

  private final String type;

  Compression(String type) {
    this.type = type;
  }

  /**
   * The compression type.
   * @return Ibid.
   */
  public String getType() {
    return type;
  }

  /**
   * Given a compression type, retrieve the associated enum.
   * @param type Compression type.
   * @return Ibid.
   */
  public static Compression fromType(String type) {
    if(type.equalsIgnoreCase(GZIP.getType()))
      return GZIP;
    else if(type.equalsIgnoreCase(RAW.getType()))
      return RAW;
    else
      throw new RuntimeException("Unknown compression type: " + type);
  }
}