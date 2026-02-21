import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        sha256("uiui@com");

    }

    public static String sha256(String value) {
        try {
            // 객체 생성
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            System.out.println("digest = " + digest);
            byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
            System.out.println("bytes = " + Arrays.toString(bytes));
            byte[] encoded = digest.digest(bytes);
            System.out.println("encoded = " + Arrays.toString(encoded));

            StringBuilder sb = new StringBuilder();
            for (byte b : encoded) {
                System.out.println("b = " + b);
                sb.append(String.format("%02x", b));
                System.out.println("sb = " + sb);
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 hashing error", e);
        }
    }

}