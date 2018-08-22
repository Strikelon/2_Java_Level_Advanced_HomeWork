package hm2_1;

public class Team {

    private Sportsman[] members = new Sportsman[4];

    public Team(Sportsman first, Sportsman second, Sportsman third, Sportsman fourth){

        this.members[0]=first;
        this.members[1]=second;
        this.members[2]=third;
        this.members[3]=fourth;

    }

    public Sportsman[] getTeam(){
        return members;
    }

    public void showResults(){

        for(int i=0;i<members.length;i++){

            System.out.println("Участник: "+members[i].getName());
            System.out.println("Может пробежать (метры): "+members[i].getRun());
            System.out.println("Может проплыть (метры): "+members[i].getSwim());
            System.out.println("Может перепрыгивать препятствия в высоту (метры): "+members[i].getJumpHeight());
            System.out.println("Может перепрыгивать препятствия в длину (метры): "+members[i].getJumpLength());
            System.out.println("Прошел ли участник дистанцию:"+members[i].isDistance());
            System.out.println("-----------------------------------------------------");

        }

    }

    public void showResults(boolean result){   //(true или false)можно показывать участников, которые прошли или не прошли дистанцию

        for(int i=0;i<members.length;i++){

            if(members[i].isDistance()==result){

            System.out.println("Участник: "+members[i].getName());
            System.out.println("Может пробежать (метры): "+members[i].getRun());
            System.out.println("Может проплыть (метры): "+members[i].getSwim());
            System.out.println("Может перепрыгивать препятствия в высоту (метры): "+members[i].getJumpHeight());
            System.out.println("Может перепрыгивать препятствия в длину (метры): "+members[i].getJumpLength());
            System.out.println("Прошел ли участник дистанцию:"+members[i].isDistance());
            System.out.println("-----------------------------------------------------");

            }

        }

    }


}
