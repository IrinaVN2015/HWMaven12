package ru.netology;

public class Manager {


    int limit = 5;
    public PosterItem[] items = new PosterItem[0];

    public Manager() {
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int newLimit) {
        if (newLimit < 0) {
            return;
        }
        if (newLimit > items.length) {
            return;
        }
        this.limit = newLimit;
    }

    public PosterItem[] getItems() {
        return items;
    }

    public void addFilm(PosterItem item) {
        PosterItem[] temporary = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            temporary[i] = items[i];
        }
        temporary[temporary.length - 1] = item;
        items = temporary;
    }

    public PosterItem[] findAll() {
        return getItems();
    }

    public PosterItem[] findLast() {
        PosterItem[] all = findAll();
        PosterItem[] reversed = new PosterItem[all.length];
        int resultLength = items.length;
        if (all.length > limit) {
            resultLength = getLimit();
        } else {
            resultLength = items.length;
        }
        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = all[all.length - 1 - i];
            items = result;
        }
        return result;
    }
}
