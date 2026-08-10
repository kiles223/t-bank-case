package com.example.tbankcase.Service.Implements;

import com.example.tbankcase.Exception.ResourceNotFoundException;
import com.example.tbankcase.Mapper.NotificationsMapper;
import com.example.tbankcase.Model.Repositories.NotificationsRepository;
import com.example.tbankcase.Model.dto.NotificationsDTO;
import com.example.tbankcase.Model.entities.Notifications;
import com.example.tbankcase.Service.Interface.NotificationsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class NotificationsServicelmplements implements NotificationsService {


    @Autowired
    private NotificationsRepository notificationsRepository;
    private NotificationsMapper notificationsMapper;

    @Override
    public NotificationsDTO createNotifications(NotificationsDTO notificationsDto){
        Notifications notifications = notificationsMapper.toEntity(notificationsDto);
        Notifications savedNotifications = notificationsRepository.save(notifications);
        return  notificationsMapper.toDto(savedNotifications);

    }

    @Override
    public NotificationsDTO getNotificationsById(long notificationsId) {
        Notifications notifications = notificationsRepository.findById(notificationsId).orElseThrow(() ->
                new ResourceNotFoundException("Не найдено связи с id: " + notificationsId));
        return notificationsMapper.toDto(notifications);
    }

    @Override
    public void deleteNotificationsById(long notificationsId) {
        Notifications notifications = notificationsMapper.toEntity(getNotificationsById(notificationsId));
        notificationsRepository.delete(notifications);
    }
}
