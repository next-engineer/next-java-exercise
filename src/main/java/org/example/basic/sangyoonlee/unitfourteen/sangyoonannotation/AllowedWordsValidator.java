package org.example.basic.sangyoonlee.unitfourteen.sangyoonannotation;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;

public class AllowedWordsValidator {

    public static boolean validate(Object obj) {
        return Arrays.stream(obj.getClass().getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(AllowedWords.class))
                .allMatch(field -> validateField(obj, field));
    }

    private static boolean validateField(Object obj, Field field) {
        Optional<String> valueOpt = extractStringValue(obj, field);
        String[] allowedWords = getAllowedWords(field);

        if (valueOpt.isPresent() && !isAllowed(valueOpt.get(), allowedWords)) {
            printWarning(allowedWords);
            return false;
        }

        return true;
    }

    private static Optional<String> extractStringValue(Object obj, Field field) {
        field.setAccessible(true);
        try {
            Object value = field.get(obj);
            return (value instanceof String str) ? Optional.of(str) : Optional.empty();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    private static String[] getAllowedWords(Field field) {
        return field.getAnnotation(AllowedWords.class).value();
    }

    private static boolean isAllowed(String value, String[] allowedWords) {
        return Arrays.asList(allowedWords).contains(value);
    }

    private static void printWarning(String[] allowedWords) {
        System.out.println(String.join(", ", allowedWords) + "만 입력 가능합니다.");
    }
}
