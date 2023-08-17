package View;

public enum MENU {
    ADD,
    CHANGE,
    DEL,
    SHOW,
    SEARCH,
    CERTIFICATE,
    EXIT;
    public static MENU getEnumMenu(int ordinal){
        for (MENU menu : MENU.values()){
            if (menu.ordinal() == (ordinal - 1))
                return menu;
        }
        throw new RuntimeException();
    }

}
