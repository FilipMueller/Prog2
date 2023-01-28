//package Lektion16.Stack;
//
//@SuppressWarnings("all")
//public class Stack extends ArrayList {
//
//    public void addLast(int y) {
//        if(checkIfIntegerIsUnique(y)){
//            return;
//        }
//
//        Item currentItem = head;
//        if (head == null) {
//            head = new Item(y);
//        } else {
//            while (currentItem.next != null) {
//                currentItem = currentItem.next;
//            }
//            currentItem.next = new Item(y);
//        }
//    }
//
//    public Integer removeLast() {
//        if (head == null) {
//            return null;
//        }
//
//        Item currentItem = head;
//        Item tempItem = head;
//
//        while (currentItem.next != null) {
//            tempItem = currentItem;
//            currentItem = currentItem.next;
//        }
//
//        tempItem.next = null;
//        return currentItem.data;
//    }
//}
