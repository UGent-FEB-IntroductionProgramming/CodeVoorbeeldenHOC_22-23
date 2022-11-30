/*
 * Copyright (c) 2019. All rights reserved.
 *
 * @author Pieter De Clercq <piedcler.declercq@ugent.be>
 */

import java.util.Objects;

/**
 * A player in a soccer team.
 */
public class SoccerPlayer implements Comparable<SoccerPlayer> {
    /**
     * The position a player can play on the pitch.
     */
    public enum Position {
        GK /* Goalkeeper */,
        DF /* Defender */,
        MF /* Midfield */,
        FW /* Forward */
    }

    private final int age;

    private final String firstname;
    private final String lastname;

    private final Position position;

    /**
     * SoccerPlayer constructor.
     *
     * @param firstName the first name of the player
     * @param lastName  the last name of the player
     * @param age       the player's age
     * @param position  the position on the pitch
     */
    public SoccerPlayer(final String firstName,
                        final String lastName,
                        final int age,
                        final Position position) {
        this.age = age;
        this.firstname = firstName;
        this.lastname = lastName;
        this.position = position;
    }

    @Override
    public int compareTo(final SoccerPlayer other) {
        return this.getName().compareToIgnoreCase(other.getName());
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) other;
        return this.age == that.age &&
                this.firstname.equals(that.firstname) &&
                this.lastname.equals(that.lastname) &&
                this.position == that.position;
    }

    /**
     * Gets the age of the player.
     *
     * @return the age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets the full name of the player.
     *
     * @return the full name
     */
    public String getName() {
        return String.format("%s %s", this.firstname, this.lastname);
    }

    /**
     * Gets the position of the player.
     *
     * @return the position
     */
    public Position getPosition() {
        return this.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.firstname, this.lastname,
                this.position
        );
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
