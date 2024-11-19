package br.edu.atitus.apisample.services;

import br.edu.atitus.apisample.models.Register;
import br.edu.atitus.apisample.repositories.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    public Register createRegister(Register register) {
        return registerRepository.save(register);
    }

    public Register updateRegister(Long id, Register register) {
        register.setId(id);
        return registerRepository.save(register);
    }

    public List<Register> getAllRegisters() {
        return registerRepository.findAll();
    }

    public Optional<Register> getRegisterById(Long id) {
        return registerRepository.findById(id);
    }

    public void deleteRegister(Long id) {
        registerRepository.deleteById(id);
    }
}