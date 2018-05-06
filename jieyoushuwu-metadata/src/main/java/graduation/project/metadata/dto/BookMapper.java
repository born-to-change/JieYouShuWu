package graduation.project.metadata.dto;

import graduation.project.metadata.model.Book;

import java.util.List;

public interface BookMapper {
    List<Book> getBooksByUserId(String userId, String tenantId);

    List<Book> getBooksBySearchKey(String key,String tenantId);

    Book createBook(Book book);

    Book updateBook(Book book);

    boolean deletdBook(String bookId,String tenantId);

    List<String> getUserIdsByBookIds(List<String> bookIds,String tenantId);
}
