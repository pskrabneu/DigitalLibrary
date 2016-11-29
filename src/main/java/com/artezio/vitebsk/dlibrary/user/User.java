package com.artezio.vitebsk.dlibrary.user;

import com.artezio.vitebsk.dlibrary.item.Item;

import java.util.HashMap;
import java.util.List;

/**
 * Created by pskrebnev on 29.11.2016.
 */
public class User {

    private int userUniqueID;
    private String userEncryptedPassword;
    private String userName;
    private HashMap<Integer, Boolean> userRoles;

    /**
     * Takes the list of changed roles from the web-form
     * and change them to the set of Roles
     * Integer -- ID of Role
     * Boolean -- changed state
     *
     * @param rightIDs
     */
    public void chadgeRights(HashMap<Integer, Boolean> rightIDs) {
        //TODO
    }

    /**
     * Add Item to the DB Strorage
     */
    public void addItem(Item item) {
        //TODO
    }

    /**
     * Delete Item from the DB Storage
     */
    public void deleteItem(int itemID) {
        //TODO
    }

    /**
     * Update Item in the DB Storage
     */
    public void updateItem(int itemID) {
        //TODO
    }

    /**
     * Hold/Reserve Item. It stops Item from the any actions from other users.
     * In case you reserve Item but not take it on your hands.
     */
    public void holdItem(int itemID) {
        //TODO
    }

    /**
     * Borrow Item. In case User takes an Item on hands.
     */
    public void borrowItem(int itemID) {
        //TODO
    }

    /**
     * Return Item. In case User return an Item into Library.
     */
    public void returnItem(int itemID) {
        //TODO
    }

    /**
     * Allows to keep line for particular book.
     */
    public void keepLineItem(int itemID) {
        //TODO
    }

    /**
     * Perform searching by Name of Item
     * @param s
     */
    public void searchItemByName(String s) {
        //TODO
    }

    /**
     * Perform searching by Author of Item
     */
    public void searchItemByAuthor(String s) {
        //TODO
    }

    /**
     * Perform searching by Topics of Item
     */
    public void searchItemByTopics(List<String> ls) {
        //TODO
    }

    /**
     * Perform searching by ISBN10 or ISBN13 of Item
     */
    public void searchItemByIsbn(String s) {
        //TODO
    }

    /**
     * Log all transformations to the DB
     */
    private void itemLogHistory(int itemID) {
        //TODO
    }

    /**
     * Describes the Role
     */
    class Role {
        private int roleID;
        private Boolean rightValid;
        private String roleName;
    }
}
