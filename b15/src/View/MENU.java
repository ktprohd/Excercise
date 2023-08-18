package View;

public enum MENU {
    ADD,
    SHOW,
    ADD_RESULT,
    CHECK,
    GET_SCORE,
    COUT_STUDENT,
    HIGHEST_SCORE,
    SHOW_PLACE,
    MAX_SCORE,
    COUN_BY_SEMESTER,
    SORT,
    EXIT;
    public static MENU getEnumMenu(int ordinal){
        for (MENU menu : MENU.values()){
            if (menu.ordinal() == (ordinal - 1))
                return menu;
        }
        throw new RuntimeException();
    }

}
