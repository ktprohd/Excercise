package View;

public enum ABC {
    A,
    B,
    C;
    public static ABC getEnumABC(int ordinal){
for(ABC abc: ABC.values()){
if(abc.ordinal()==(ordinal-1))
    return abc;
}
        throw new RuntimeException();
    }

}
