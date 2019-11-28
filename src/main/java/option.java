public enum option {
    Teacher, Admin;

    private option(){}

    public String value(){
        return name();
    }

    public static option fromvalue(String v){
        return valueOf(v);
    }
}
