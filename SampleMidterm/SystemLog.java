package SampleMidterm;

import java.util.ArrayList;
import java.util.List;

public class SystemLog {
    private List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> removed = new ArrayList<>();
        for (int i = 0; i < this.messageList.size(); i++) {
            if (this.messageList.get(i).containsWord(keyword)) {
                removed.add(this.messageList.remove(i));
                i--;
            }
        }
        return removed;
    }
}
