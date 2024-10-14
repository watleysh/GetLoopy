
public class GetLoopy {

    public static void main(String[] args) {
        //count up 0-30 by 1
        for (int cnt = 0; cnt <= 30; cnt++) {
            System.out.println(cnt);
        }

        //count down 30-0 by 1
        for (int cnt = 30; cnt >= 0; cnt--)
        {
            System.out.println(cnt);
        }

        //A loop that counts up by 3 from 0 to 18
        for (int cnt = 0; cnt <= 18; cnt=cnt +3)
        {
            System.out.println(cnt);
        }
        //A loop that counts down by 2 from 10 to 0

        for (int cnt = 10; cnt >= 0; cnt=cnt -2)
        {
            System.out.println(cnt);
        }
    }
}