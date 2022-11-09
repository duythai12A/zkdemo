package tutorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Mail {
    private int index;
    private String subject;
    private String date;
    private int size;

    public Mail(int index, String subject, String date, int size) {
    }
}
