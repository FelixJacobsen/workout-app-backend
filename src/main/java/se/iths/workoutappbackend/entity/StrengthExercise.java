package se.iths.workoutappbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "strengthExercise")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StrengthExercise {
    @Id
    private String id;
    private String exerciseName;
    private String sets;
    private String weight;
}
