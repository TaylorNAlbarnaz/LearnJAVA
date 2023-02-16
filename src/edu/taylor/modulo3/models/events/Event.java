package edu.taylor.modulo3.models.events;

public abstract class Event {
    private String description;
    private EventDirection direction;
    private int chosen = 0;

    private String option1 = null;
    private String option2 = null;
    private String option3 = null;

    public EventDirection getDirection() {
        return direction;
    }

    protected String getDirectional() {
        switch (getDirection()) {
            case Front:
                return "in front of you";
            case Left:
                return "to your left";
            case Right:
                return "to your right";
            case Behind:
                return "behind you";
            default:
                return "";
        }
    }

    public void initialize() { }
    public void act() { }

    public String getDescription() {
        return description;
    }

    public int getChosen() {
        return chosen;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }
    
    public String getOption3() {
        return option3;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public void setChosen(int chosen) {
        this.chosen = chosen;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
}
