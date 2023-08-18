package View;

public enum OLD {
    STUDENT,
    OLDSTUDENT;


    public static OLD getEnumOLD(int ordinal){
        for (OLD old : OLD.values()){
            if (old.ordinal() == (ordinal - 1))
                return old;
        }
        throw new RuntimeException();
    }

}
