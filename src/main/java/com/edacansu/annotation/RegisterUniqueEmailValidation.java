package com.edacansu.annotation;


import com.edacansu.data.entity.RegisterEntity;
import com.edacansu.data.repository.IRegisterRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegisterUniqueEmailValidation implements ConstraintValidator<RegisterUniqueEmail, String> {

    private final IRegisterRepository iRegisterRepository;


    @Override
    public boolean isValid(String emailAddress, ConstraintValidatorContext constraintValidatorContext) {
        RegisterEntity registerEntity = iRegisterRepository.findByEmail(emailAddress);
        if (registerEntity != null)
            return false;
        return true;
    }
}
