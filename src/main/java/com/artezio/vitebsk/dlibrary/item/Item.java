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
    class ItemStates {
        int itemStateID;
        String itemStateName;

    }

    /**
     * Describes the Ref book of the Types (Book, eBook, etc.)
     */
    class ItemTypes {
        int itemTypeID;
        String itemTypeName;
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
