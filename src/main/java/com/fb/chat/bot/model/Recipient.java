package com.fb.chat.bot.model;

public class Recipient {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Recipient{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
