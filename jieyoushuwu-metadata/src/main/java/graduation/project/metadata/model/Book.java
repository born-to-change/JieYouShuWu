package graduation.project.metadata.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book {

    // image price description book_name book_press user_label telephone book_store
    String price;
    String description;
    @NonNull
    String bookId;
    @NonNull
    String bookName;
    @NonNull
    String bookPress;
    String userLabel;
    String telephone;
    String storeId;
    @NonNull
    String userId;
}
