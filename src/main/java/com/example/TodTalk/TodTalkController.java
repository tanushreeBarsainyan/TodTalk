package com.example.TodTalk;
import com.example.TodTalk.DataItem;
import com.example.TodTalk.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
@CrossOrigin // Enable CORS for the entire controller

public class TodTalkController {
    // src/main/java/com/example/demo/controller/DataController.java
        public final DataService dataService;

        @Autowired
        public TodTalkController(DataService dataService){

            this.dataService = dataService;
        }

        @GetMapping("/data")
        public List<DataItem> getAllData() {
            System.out.println("test");
            // This is just a sample, replace it with your actual data retrieval logic
            List<DataItem> dataItems = new ArrayList<>();
            dataItems.add(new DataItem(1L, "Item 1", "Description 1"));
            dataItems.add(new DataItem(2L, "Item 2", "Description 2"));
            return dataItems;
        }

        @GetMapping("/fetch")
        public List<DataItem> fetchData(){

            System.out.println("test fetch");
            return dataService.getAllData();
        }

}
