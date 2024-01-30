import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Java314Berkutov_lesson8_String {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    static void task1() throws IOException{
        FileReader fr = new FileReader("whatnews.txt", Charset.forName("WINDOWS-1251"));

        System.out.println(fr.getEncoding());
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine()) != null){
            System.out.printf("%s\n", line);
        }
    }

    static void task2(){
        final int WIDTH = 10;
        final int HEIGHT = 10;
        Cell[][] field = new Cell[WIDTH][HEIGHT];
        for(int x = 0; x < WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                field[x][y] = new Cell(x, y);
            }
        }
    }
}

class Cell{
    int x;
    int y;
    String state;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        this.state = "empty";

    }

    public void makeShoot(int x, int y){

    }
}
