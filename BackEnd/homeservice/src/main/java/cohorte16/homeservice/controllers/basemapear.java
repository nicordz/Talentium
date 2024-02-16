package cohorte16.homeservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.properties")
public class basemapear {


    //jdbc:mysql://localhost:3306/homeservice
    @Value("${db_url}")
    private String url;



}
