package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _SupplierExample {
    public static void main(String[] args) {
        System.out.println(getAllApplicationProperties.get());
    }

    static Supplier<List<ApplicationProperties>> getAllApplicationProperties = () -> {
        //FM: Adding application properties
        return List.of(new ApplicationProperties("DbUrl", "A db url"), new ApplicationProperties("AppName", "FM App"));
    };

    static class ApplicationProperties {
        private final String key;
        private final String value;

        ApplicationProperties(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "ApplicationProperties{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
