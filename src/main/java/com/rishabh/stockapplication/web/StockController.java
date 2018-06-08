package com.rishabh.stockapplication.web;

import com.rishabh.stockapplication.domain.Stock;
import com.rishabh.stockapplication.dto.StockDTO;
import com.rishabh.stockapplication.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/stock")
public class StockController {

    @Autowired
    StockService stockService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<StockDTO> recordStock(@RequestBody StockDTO stockDTO) {
        try{
            StockDTO resultStock = stockService.recordStock(stockDTO);
            return new ResponseEntity<>(resultStock, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
