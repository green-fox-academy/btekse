package com.grenfox.service;

import com.grenfox.model.GeolocationAttributes;
import com.grenfox.model.response.ResponseGeolocationDataMap;
import com.grenfox.model.response.ResponseThumbnail;
import com.grenfox.model.response.ResponseThumbnailDataMap;
import com.grenfox.model.response.ResponseThumbnailLinksMap;
import com.grenfox.repository.GeolocationAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeolocationService {
  GeolocationAttributesRepository geolocationAttributesRepository;

  @Autowired
  public GeolocationService(GeolocationAttributesRepository geolocationAttributesRepository) {
    this.geolocationAttributesRepository = geolocationAttributesRepository;
  }

  public ResponseThumbnail createGeolocationResponse() {
    ResponseThumbnail responseThumbnail = new ResponseThumbnail();

    responseThumbnail.setLinks(new ResponseThumbnailLinksMap("https://your-hostname.com/api/locations"));

    ArrayList<GeolocationAttributes> geolocationAttributes = geolocationAttributesRepository.findAll();
    List<ResponseThumbnailDataMap> allResponseThumbnailDataMap = new ArrayList<>();
    for(GeolocationAttributes actual : geolocationAttributes) {
      ResponseGeolocationDataMap responseGeolocationDataMap = new ResponseGeolocationDataMap();
      ResponseThumbnailDataMap responseThumbnailDataMap = new ResponseThumbnailDataMap();
      responseGeolocationDataMap.setLat(actual.getLat());
      responseGeolocationDataMap.setLongtitude(actual.getLongitude());
      responseGeolocationDataMap.setName(actual.getName());
      responseThumbnailDataMap.setId(actual.getId());
      responseThumbnailDataMap.setType(actual.getType());
      responseThumbnailDataMap.setAttributes(responseGeolocationDataMap);
      allResponseThumbnailDataMap.add(responseThumbnailDataMap);
    }




    responseThumbnail.setData(allResponseThumbnailDataMap);
    return responseThumbnail;

  }
}
