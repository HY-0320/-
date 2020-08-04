package com.iotat.ml.demo.servecs;

import com.iotat.ml.demo.entity.City;
import java.io.IOException;

public interface User {
    public String userLocation(String locationName) throws IOException;

}
