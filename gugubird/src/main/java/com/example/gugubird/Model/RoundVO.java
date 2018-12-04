package com.example.gugubird.Model;

import java.util.List;

public class RoundVO {
    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }

    public List<SeminarVO> getList() {
        return list;
    }

    public void setList(List<SeminarVO> list) {
        this.list = list;
    }

    Integer roundId;
    String roundName;
    List<SeminarVO> list;

}
