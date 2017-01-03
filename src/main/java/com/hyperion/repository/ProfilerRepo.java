package com.hyperion.repository;

import com.hyperion.dto.ProfilerDTO;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Document(collection = "profiler" )
public interface ProfilerRepo extends MongoRepository<ProfilerDTO,String> {
}
