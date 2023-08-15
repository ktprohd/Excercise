package View;

public enum DOC1 {
    BOOK,
    JOURNAL,
    NEWSPAPER;
    public static DOC1 getEnumDocument(int ordinal){
        for (DOC1 doc1 : DOC1.values()){
            if (doc1.ordinal()==(ordinal-1))
                return doc1;
        }
        throw new RuntimeException();
    }
}
