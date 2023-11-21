package com.example.TodTalk;
import com.example.TodTalk.DataItem;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class DataService {
    public List<DataItem> getAllData() {
        // In a real application, you would fetch data from a database or another service
        // For simplicity, we'll return a hardcoded list of items here

        return Arrays.asList(
                new DataItem(1L, "Item 1","1"),
                new DataItem(2L, "Item 2","2"),
                new DataItem(3L, "Item 3","3")
        );
    }
}
