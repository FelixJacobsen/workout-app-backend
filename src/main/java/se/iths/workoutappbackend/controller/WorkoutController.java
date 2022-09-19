package se.iths.workoutappbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import se.iths.workoutappbackend.WorkoutService.WorkoutService;
import se.iths.workoutappbackend.entity.Workout;

@RestController
@RequestMapping("/api/workouts")
@RequiredArgsConstructor
public class WorkoutController {

    private final WorkoutService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addWorkout(Workout workout){
        service.addWorkout(workout);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteWorkout(Workout workout, @PathVariable String id){
        service.deleteWorkout(workout,id);
    }

}
