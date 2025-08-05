package org.example.basic.parkminji.unitseventeen;

import org.example.basic.parkminji.unitseventeen.operations.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationRegistry {

    private final Map<OperatorType, Operation> registry = new HashMap<>();

    public OperationRegistry() {
        registry.put(OperatorType.ADD, new AddOperation());
        registry.put(OperatorType.SUB, new SubtractOperation());
        registry.put(OperatorType.MUL, new MultiplyOperation());
        registry.put(OperatorType.DIV, new DivideOperation());
    }

    public Operation getOperation(OperatorType type) {
        return Optional.ofNullable(registry.get(type))
                .orElseThrow(() -> new IllegalArgumentException("지원하지 않는 연산입니다: " + type));
    }
}
