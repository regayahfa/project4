package com.example.project4.Repostry;

import com.example.project4.MODEL.Director;
import org.springframework.stereotype.Repository;

@Repository
public interface DirctorRepostry {
    void save(Director director);
}
