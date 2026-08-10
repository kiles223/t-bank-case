package com.example.tbankcase.Model.Repositories;

import com.example.tbankcase.Model.entities.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsRepository extends JpaRepository<Notifications, Long> {
}
