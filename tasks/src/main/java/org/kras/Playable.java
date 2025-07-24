package org.kras;

public interface Playable {
    default String play() {
        return "none";
    }
}
