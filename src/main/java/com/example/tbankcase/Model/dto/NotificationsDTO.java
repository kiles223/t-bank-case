package com.example.tbankcase.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationsDTO {
    private long id;
    private long userId;
    private String notificationTitle;
    private String notificationText;
    private Timestamp notificationDatetime;
}
