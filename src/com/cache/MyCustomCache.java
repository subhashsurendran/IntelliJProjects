package com.cache;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MyCustomCache<T> implements Serializable {

    private Map<String, T> cacheMap = new HashMap<>();
    private int timeToLive;
    private int storageTime;

    //@Autowired
    private MyResourceClass myResourceClass;


    //@Startup or @PostConstruct
    private void populateCache(){
        cacheMap = createFreshCache();
    }

    private Map<String,T> createFreshCache() {

        //myResourceClass object has returned a set of lists;
        List<SomeData> someDataList = myResourceClass.getDataList();
        for(SomeData some: someDataList){

        }

        return cacheMap;
    }


    public Optional<T> get(String key){

        //lookup for if it is stale data. If it is stale data, have a refreshCache method
        return Optional.of(cacheMap.get(key));
    }

}
