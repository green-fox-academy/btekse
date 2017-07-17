package com.grenfox.model.response;

public class ResponseThumbnail {
  ResponseThumbnailLinksMap links;
  ResponseThumbnailDataMap data;

  public ResponseThumbnail(ResponseThumbnailLinksMap links, ResponseThumbnailDataMap data) {
    this.links = links;
    this.data = data;
  }

  public ResponseThumbnail() {
  }

  public ResponseThumbnailLinksMap getLinks() {
    return links;
  }

  public void setLinks(ResponseThumbnailLinksMap links) {
    this.links = links;
  }

  public ResponseThumbnailDataMap getData() {
    return data;
  }

  public void setData(ResponseThumbnailDataMap data) {
    this.data = data;
  }
}
