package hm2_1;

public class Sportsman {   //класс для описания участника команды

    private String name; //Имя участника команды
    private double jumpHeight; // Значение показывает, какой высоты препятствие в метрах, может перепрыгнуть участник команды
    private double jumpLength; // Значение показывает, какой длины препятствие в метрах, может перепрыгнуть участник команды
    private double swim;  // Значение показывает, сколько метров может проплыть участник
    private double run; //Значение показывает, сколько метро может пробежать участник команды
    private boolean distance; //Значение показывает,прошел участник дистанцию или нет

    public Sportsman(String name,double run,double swim,double jumpHeight,double jumpLength){
        this.name=name;
        this.distance=false;
        this.run=run;
        this.swim=swim;
        this.jumpHeight=jumpHeight;
        this.jumpLength=jumpLength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getSwim() {
        return swim;
    }

    public void setSwim(double swim) {
        this.swim = swim;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }

    public boolean isDistance() {
        return distance;
    }

    public void setDistance(boolean distance) {
        this.distance = distance;
    }
}
