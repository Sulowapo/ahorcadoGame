
import java.util.ArrayList;
import java.util.List;

public class EventLayer {

    private List<ConnectionListener> connectionListeners = new ArrayList<>();
    private List<SerializedObjectListener> serializedObjectListeners = new ArrayList<>();
    private List<MessageListener> messageListeners = new ArrayList<>();
    private List<CharacterListener> characterListeners = new ArrayList<>();
    private List<ConnectionLostListener> connectionLostListeners = new ArrayList<>();

    public interface ConnectionListener {

        void onConnection();
    }

    public interface SerializedObjectListener {

        void onSerializedObject(Object serializedObject);
    }

    public interface MessageListener {

        void onMessageReceived(String message);
    }

    public interface CharacterListener {

        void onCharacterSent(char character);
    }

    public interface ConnectionLostListener {

        void onConnectionLost();
    }

    public void addConnectionListener(ConnectionListener listener) {
        connectionListeners.add(listener);
    }

    public void removeConnectionListener(ConnectionListener listener) {
        connectionListeners.remove(listener);
    }

    public void fireConnectionEvent() {
        for (ConnectionListener listener : connectionListeners) {
            listener.onConnection();
        }
    }

    public void addSerializedObjectListener(SerializedObjectListener listener) {
        serializedObjectListeners.add(listener);
    }

    public void removeSerializedObjectListener(SerializedObjectListener listener) {
        serializedObjectListeners.remove(listener);
    }

    public void fireSerializedObjectEvent(Object serializedObject) {
        for (SerializedObjectListener listener : serializedObjectListeners) {
            listener.onSerializedObject(serializedObject);
        }
    }

    public void addMessageListener(MessageListener listener) {
        messageListeners.add(listener);
    }

    public void removeMessageListener(MessageListener listener) {
        messageListeners.remove(listener);
    }

    public void fireMessageEvent(String message) {
        for (MessageListener listener : messageListeners) {
            listener.onMessageReceived(message);
        }
    }

    public void addCharacterListener(CharacterListener listener) {
        characterListeners.add(listener);
    }

    public void removeCharacterListener(CharacterListener listener) {
        characterListeners.remove(listener);
    }

    public void fireCharacterEvent(char character) {
        for (CharacterListener listener : characterListeners) {
            listener.onCharacterSent(character);
        }
    }

    public void addConnectionLostListener(ConnectionLostListener listener) {
        connectionLostListeners.add(listener);
    }

    public void removeConnectionLostListener(ConnectionLostListener listener) {
        connectionLostListeners.remove(listener);
    }

    public void fireConnectionLostEvent() {
        for (ConnectionLostListener listener : connectionLostListeners) {
            listener.onConnectionLost();
        }
    }
}
