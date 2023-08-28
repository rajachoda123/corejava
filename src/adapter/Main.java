package designpatterns.adapter;

// Interface for the OldAudioPlayer
interface OldAudioPlayer {
    void playOldFormat();
}

// Concrete implementation of OldAudioPlayer
class ConcreteOldAudioPlayer implements OldAudioPlayer {
    @Override
    public void playOldFormat() {
        System.out.println("Playing old audio format...");
    }
}

// Interface for the NewAudioPlayer
interface NewAudioPlayer {
    void playNewFormat();
}

// Concrete implementation of NewAudioPlayer
class ConcreteNewAudioPlayer implements NewAudioPlayer {
    @Override
    public void playNewFormat() {
        System.out.println("Playing new audio format...");
    }
}

// Adapter class that implements the OldAudioPlayer interface but internally uses NewAudioPlayer
class NewToOldAudioPlayerAdapter implements OldAudioPlayer {
    private NewAudioPlayer newAudioPlayer;

    public NewToOldAudioPlayerAdapter(NewAudioPlayer newAudioPlayer) {
        this.newAudioPlayer = newAudioPlayer;
    }

    @Override
    public void playOldFormat() {
        // The adapter converts the old format call to the new format method
        newAudioPlayer.playNewFormat();
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the OldAudioPlayer with an Old format
        OldAudioPlayer oldPlayer = new ConcreteOldAudioPlayer();
        oldPlayer.playOldFormat();

        // Using the NewAudioPlayer with a New format
        NewAudioPlayer newPlayer = new ConcreteNewAudioPlayer();
        newPlayer.playNewFormat();

        // Using the OldAudioPlayer with the NewAudioPlayer adapter to play a New format
        OldAudioPlayer adapterPlayer = new NewToOldAudioPlayerAdapter(newPlayer);
        adapterPlayer.playOldFormat(); // This will internally call newPlayer.playNewFormat()
    }
}
