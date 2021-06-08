import java.io.IOException;

class Recordrunnner{

    public static void main(String[] args) throws IOException {
        Record c = new Record();

        c.readFile();
        c.WriteFile();

    }
}