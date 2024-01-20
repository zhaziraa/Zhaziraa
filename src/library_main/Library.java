//package library_main;
//
//public class Library {
//    Book availableBook;
//
//    void lendBook(Student student) {
//        if (availableBook != null && student.borrowedBook == null) {
//            student.borrowedBook = availableBook;
//            availableBook = null;
//        }
//        else {
//            System.out.println("Условие отрицательное");
//        }
//
//    }
//    void returnBook(Student student) {
//        if (availableBook == null && student.borrowedBook != null) {
//            availableBook = student.borrowedBook;
//            student.borrowedBook = null;
//        }
//
//    }
//}
