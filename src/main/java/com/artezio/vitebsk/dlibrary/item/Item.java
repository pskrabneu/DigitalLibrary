package com.artezio.vitebsk.dlibrary.item;

/**
 * Created by pskrebnev on 29.11.2016.
 * Describes Item as a main entity in DB storage
 */
public class Item {

    private int itemID;

    /**
     * Describe the Ref book of possible States of the Item (Available, Borrowed, Transition etc.)
     */
    public enum ItemStates {
        AVAILABLE,
        BORROWED,
        TRANSITION;
    }

    /**
     * Describes the Ref book of the Types (Book, eBook, etc.)
     */
    public enum ItemTypes {
        BOOK,
        EBOOK;
    }

    /**
     * The Class describes the Ref Book topic's of the media Item (Java, Android, Angular, JPA etc.)
     */
    class ItemTopics {
        int itemTopicID;
        String itemTopicNameEng;
        String itemTopicNameRus;
    }
}
