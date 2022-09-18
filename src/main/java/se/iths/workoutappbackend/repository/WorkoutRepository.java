package se.iths.workoutappbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.iths.workoutappbackend.entity.Workout;

public interface WorkoutRepository extends MongoRepository<Workout, String> {}
