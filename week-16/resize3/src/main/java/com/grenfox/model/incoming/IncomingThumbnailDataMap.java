package com.grenfox.model.incoming;

public class IncomingThumbnailDataMap {
  IncomingThumbnailDataData data;

  public IncomingThumbnailDataMap(IncomingThumbnailDataData data) {
    this.data = data;
  }

  public IncomingThumbnailDataMap() {
  }

  public IncomingThumbnailDataData getData() {
    return data;
  }

  public void setData(IncomingThumbnailDataData data) {
    this.data = data;
  }
}
