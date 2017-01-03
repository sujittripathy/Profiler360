package com.hyperion.controller;

import com.hyperion.dto.ProfilerDTO;
import com.hyperion.dto.ProfilerResponse;
import com.hyperion.services.ProfilerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfilerRestController {

    @Autowired
    private ProfilerServices profilerServices;

    @Autowired
    private ProfilerResponse profilerResponse;

    @PostMapping(value = "/addProfile",
                produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://127.0.0.1:3000")
    public ResponseEntity<?> addProfile(@RequestBody ProfilerDTO profilerDTOParam){
        System.out.println("Request Data :: "+profilerDTOParam);
        String id = profilerServices.addProfile(profilerDTOParam);
        profilerResponse.setHttpStatusCode(HttpStatus.OK.value());
        profilerResponse.setApplicationData(id);
        profilerResponse.setMessage("User profile added successfully");
        return new ResponseEntity<>(profilerResponse,HttpStatus.OK);
    }

    @GetMapping("/getAllProfiles")
    @CrossOrigin(origins = "http://127.0.0.1:3000")
    public ResponseEntity<?> fetchAllProfiles(){
        List<ProfilerDTO> responseData = profilerServices.getAllProfiles();
        return new ResponseEntity<>(responseData,HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://127.0.0.1:3000")
    public ResponseEntity<?> deleteProfile(@PathVariable String id){
        System.out.println("Delete ID : "+id);
        profilerServices.deleteProfile(id);
        profilerResponse.setHttpStatusCode(HttpStatus.OK.value());
        profilerResponse.setApplicationData(id);
        profilerResponse.setMessage("User profile deleted successfully.");
        return  new ResponseEntity<>(profilerResponse,HttpStatus.OK);
    }
}
