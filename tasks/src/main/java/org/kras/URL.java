package org.kras;

public record URL(Address<String, Integer> address, String value) {
}