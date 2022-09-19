package se.iths.workoutappbackend.WorkoutService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import se.iths.workoutappbackend.entity.Workout;
import se.iths.workoutappbackend.repository.WorkoutRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class WorkoutService {
    private final WorkoutRepository repository;

    public void addWorkout(Workout workout){
        try {
            repository.save(workout);
            log.info("Workout saved successfully");
        }catch (Exception e){
            log.info("Something went wrong when adding a workout. Error: " + e.getMessage());
        }
    }

    public void deleteWorkout(Workout workout,String id){
       repository.deleteById(workout.getId());
    }

}
