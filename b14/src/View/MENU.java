package View;

public enum MENU {
    ADD,
    SHOW,
    CHECK,
    EXIT;
    public static MENU getEnumMenu(int ordinal){
        for (MENU menu : MENU.values()){
            if (menu.ordinal() == (ordinal - 1))
                return menu;
        }
        throw new RuntimeException();
    }

}
