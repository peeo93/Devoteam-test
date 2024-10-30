package Util;

public class NoExitSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(java.security.Permission perm) {
        // Allow all permissions except System.exit
    }

    @Override
    public void checkExit(int status) {
        super.checkExit(status);
        throw new ExitException(status); // Custom exception to catch exit calls
    }

    // Custom exception to capture the exit status
    public static class ExitException extends SecurityException {
        private final int status;

        public ExitException(int status) {
            this.status = status;
        }

        public int getStatus() {
            return status;
        }
    }
}
