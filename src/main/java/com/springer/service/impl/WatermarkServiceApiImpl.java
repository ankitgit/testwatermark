package com.springer.service.impl;

import java.util.UUID;
import com.springer.controller.WatermarkController;
import com.springer.model.Document;
import com.springer.service.api.WatermarkServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by arpit on 2/1/17.
 */
public class WatermarkServiceApiImpl implements WatermarkServiceApi {

  @Autowired
  WatermarkController m_controller;

  @Override
  public UUID watermarkDocument(@PathVariable final Long id)
  {
    try {
      return m_controller.setWaterMarkAndReturnTicket(id);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    }
  }

  @Override
  public String checkWatermarkingStatusByTicket(@PathVariable final UUID ticket)
  {
    return m_controller.checkStatus(ticket);
  }

  @Override
  public Document retrieveDocumentByTicket(@PathVariable final UUID ticket)
  {
    try {
      return  m_controller.retrieveDocument(ticket);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    }
  }
}
