package com.grenfox.service;

import com.grenfox.model.GeolocationAttributes;
import com.grenfox.model.response.ResponseGeolocationDataMap;
import com.grenfox.model.response.ResponseThumbnail;
import com.grenfox.model.response.ResponseThumbnailDataMap;
import com.grenfox.model.response.ResponseThumbnailLinksMap;
import com.grenfox.repository.GeolocationAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeolocationService {
  GeolocationAttributesRepository geolocationAttributesRepository;

  @Autowired
  public GeolocationService(GeolocationAttributesRepository geolocationAttributesRepository) {
    this.geolocationAttributesRepository = geolocationAttributesRepository;
  }

  public ResponseThumbnail createGeolocationResponse() {
    ResponseThumbnail responseThumbnail = new ResponseThumbnail();

    GeolocationAttributes geolocationAttributes = geolocationAttributesRepository.findOne(1L);
    geolocationAttributes.setSelf("https://your-hostname.com/api/locations");
    geolocationAttributesRepository.save(geolocationAttributes);

    responseThumbnail.setLinks(new ResponseThumbnailLinksMap("https://your-hostname.com/api/locations"));

    ResponseGeolocationDataMap responseGeolocationDataMap = new ResponseGeolocationDataMap();
    responseGeolocationDataMap.setLat(geolocationAttributes.getLat());
    responseGeolocationDataMap.setLongtitude(geolocationAttributes.getLongitude());
    responseGeolocationDataMap.setName(geolocationAttributes.getName());

    ResponseThumbnailDataMap responseThumbnailDataMap = new ResponseThumbnailDataMap();
    responseThumbnailDataMap.setId(geolocationAttributes.getId());
    responseThumbnailDataMap.setType(geolocationAttributes.getType());
    responseThumbnailDataMap.setAttributes(responseGeolocationDataMap);

    responseThumbnail.setData(responseThumbnailDataMap);
    return responseThumbnail;

  }
}
