package SystemDesignTut;


import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

public class LogAggregation_UserRetention_Grouping_FilteringProblem {

    public static void main(String[] args) {

        // Create sample log data (Day 1 + Day 2)
        List<LogEntry> logs = Arrays.asList(

                // Day 1 - 2025-08-22
                new LogEntry(LocalDate.parse("2025-08-22"), "p1", "c1"),
                new LogEntry(LocalDate.parse("2025-08-22"), "p2", "c2"),
                new LogEntry(LocalDate.parse("2025-08-22"), "p3", "c1"),
                new LogEntry(LocalDate.parse("2025-08-22"), "p1", "c1"),
                new LogEntry(LocalDate.parse("2025-08-22"), "p2", "c2"),

                // Day 2 - 2025-08-21
                new LogEntry(LocalDate.parse("2025-08-21"), "p1", "c1"),
                new LogEntry(LocalDate.parse("2025-08-21"), "p2", "c2"),
                new LogEntry(LocalDate.parse("2025-08-21"), "p2", "c1"),
                new LogEntry(LocalDate.parse("2025-08-21"), "p1", "c1"),
                new LogEntry(LocalDate.parse("2025-08-21"), "p2", "c2")
        );

        Map<String, Set<String>> customerPages = new HashMap<>();
        Map<String, Set<LocalDate>> customerDays = new HashMap<>();

        for (LogEntry entry : logs) {

            Function<String, Set<String>> function1 = new Function<>() {
                @Override
                public Set<String> apply(String s) {
                    return new HashSet<>();
                }
            };

            customerPages.computeIfAbsent(entry.getCustomerId(), function1).
                    add(entry.getPageId());

            customerDays.computeIfAbsent(entry.getCustomerId(), k -> new HashSet<>()).
                    add(entry.getTimestamp());
        }

        List<String> loyalCustomers = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : customerPages.entrySet()) {

            String customer = entry.getKey();
            Set<String> pages = entry.getValue();

            Set<LocalDate> days = customerDays.get(customer);

            if (days.size() >= 2 && pages.size() >= 2) {
                loyalCustomers.add(customer);
            }
        }

        System.out.println("Loyal Customers: " + loyalCustomers);
    }
}


class LogEntry {

    private LocalDate timestamp;
    private String pageId;
    private String customerId;

    public LogEntry() {
    }

    public LogEntry(LocalDate timestamp, String pageId, String customerId) {
        this.timestamp = timestamp;
        this.pageId = pageId;
        this.customerId = customerId;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "timestamp=" + timestamp +
                ", pageId='" + pageId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}