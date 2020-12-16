package sample22;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Message {
	private int priority; // 0 - highest priority
	private String text;
}
