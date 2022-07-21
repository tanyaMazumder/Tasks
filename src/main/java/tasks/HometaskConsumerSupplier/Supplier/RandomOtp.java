package tasks.HometaskConsumerSupplier.Supplier;


import java.util.Random;
import java.util.function.Supplier;

public class RandomOtp {
    public static Supplier<String> genrateOTP(final int lengthOfOTP) {
        return () -> {
            StringBuilder otp = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < lengthOfOTP; i++) {

                // returns pseudo-random value between 0 and 9
                int randomNumber = random.nextInt(9);
                otp.append(randomNumber);
            }
            return otp.toString();
        };
    }
    public static void main(String[] args) {
        System.out.println("OTP: " + genrateOTP(4).get());
    }
}
