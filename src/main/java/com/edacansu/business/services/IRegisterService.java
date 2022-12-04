package com.edacansu.business.services;

import com.edacansu.business.dto.RegisterDto;
import com.edacansu.data.entity.RegisterEntity;

import java.util.List;
import java.util.Map;

public interface IRegisterService {

    //model mapper
    public RegisterDto entityToDto(RegisterEntity registerEntity);
    public RegisterEntity dtoToEntity(RegisterDto registerDto);


    // CREATE
    public RegisterDto createRegister(RegisterDto registerDto);

    // LIST
    public List<RegisterDto> getAllRegister();

    // FIND
    public RegisterDto getRegisterById(Long id);

    // UPDATE
    public RegisterDto updateRegister(Long id,RegisterDto registerDto);

    // DELETE
    public Map<String,Boolean> deleteRegister(Long id);
}
