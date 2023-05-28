package com.example.project4.sirvecs;

import com.example.project4.ApiException.ApiExption;
import com.example.project4.MODEL.Director;
import com.example.project4.Repostry.DirctorRepostry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DirctorSirvis {
    private  final DirctorRepostry dirctorRepostry;
    public List<Director> getAlldirctor(){
        return dirctorRepostry.findAll();
    }
    public void addCoffee(Director director){
        dirctorRepostry.save( director);
    }
    public Boolean updateCoffee(Integer ID, Director director) {
        Director director1 = dirctorRepostry.save(ID,director);
        if (director1 == null) {
            return false;
        }
        director1.setName(director.getName());
        dirctorRepostry.save(director);
        return true;
    }
    public Director deleteDIRCTOR(Integer id ) {
        Director director=dirctorRepostry.deleteAll();
        if (director == null) {
            throw new ApiExption("try agien");
        }
        return director;
    }


}
