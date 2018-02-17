package io.mikaila.polls.dto;

public class OptionCount {
    private Long optionId;
    private int count;

//    public OptionCount(){
//
//    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
