package com.hyperion.repository;

import com.hyperion.dto.ProfilerDTO;
/*import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;*/
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
//@Document(collection = "profiler" )
public interface ProfilerRepo{//} extends JpaRepository<ProfilerDTO,String> {
}
