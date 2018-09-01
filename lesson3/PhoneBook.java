package java2.hm2_3;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {


    private HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public PhoneBook(){

    }

    public void add(String surname,String number){

        if(this.hashMap.containsKey(surname)){
            ArrayList<String> phones = hashMap.get(surname);
            phones.add(number);
            hashMap.put(surname,phones);
        }else {
            ArrayList<String> phone = new ArrayList<>();
            phone.add(number);
            hashMap.put(surname,phone);
        }
    }

    public ArrayList<String> get(String surname){

        ArrayList<String> phones= new ArrayList<>();

        if(this.hashMap.containsKey(surname)){
            phones=hashMap.get(surname);
        }else{
            phones= new ArrayList<>();
            phones.add("No phones for such Surname");
        }
        return phones;
    }


}
