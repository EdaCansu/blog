package com.edacansu.controller.api;

import com.edacansu.business.dto.RegisterDto;
import com.edacansu.business.services.IRegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor

@RestController
@RequestMapping("register")
public class RegisterApiImpl implements IRegisterApi{

    //constructor Injection
    private final IRegisterService iRegisterService;




    //Create
    //http://localhost:9999/register
    @Override
    @PostMapping
    public ResponseEntity<RegisterDto> createRegister(@Valid @RequestBody RegisterDto registerDto) {
        iRegisterService.createRegister(registerDto);
        return ResponseEntity.ok(registerDto);
    }

    //List
    //http://localhost:9999/register/list
    @Override
    @GetMapping("/list")
    public ResponseEntity<List<RegisterDto>> getAllRegister() {

        return ResponseEntity.ok(iRegisterService.getAllRegister());
    }

    //Find
    //http://localhost:9999/register/1
    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> getRegisterById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(iRegisterService.getRegisterById(id));
    }

    //Update
    //http://localhost:9999/register/1
    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> updateRegister(@PathVariable(name = "id") Long id, @Valid @RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(iRegisterService.updateRegister(id, registerDto));
    }

    //Delete
    //http://localhost:9999/register/1
    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteRegister(@PathVariable(name = "id") Long id) {

        return ResponseEntity.ok(iRegisterService.deleteRegister(id));
    }
}
