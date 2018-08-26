package java2.hm2_2;

public class Homework2 {

    public static int arrayStringSum(String[][] array) throws MyArraySizeException,MyArrayDataException{
        if((array.length!=4)||(array[0].length!=4)){
            throw new MyArraySizeException("Массив должен быть размеров 4х4");
        }

        int sum=0;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                try {
                    sum+=Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Данные нельзя преобразовать в int. Ошибка в ячейке: ",i,j);
                }
            }
        }

        return sum;

    }

    public static void main(String[] args){

        String[][] array = {{"1","2","3","4"},{"1","2","G","4"},{"1","2","3","4"},{"1","2","3","4"}};

        try {
            int sum=0;
            sum=arrayStringSum(array);
            System.out.println("Сумма всех элементов массива: "+sum);
        }catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e){
            System.out.println(e.getMessage()+e.getI()+" "+e.getJ());
        }

    }

}

class MyArraySizeException extends Exception{
    public MyArraySizeException(String message){
        super(message);
    }
}

class MyArrayDataException extends Exception{

    private int i;
    private int j;

    public MyArrayDataException(String message,int i,int j){
        super(message);
        this.i=i;
        this.j=j;
    }

    public int getI(){
        return this.i;
    }

    public int getJ(){
        return this.j;
    }

}
