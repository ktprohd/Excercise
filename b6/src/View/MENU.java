package View;

public enum MENU {
        ADD_STU,
        SHOW_20,
        COUT_23;
        public static MENU getEnumMENU(int ordinal){
            for(MENU abc: MENU.values()){
                if(abc.ordinal()==(ordinal-1))
                    return abc;
            }
            throw new RuntimeException();
        }

    }

