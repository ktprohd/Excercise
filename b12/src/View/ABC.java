package View;

public enum ABC {
    CAR,
    MOTOR,
    TRUCK,;
    public static ABC getEnumABC(int ordinal){
        for (ABC menu : ABC.values()){
            if (menu.ordinal() == (ordinal - 1))
                return menu;
        }
        throw new RuntimeException();
    }
}
