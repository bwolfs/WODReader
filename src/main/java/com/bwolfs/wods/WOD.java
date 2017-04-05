package com.bwolfs.wods;

import com.bwolfs.exercises.Exercise;
import com.bwolfs.workouttypes.WorkOutType;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by BartWolfs on 05/04/2017.
 */
public class WOD {
    private String name;
    private Date date;
    private WorkOutType workOutType;
    private String crossfitBox;
    private String designedBy;
    private ArrayList<Exercise> exercises;

    public WOD(String name, Date date, WorkOutType workOutType, String crossfitBox, String designedBy){
        this.name = name;
        this.date = date;
        this.workOutType = workOutType;
        this.crossfitBox = crossfitBox;
        this.designedBy = designedBy;
    }

    public void addExercise(Exercise exercise){
        this.exercises.add(exercise);
    }

    public ArrayList<Exercise> getExercises(){
        return exercises;
    }

    public void setWorkOutType(WorkOutType workOutType){
        this.workOutType = workOutType;
    }
}
