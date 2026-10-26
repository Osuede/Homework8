package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Test helper: a fake channel that remembers every message instead of printing it.
 * Lets payment tests check WHAT was sent without caring HOW it is delivered.
 */
class RecordingChannel implements NotificationChannel {
    final List<String> messages = new ArrayList<>();

    @Override
    public void send(String message) {
        messages.add(message);
    }

    /** The last message sent, or "" if nothing was sent yet. */
    String lastMessage() {
        return messages.isEmpty() ? "" : messages.get(messages.size() - 1);
    }
}
