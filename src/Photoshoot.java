public class Photoshoot {
    private String date;
    private Client client;
    private Photographer photographer;

    public Photoshoot(String date, Client client, Photographer photographer) {
        this.date = date;
        this.client = client;
        this.photographer = photographer;
    }

    public Client getClient() { return client; }
    public Photographer getPhotographer() { return photographer; }
    public String getDate() { return date; }
}