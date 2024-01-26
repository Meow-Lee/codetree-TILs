import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(stk.nextToken());
        int month = Integer.parseInt(stk.nextToken());
        int day = Integer.parseInt(stk.nextToken());

        boolean isValid = true;
        if (isLeapYear(year)) {
            if (month == 2) {
                if (day > 29) {
                    isValid = false;
                }
            } else {
                if (days[month - 1] < day) {
                    isValid = false;
                }
            }
        } else {
            if (days[month - 1] < day) {
                isValid = false;
            }
        }

        if (!isValid) {
            System.out.println(-1);
        } else {
            String s = getSeason(month);
            System.out.println(s);
        }
    }

    private static String getSeason(int month) {
        String season = "";
        if (month >= 3 && month <= 5) {
            season = "Spring";
        } else if (month >= 6 && month <= 8) {
            season = "Summer";
        } else if (month >= 9 && month <= 11) {
            season = "Fall";
        } else {
            season = "Winter";
        }

        return season;
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
}