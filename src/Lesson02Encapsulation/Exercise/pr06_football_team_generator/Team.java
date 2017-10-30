package Lesson02Encapsulation.Exercise.pr06_football_team_generator;

import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, Player> players;
    private int rating;

    public Team(String name) {
        this.setName(name);
        this.players = new HashMap<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(Constants.INVALID_NAME);
        }
        this.name = name;
    }

    public int getRating() {
        return this.rating;
    }

    public void addPlayer(Player player) {
        this.players.put(player.getName(), player);
        this.updateRating();
    }

    public boolean removePlayer(String player) {
        return this.players.remove(player) != null;
    }

    private void updateRating() {
        this.rating = 0;
        for (Player player : this.players.values()) {
            this.rating += player.getOverallSkill();
        }
        this.rating /= this.players.size();
    }
}
