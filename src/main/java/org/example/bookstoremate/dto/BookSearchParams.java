package org.example.bookstoremate.dto;

public record BookSearchParams(String[] title, String[] author, String[] isbn) {
}
