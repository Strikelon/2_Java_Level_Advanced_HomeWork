package hm2_1;

public class Course {

    private double run;
    private double swim;
    private double jumpHeight;
    private double jumpLength;

    public Course(double run, double swim, double jumpHeight, double jumpLength){
        this.run=run;
        this.swim=swim;
        this.jumpHeight=jumpHeight;
        this.jumpLength=jumpLength;
    }

    public void doIt(Team team){
        for(int i=0;i<team.getTeam().length;i++){
            if ((this.run<=team.getTeam()[i].getRun())&&(this.swim<=team.getTeam()[i].getSwim())&&(this.jumpHeight<=team.getTeam()[i].getJumpHeight())&&(this.jumpLength<=team.getTeam()[i].getJumpLength())){
                team.getTeam()[i].setDistance(true);
            }
        }
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }

    public double getSwim() {
        return swim;
    }

    public void setSwim(double swim) {
        this.swim = swim;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public double getJumpLength() {
        return jumpLength;
    }

    public void setJumpLength(double jumpLength) {
        this.jumpLength = jumpLength;
    }
}
