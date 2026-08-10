package com.example.tbankcase.Service.Interface;

import com.example.tbankcase.Model.dto.UnitedDTO;

public interface UnitedService{
    UnitedDTO createUnited(UnitedDTO united);
    UnitedDTO getUnitedById(long unitedId);
    void deleteUnitedById(long unitedId);
}