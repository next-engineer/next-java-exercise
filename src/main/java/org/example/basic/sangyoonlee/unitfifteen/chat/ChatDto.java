package org.example.basic.sangyoonlee.unitfifteen.chat;

import java.util.List;
import java.util.Map;

// 실습을 위해 Map을 사용, 실무에서는 Map을 쓰지 말고 DTO를 List로 감싸는 것을 추천
public record ChatDto(List<Map<String, String>> chatMessages) {
}
