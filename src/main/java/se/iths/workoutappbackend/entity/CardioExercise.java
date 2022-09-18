package se.iths.workoutappbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "cardioExercise")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardioExercise {
    @Id
    private String id;
    private CardioExerciseType exerciseType;
    private String exerciseName;
    private String duration;
    private String distance;
}
