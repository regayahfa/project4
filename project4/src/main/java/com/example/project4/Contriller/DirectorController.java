package com.example.project4.Contriller;

import com.example.project4.MODEL.Director;
import com.example.project4.sirvecs.DirctorSirvis;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dirctor")
@RequiredArgsConstructor
public class DirectorController {
    private  final DirctorSirvis  dirctorSirvis;

    @GetMapping("/get")
    public ResponseEntity getAlldirctor() {
        List<Director> directorList = dirctorSirvis.getAlldirctor();
        return ResponseEntity.status(200).body("saccses");
    }
    @PostMapping("/add")
    public ResponseEntity adddirctor(@Valid @RequestBody Director director) {
        dirctorSirvis.adddirector(director);
        return ResponseEntity.status(200).body("DIRCTOR added");
    }
    @PostMapping("/Update")
    public ResponseEntity updatedirctor(@PathVariable Integer ID, @Valid @RequestBody Director director) {
        boolean isupdated = dirctorSirvis.deleteDIRCTOR(ID,director);
        return ResponseEntity.status(200).body("updated");
    }

    @DeleteMapping("/delete/{ID}")
    public ResponseEntity deletedirctor(@PathVariable Integer ID) {
       Director director=dirctorSirvis.deleteDIRCTOR(ID);
        return ResponseEntity.status(200).body("GREAT");
    }

}
