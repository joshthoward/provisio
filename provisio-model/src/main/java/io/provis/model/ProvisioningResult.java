/**
 * Copyright (c) 2016 Takari, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.provis.model;

import java.io.File;
import java.util.List;

import com.google.common.collect.Lists;

public class ProvisioningResult {

  private List<Archive> archives;
  private final ProvisioningRequest request;
  
  public ProvisioningResult(ProvisioningRequest request) {
    this.request = request;
  }
  
  public File getOutputDirectory() {
    return request.getOutputDirectory();
  }

  public List<Archive> getArchives() {
    return archives;
  }

  public void addArchive(Archive archive) {
    if (archives == null) {
      archives = Lists.newArrayList();
    }
    archives.add(archive);
  }
}
