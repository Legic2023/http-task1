import com.fasterxml.jackson.annotation.JsonProperty;

public class HttpData {
    private String id; //уникальный идентификатор записи
    private String text; //сообщение
    private String type; //тип животного
    private String user; //имя пользователя
    private int upvotes; //голоса

    public HttpData(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "id = " + id +
        "\n text = " + text +
        "\n type = " + type +
        "\n user = " + user +
        "\n upvotes = " + upvotes;
    }
}
