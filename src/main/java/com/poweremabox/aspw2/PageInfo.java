package com.poweremabox.aspw2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "page-info")
public class PageInfo {

//    @Value("${page-info.author}")
    private String author;
//    @Value("${page-info.creationDate}")
    private String creationDate;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void getInfo(){
        System.out.println(author);
        System.out.println(creationDate);
    }
}
