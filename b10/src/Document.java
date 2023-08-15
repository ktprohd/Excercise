import java.util.Scanner;

public class Document {
        private String content;

        public Document() {
            this.content = null;
        }

        public Document(String st) {
            this.content = st;
        }

        public int count() {
            if (content.isEmpty()) {
                return 0;
            }

            String[] words = content.split("\\s+");
            return words.length;
        }

        public int countA() {
            int count = 0;
            for (char c : content.toCharArray()) {
                if (c == 'A' || c == 'a') {
                    count++;
                }
            }
            return count;
        }

        public void chuanHoaVanBan() {
            content = content.trim();
            content = content.replaceAll("\\s+", " ");
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String content = scanner.nextLine();
            Document document = new Document(content);
            System.out.println("Original content: " + document.getContent());

            int numberOfWords = document.count();
            System.out.println("Number of words: " + numberOfWords);

            int numberOfA = document.countA();
            System.out.println("Number of 'A' characters: " + numberOfA);

            document.chuanHoaVanBan();
            System.out.println("Normalized content: " + document.getContent());
        }
    }

