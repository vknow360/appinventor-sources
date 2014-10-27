// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the MIT License https://raw.github.com/mit-cml/app-inventor/master/mitlicense.txt

package com.google.appinventor.server.storage;

import javax.persistence.Id;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Parent;

/**
 * this class modelled after those in StoredData.java
 *
 * @author blu2@dons.usfca.edu (Bin Lu)
 *
 */

public class GalleryModerationActionData {
  @Id Long id;
  long date;
  String userId;       // may need it later
  String moderatorId;
  long reportId;       // may functionally duplicated with reportKey
  long galleryId;
  long messageId;
  int actionType;

  String moderatorName;
  String messagePreview;

  @Parent Key<GalleryAppReportData> reportKey;
}