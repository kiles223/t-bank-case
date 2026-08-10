package com.example.tbankcase.Mapper;

import com.example.tbankcase.Model.dto.NotificationsDTO;
import com.example.tbankcase.Model.entities.Notifications;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface NotificationsMapper {
   NotificationsDTO toDto(Notifications notifications);
   NotificationsDTO toEntity(NotificationsDTO notificationsDTO);
}
