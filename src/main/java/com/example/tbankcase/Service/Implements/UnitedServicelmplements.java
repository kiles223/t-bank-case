package com.example.tbankcase.Service.Implements;

import com.example.tbankcase.Exception.ResourceNotFoundException;
import com.example.tbankcase.Mapper.UnitedMapper;
import com.example.tbankcase.Model.Repositories.UnitedRepository;
import com.example.tbankcase.Model.dto.UnitedDTO;
import com.example.tbankcase.Model.entities.United;
import com.example.tbankcase.Service.Interface.UnitedService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class UnitedServicelmplements implements UnitedService {


    @Autowired
    private UnitedRepository unitedRepository;
    private UnitedMapper unitedMapper;

    @Override
    public UnitedDTO createUnited(UnitedDTO unitedDto){
        United united = unitedMapper.toEntity(unitedDto);
        United savedUnited = unitedRepository.save(united);
        return  unitedMapper.toDto(savedUnited);

    }

    @Override
    public UnitedDTO getUnitedById(long unitedId) {
        United united = unitedRepository.findById(unitedId).orElseThrow(() ->
                new ResourceNotFoundException("Не найдено связи с id: " + unitedId));
        return unitedMapper.toDto(united);
    }

    @Override
    public void deleteUnitedById(long unitedId) {
        United united = unitedMapper.toEntity(getUnitedById(unitedId));
        unitedRepository.delete(united);
    }
}
