package Support;

import java.util.ArrayList;

public class Type {


    private ArrayList<Type> counterList;
    private ArrayList<Type> antiCounterList;
    private String typeName;
    public Type(String typeName){
        this.typeName = typeName;
        counterList = new ArrayList<>();
        antiCounterList = new ArrayList<>();
    }

    public void setCounterList(Type ... objects){
        if(objects ==null){
            return;
        }
        for(Type t : objects){
            counterList.add(t);
        }
    }
    public void setAntiCounterList(Type ... objects){
        if(objects ==null){
            return;
        }
        for(Type t : objects){
            antiCounterList.add(t);
        }
    }
    public String getTypeName(){
        return typeName;
    }


    public int getRelation(Type t){

        if(counterList.contains(t)){
            return -1;
        }
        if(antiCounterList.contains(t)){
            return 1;
        }
        else{
            return 0;
        }
    }

}
