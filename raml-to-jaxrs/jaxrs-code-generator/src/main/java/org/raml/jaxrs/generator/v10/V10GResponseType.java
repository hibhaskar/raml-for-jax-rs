/*
 * Copyright 2013-2018 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.generator.v10;

import org.raml.jaxrs.generator.ramltypes.GResponseType;
import org.raml.jaxrs.generator.ramltypes.GType;
import org.raml.v2.api.model.v10.datamodel.TypeDeclaration;

/**
 * Created by Jean-Philippe Belanger on 12/11/16. Just potential zeroes and ones
 */
public class V10GResponseType implements GResponseType {

  private final TypeDeclaration input;
  private final V10GType v10GType;

  public V10GResponseType(TypeDeclaration input, V10GType v10GType) {

    this.input = input;
    this.v10GType = v10GType;
  }

  @Override
  public String mediaType() {
    return input.name();
  }

  @Override
  public GType type() {
    return v10GType;
  }
}
