package com.example.tbankcase.Service.Interface;

import com.example.tbankcase.Model.dto.NotificationsDTO;

public interface NotificationsService {
    NotificationsDTO createNotifications(NotificationsDTO notifications);
    NotificationsDTO getNotificationsById(long notificationsId);
    void deleteNotificationsById(long notificationsId);
}
