public class SingletonMain {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Starting the application...");

        LoggerTest.runTests();
    }
}
