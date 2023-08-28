package exercise.codility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkingFreeCalculator {

    private  static final int ENTRANCE_FEE = 2;
    private static final int FIRST_FULL_PARTIAL_HR_FEE = 3;
    private static final int AFTER_FIRST_HR_FEE = 4;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:MM");

    public static int calculateParkingFee(String enter, String leave) {

        try {
            Date entryTime = sdf.parse(enter);
            Date leaveTime = sdf.parse(leave);

            // should use patter matching for checking if the time format is collect before proceeding

            int diffInTime = (int)leaveTime.getTime() - (int)entryTime.getTime();
            int diffInHr = (diffInTime / (1000 * 60 * 60)) % 24;
            int diffInMinute = (diffInTime / (1000 * 60)) % 60;

            int fee = 0;

            if ((diffInHr == 0 && diffInMinute >= 1) || (diffInHr == 1 && diffInMinute == 0)) {
                fee = ENTRANCE_FEE + FIRST_FULL_PARTIAL_HR_FEE;
            }
            if (diffInHr == 1 && diffInMinute > 0) {
                fee = ENTRANCE_FEE + FIRST_FULL_PARTIAL_HR_FEE + AFTER_FIRST_HR_FEE;
            }
            if (diffInHr > 1 && diffInMinute >= 0) {
                if (diffInMinute > 0) {
                    diffInHr = diffInHr + 1;
                }
                fee = ENTRANCE_FEE + FIRST_FULL_PARTIAL_HR_FEE;
                fee = fee + ((diffInHr - 1) * AFTER_FIRST_HR_FEE);
            }
            return fee;

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return -1;
    }

    public static void main(final String[] args) {

        System.out.println(calculateParkingFee("09:42", "13:42"));
    }
}
