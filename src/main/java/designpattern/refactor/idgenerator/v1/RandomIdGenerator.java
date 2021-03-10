package designpattern.refactor.idgenerator.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.annotations.VisibleForTesting;

/**
 * @author fengsy
 * @date 3/6/21
 * @Description
 */
/**
 * Id Generator that is used to generate random IDs.
 *
 * <p>
 * The IDs generated by this class are not absolutely unique, but the probability of duplication is very low.
 */
public class RandomIdGenerator implements LogTraceIdGenerator {
    private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator.class);

    /**
     * Generate the random ID. The IDs may be duplicated only in extreme situation.
     *
     * @return an random ID
     */
    @Override
    public String generate() throws IdGenerationFailureException {
        String substrOfHostName = null;
        try {
            substrOfHostName = getLastfieldOfHostName();
        } catch (UnknownHostException e) {
            throw new IdGenerationFailureException("host name is empty.");
        }
        long currentTimeMillis = System.currentTimeMillis();
        String randomString = generateRandomAlphameric(8);
        String id = String.format("%s-%d-%s", substrOfHostName, currentTimeMillis, randomString);
        return id;
    }

    /**
     * Get the local hostname and extract the last field of the name string splitted by delimiter '.'.
     *
     * @return the last field of hostname. Returns null if hostname is not obtained.
     */
    private String getLastfieldOfHostName() throws UnknownHostException {
        String substrOfHostName = null;
        String hostName = InetAddress.getLocalHost().getHostName();
        if (hostName == null || hostName.isEmpty()) {
            // 此处做判断
            throw new UnknownHostException("...");
        }
        substrOfHostName = getLastSubstrSplittedByDot(hostName);

        return substrOfHostName;
    }

    /**
     * Get the last field of {@hostName} splitted by delemiter '.'.
     *
     * @param hostName
     *            should not be null
     * @return the last field of {@hostName}. Returns empty string if {@hostName} is empty string.
     */
    @VisibleForTesting
    protected String getLastSubstrSplittedByDot(String hostName) {
        if (hostName == null || hostName.isEmpty()) {
            // 运行时异常
            throw new IllegalArgumentException("");
        }
        String[] tokens = hostName.split("\\.");
        String substrOfHostName = tokens[tokens.length - 1];
        return substrOfHostName;
    }

    /**
     * Generate random string which only contains digits, uppercase letters and lowercase letters.
     *
     * @param length
     *            should not be less than 0
     * @return the random string. Returns empty string if {@length} is 0
     */
    @VisibleForTesting
    protected String generateRandomAlphameric(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("...");
        }
        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length) {
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit = randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase = randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowercase = randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit || isUppercase || isLowercase) {
                randomChars[count] = (char)(randomAscii);
                ++count;
            }
        }
        return new String(randomChars);
    }
}
