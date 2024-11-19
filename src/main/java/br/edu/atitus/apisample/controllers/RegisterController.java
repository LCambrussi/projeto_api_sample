package br.edu.atitus.apisample.controllers;

import br.edu.atitus.apisample.models.Register;
import br.edu.atitus.apisample.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registers")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping
    public ResponseEntity<Register> createRegister(@RequestBody Register register) {
        Register createdRegister = registerService.createRegister(register);
        return ResponseEntity.ok(createdRegister);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Register> updateRegister(@PathVariable Long id, @RequestBody Register register) {
        Register updatedRegister = registerService.updateRegister(id, register);
        return ResponseEntity.ok(updatedRegister);
    }

    @GetMapping
    public List<Register> getAllRegisters() {
        return registerService.getAllRegisters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Register> getRegisterById(@PathVariable Long id) {
        return registerService.getRegisterById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegister(@PathVariable Long id) {
        registerService.deleteRegister(id);
        return ResponseEntity.noContent().build();
    }
}