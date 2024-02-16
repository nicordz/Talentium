package cohorte16.homeservice.controllers;

import cohorte16.homeservice.models.Professional;
import cohorte16.homeservice.services.impl.ProfessionalServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/professional")
@CrossOrigin("*")
public class ProfessionalController {
    @Autowired
    private ProfessionalServiceImpl professionalService;

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(professionalService.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error! Something went wrong");
        }
    }
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(professionalService.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error! Something went wrong");
        }
    }
    @PostMapping(consumes = "application/json",produces = "application/json")
    public ResponseEntity<?> save(@Valid @RequestBody Professional professional){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(professionalService.save(professional));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error! Something went wrong");
        }
    }
    @PutMapping(value = "/{id}", consumes = "application/json",produces = "application/json")
    public ResponseEntity<?> update(@Valid @PathVariable Long id, @RequestBody Professional professional){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(professionalService.update(id,professional));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error! Something went wrong");
        }
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(professionalService.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error! Something went wrong");
        }
    }




}
