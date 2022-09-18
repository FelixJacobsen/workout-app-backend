package se.iths.workoutappbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "workouts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Workout {
    @Id
    private String id;
    private List<CardioExercise> cardioList;
    private List<StrengthExercise> strengthList;
    private String workoutName;
}
