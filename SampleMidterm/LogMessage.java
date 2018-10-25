package SampleMidterm;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
//        String[] messages = message.split(":");
//        this.machineId = messages[0];
//        this.description = messages[1];

        int index = message.indexOf(":");
        this.machineId = message.substring(0, index);
        this.description = message.substring(index + 1);
    }

    public boolean containsWord(String keyword) {
        if (this.description.equals(keyword)) {
            return true;
        }
        if (this.description.startsWith(keyword)) {
            return true;
        }
        if (this.description.indexOf(" " + keyword + " ") != -1) {
            return true;
        }
        if (this.description.endsWith(" " + keyword)) {
            return true;
        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }

}
