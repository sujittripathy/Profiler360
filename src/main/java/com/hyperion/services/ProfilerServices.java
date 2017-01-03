package com.hyperion.services;

import com.hyperion.dto.ProfilerDTO;
import com.hyperion.repository.ProfilerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilerServices {
    @Autowired
    private ProfilerRepo profilerRepo;

    public String addProfile(ProfilerDTO profilerDTO){
        return profilerRepo.save(profilerDTO).getId();
    }

    public List<ProfilerDTO> getAllProfiles(){
        return profilerRepo.findAll();
    }

    public void deleteProfile(String id){
        profilerRepo.delete(id);
    }
}
