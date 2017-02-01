package com.springer.service.api;

import java.util.UUID;
import com.springer.model.Document;
import org.omg.CORBA.Request;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arpit on 2/1/17.
 */
@RestController
public interface WatermarkServiceApi {
  /**
   * Method to add watermark to the document
   * @param id: id of the document
   * @return response code of the action
   */
  @RequestMapping(value = "add/{id}" , method = RequestMethod.PUT)
  @ResponseBody
  public UUID watermarkDocument(@PathVariable Long id);


  /**
   * Method to check the status of watermark of the document
   * @param ticket: ticket id of the document
   * @return
   */
  @RequestMapping(value = "checkStatus/{ticket}", method = RequestMethod.GET)
  @ResponseBody
  public String checkWatermarkingStatusByTicket(@PathVariable UUID ticket);

  /**
   * Method to check the status of watermark of the document
   * @param ticket: ticket id of the document
   */
  @RequestMapping(value = "retrieveDocument/{ticket}", method = RequestMethod.GET)
  @ResponseBody
  public Document retrieveDocumentByTicket(@PathVariable UUID ticket);
}
