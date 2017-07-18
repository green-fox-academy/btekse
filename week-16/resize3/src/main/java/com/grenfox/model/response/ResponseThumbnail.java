package com.grenfox.model.response;

public class ResponseThumbnail<T> {
  ResponseThumbnailLinksMap links;
  T data;

  public ResponseThumbnail(ResponseThumbnailLinksMap links, T data) {
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

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
