import java.util.HashSet;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // generates 6-digit OTP
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        if (areOTPsUnique(otps)) {
            System.out.println("✅ All OTPs are unique.");
        } else {
            System.out.println("❌ Duplicate OTPs found.");
        }
    }
}
