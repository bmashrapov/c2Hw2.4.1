package Transport;

public class CantDiagnosisException extends Exception {
        public final Transport transport;
        public CantDiagnosisException(String message,Transport transport) {
            super ( message );
            this.transport=transport;
        }
    }

