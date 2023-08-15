package View;

public enum MENU {
    ADD,
    SHOW,
    SEARCH,
    EXIT;
    public static MENU getEnumMENU(int ordinal){
        for(MENU menu: MENU.values()){
            if(menu.ordinal()==(ordinal-1))
                return menu;
        }
        throw new RuntimeException();
    }

}
