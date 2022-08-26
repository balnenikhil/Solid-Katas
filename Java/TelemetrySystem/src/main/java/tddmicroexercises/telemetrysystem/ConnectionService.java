package tddmicroexercises.telemetrysystem;

public interface ConnectionService {

    public boolean getOnlineStatus();

    public void connect(String telemetryServerConnectionString);

    public void disconnect();
}
