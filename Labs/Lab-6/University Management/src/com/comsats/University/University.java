package com.comsats.University;

import com.comsats.Campus.Campus;
import java.util.Arrays;

public class University {
    private String universityName;
    private Campus[] campuses;

    public University(String universityName, Campus[] campuses) {
        this.universityName = universityName;
        this.campuses = new Campus[campuses.length];

        for (int i = 0; i < campuses.length; i++) {
            this.campuses[i] = campuses[i];
        }
    }

@Override
public String toString() {
    return "University Name: " + universityName +
           "\nCampuses:\n" + Arrays.toString(campuses).replace(",", "").replace("[", "").replace("]", "");
}

}
