package com.xcjaas.mediation.entity.encapsulation;

import java.util.List;

/**
 * Created by Administrator on 2018\2\7 0007.
 */
public class FinalResult {
    private int case_id;
    private List<String> results;

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "FinalResult{" +
                "case_id=" + case_id +
                ", results=" + results +
                '}';
    }
}
