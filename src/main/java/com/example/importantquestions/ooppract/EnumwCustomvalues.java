package com.example.importantquestions.ooppract;
enum EnumSample{
    MONDAY(101,"1st day"),
    TUESDAY(102,"2nd day"),
    WEDNESDAY(103,"3rd day");
    private int value;
    private String comment;
    EnumSample(int value, String comment){
        this.value=value;
        this.comment=comment;
    }
    public static EnumSample getEnumSample(int value){
        for(EnumSample enumSample : EnumSample.values()){
            if(enumSample.value==value){
                return enumSample;
            }
        }
        return null;
    }
}

public class EnumwCustomvalues {
    public static void main(String[] args) {
        EnumSample enumSample = EnumSample.getEnumSample(10);
        System.out.println(enumSample);

    }
}
