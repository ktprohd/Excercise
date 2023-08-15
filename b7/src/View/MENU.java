package View;

public enum MENU {
    ADD,
    DEL,
    CAL,
    EXIT;
    public static MENU getEnumMENU(int ordinal){
        for(MENU abc: MENU.values()){
            if(abc.ordinal()==(ordinal-1))
                return abc;
        }
        throw new RuntimeException();
    }
}
