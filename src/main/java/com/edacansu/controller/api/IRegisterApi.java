package com.edacansu.controller.api;

import com.edacansu.business.dto.RegisterDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface IRegisterApi {


    //Create
    ResponseEntity<RegisterDto> createRegister(RegisterDto registerDto);

    //List
    ResponseEntity<List<RegisterDto>> getAllRegister();

    //Find
    ResponseEntity<?> getRegisterById(Long id);

    //Update
    ResponseEntity<?> updateRegister(Long id, RegisterDto registerDto);

    //Delete
    ResponseEntity<Map<String, Boolean>> deleteRegister(Long id);
}
